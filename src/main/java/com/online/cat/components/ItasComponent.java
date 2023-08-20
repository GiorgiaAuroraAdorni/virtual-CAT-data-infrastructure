package com.online.cat.components;

import ch.idsia.crema.factor.bayesian.BayesianFactor;
import ch.idsia.crema.inference.InferenceJoined;
import ch.idsia.crema.inference.ve.FactorVariableElimination;
import ch.idsia.crema.inference.ve.order.MinFillOrdering;
import ch.idsia.crema.model.graphical.GraphicalModel;
import com.online.cat.helper.ItasModelProperties;
import com.online.cat.itas.Model;
import com.online.cat.models.Algorithm;
import com.online.cat.models.Result;
import com.online.cat.repository.AlgorithmsRepository;
import com.online.cat.repository.ResultsRepository;
import gnu.trove.map.hash.TIntIntHashMap;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;

import static com.online.cat.itas.Utils.questionName;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.badRequest;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class ItasComponent {
	
	private static final Logger logger = LoggerFactory.getLogger(ItasComponent.class);
	
	final InferenceJoined<GraphicalModel<BayesianFactor>, BayesianFactor> infVE;
	final int[] skills;
	Model model;
	ItasModelProperties catProperties;
	ResultsRepository resultsRepository;
	
	AlgorithmsRepository algorithmsRepository;
	
	public ItasComponent(ItasModelProperties catProperties, ResultsRepository resultsRepository,
	                     AlgorithmsRepository algorithmsRepository) throws IOException {
		this.resultsRepository = resultsRepository;
		this.algorithmsRepository = algorithmsRepository;
		this.catProperties = catProperties;
		model = Model.parse(catProperties.getModel().getPath());
		final MinFillOrdering mfo = new MinFillOrdering();
		int[] sequence = mfo.apply(model.model);
		infVE = new FactorVariableElimination<>(sequence);
		skills = model.skillIds();
	}
	
	private Mono<double[]> runModel(List<Result> results) {
		final TIntIntHashMap obs = new TIntIntHashMap();
		if (catProperties.getModel().isConstrained())
			for (Integer constraint : model.constraints)
				obs.put(constraint, 1);
		if (model.hasLeak)
			obs.put(model.leakVar, 1);
		
		for(var result: results){
			Algorithm algo = null;
			try {
				algo = algorithmsRepository
						.findById(result.getAlgorithmID())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty())
						.toFuture().get();
			} catch (InterruptedException | ExecutionException e) {
				logger.error(e.getMessage());
				continue;
			}
			if (algo == null) {
				continue;
			}
			int dimension = algo.getAlgorithmDimension();
			Boolean text = result.getText();
			Boolean blocks = result.getBlocks();
			boolean gesture = result.getGesture();
			boolean feedback = result.getVisualFeedback();
			Boolean complete = result.getComplete();
			final Map<String, Integer> answers = new LinkedHashMap<>();
			
			if (!complete) {
				for (int i = 1; i <= 12; i++) {
					answers.put(questionName(Math.toIntExact(result.getSchemaID()), i), 0);
				}
			} else if (dimension == 0 && feedback && gesture) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
			} else if (dimension == 0 && gesture) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 2), 1);
			} else if (dimension == 0 && feedback && (blocks || text)) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 2), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 3), 1);
			} else if (dimension == 0 && (blocks || text)) {
				for (int i = 1; i <= 4; i++) {
					answers.put(questionName(Math.toIntExact(result.getSchemaID()), i), 1);
				}
			} else if (dimension == 1 && feedback && gesture) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 5), 1);
			} else if (dimension == 1 && gesture) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 2), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 5), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 6), 1);
			} else if (dimension == 1 && feedback && (blocks || text)) {
				for (int i = 1; i <= 7; i++) {
					answers.put(questionName(Math.toIntExact(result.getSchemaID()), i), 1);
				}
			} else if (dimension == 1 && (blocks || text)) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 2), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 3), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 4), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 5), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 6), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 7), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 8), 1);
			} else if (dimension == 2 && feedback && gesture) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 5), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 9), 1);
			} else if (dimension == 2 && gesture) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 2), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 5), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 6), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 9), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 10), 1);
			} else if (dimension == 2 && feedback && (blocks || text)) {
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 1), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 2), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 3), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 5), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 6), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 7), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 9), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 10), 1);
				answers.put(questionName(Math.toIntExact(result.getSchemaID()), 11), 1);
			} else if (dimension == 2 && (blocks || text)) {
				for (int i = 1; i <= 12; i++) {
					answers.put(questionName(Math.toIntExact(result.getSchemaID()), i), 1);
				}
			}
			for(var q: answers.keySet()){
				if (!model.questionIds.contains(q))
					continue;
				final int i = model.nameToIdx.get(q);
				obs.put(i, answers.get(q));
			}
		}
		
		final int[] skills = model.skillIds();
		
		List<BayesianFactor> query = Arrays.stream(skills).mapToObj(s -> infVE.query(model.model, obs, s)).toList();
		final double[] outs = query.stream().map(x -> x.getValue(1)).mapToDouble(x -> x).toArray();
		logger.info(String.format("%3d: %s%n", results.get(0).getStudentID(), Arrays.toString(outs)));
		return Mono.just(outs);
	}
	
	static List<Double> arrayToList(final double[] array) {
		final List<Double> l = new ArrayList<>(array.length);
		
		for (final double s : array) {
			l.add(s);
		}
		return (l);
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getEvaluation(ServerRequest request) {
		return request
				.bodyToMono(StudentID.class)
				.flatMap(studentID -> resultsRepository.findAllByStudentID(studentID.id).collectList())
				.flatMap(results -> ok().contentType(APPLICATION_JSON).body(runModel(results), double[].class))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
	record StudentID(Long id) {
	}
}
