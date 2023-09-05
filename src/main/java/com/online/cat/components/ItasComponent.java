package com.online.cat.components;

import ch.idsia.crema.factor.bayesian.BayesianFactor;
import ch.idsia.crema.inference.InferenceJoined;
import ch.idsia.crema.inference.ve.FactorVariableElimination;
import ch.idsia.crema.inference.ve.order.MinFillOrdering;
import ch.idsia.crema.model.graphical.GraphicalModel;
import com.online.cat.helper.ItasModelProperties;
import com.online.cat.itas.Model;
import com.online.cat.models.Algorithm;
import com.online.cat.models.ITAS;
import com.online.cat.models.Result;
import com.online.cat.repository.AlgorithmsRepository;
import com.online.cat.repository.ITASRepository;
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
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
	ITASRepository itasRepository;
	
	public ItasComponent(ItasModelProperties catProperties, ResultsRepository resultsRepository,
	                     AlgorithmsRepository algorithmsRepository, ITASRepository itasRepository) throws IOException {
		this.resultsRepository = resultsRepository;
		this.algorithmsRepository = algorithmsRepository;
		this.itasRepository = itasRepository;
		this.catProperties = catProperties;
		model = Model.parse(catProperties.getModel().getPath());
		final MinFillOrdering mfo = new MinFillOrdering();
		int[] sequence = mfo.apply(model.model);
		infVE = new FactorVariableElimination<>(sequence);
		skills = model.skillIds();
	}
	
	private Mono<double[]> runModel(List<Result> results) {
		Long studentID = results.get(0).getStudentID();
		final TIntIntHashMap obs = new TIntIntHashMap();
		if (catProperties.getModel().isConstrained())
			for (Integer constraint : model.constraints)
				obs.put(constraint, 1);
		if (model.hasLeak)
			obs.put(model.leakVar, 1);
		
		for (var result : results) {
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
			int schema_id = Math.toIntExact(result.getSchemaID());
			
			answers.put(questionName(schema_id, 1), algo.getPaintdot() ? 1 : 0);
			
			answers.put(questionName(schema_id, 2), algo.getFillempty() ? 1 : 0);
			
			answers.put(questionName(schema_id, 3),
					algo.getPaintCustomPatternMonochromatic() ? 1 : 0);
			
			answers.put(questionName(schema_id, 4), (
					algo.getPaintleftmonochromatic() ||
							algo.getPaintrightmonochromatic() ||
							algo.getPaintupmonochromatic() ||
							algo.getPaintdownmonochromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 5), (
					algo.getPaintsquareupleftdownmonochromatic() ||
							algo.getPaintsquareuprightdownmonochromatic() ||
							algo.getPaintsquarerightdownleftmonochromatic() ||
							algo.getPaintsquarerightupleftmonochromatic() ||
							algo.getPaintsquareleftdownrightmonochromatic() ||
							algo.getPaintsquareleftuprightmonochromatic() ||
							algo.getPaintsquaredownleftupmonochromatic() ||
							algo.getPaintsquaredownrightupmonochromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 6), (
					algo.getPaintdiagonalupleftmonochromatic() ||
							algo.getPaintdiagonaluprightmonochromatic() ||
							algo.getPaintdiagonaldownleftmonochromatic() ||
							algo.getPaintdiagonaldownrightmonochromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 7), (
					algo.getPaintlupleftmonochromatic() ||
							algo.getPaintluprightmonochromatic() ||
							algo.getPaintldownleftmonochromatic() ||
							algo.getPaintldownrightmonochromatic() ||
							algo.getPaintlleftupmonochromatic() ||
							algo.getPaintlleftdownmonochromatic() ||
							algo.getPaintlrightupmonochromatic() ||
							algo.getPaintlrightdownmonochromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 8), (
					algo.getPaintzigzagleftupdownmonochromatic() ||
							algo.getPaintzigzagleftdownupmonochromatic() ||
							algo.getPaintzigzagrightupdownmonochromatic() ||
							algo.getPaintzigzagrightdownupmonochromatic() ||
							algo.getPaintzigzagupleftrightmonochromatic() ||
							algo.getPaintzigzaguprightleftmonochromatic() ||
							algo.getPaintzigzagdownleftrightmonochromatic() ||
							algo.getPaintzigzagdownrightleftmonochromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 9),
					algo.getPaintCustomPatternPolychromatic() ? 1 : 0);
			answers.put(questionName(schema_id, 10), (
					algo.getPaintleftpolychromatic() ||
							algo.getPaintrightpolychromatic() ||
							algo.getPaintuppolychromatic() ||
							algo.getPaintdownpolychromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 11), (
					algo.getPaintsquareupleftdownpolychromatic() ||
							algo.getPaintsquareuprightdownpolychromatic() ||
							algo.getPaintsquarerightdownleftpolychromatic() ||
							algo.getPaintsquarerightupleftpolychromatic() ||
							algo.getPaintsquareleftdownrightpolychromatic() ||
							algo.getPaintsquareleftuprightpolychromatic() ||
							algo.getPaintsquaredownleftuppolychromatic() ||
							algo.getPaintsquaredownrightuppolychromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 12), (
					algo.getPaintdiagonalupleftpolychromatic() ||
							algo.getPaintdiagonaluprightpolychromatic() ||
							algo.getPaintdiagonaldownleftpolychromatic() ||
							algo.getPaintdiagonaldownrightpolychromatic() ||
							algo.getPaintzigzagleftupdownpolychromatic() ||
							algo.getPaintzigzagleftdownuppolychromatic() ||
							algo.getPaintzigzagrightupdownpolychromatic() ||
							algo.getPaintzigzagrightdownuppolychromatic() ||
							algo.getPaintzigzagupleftrightpolychromatic() ||
							algo.getPaintzigzaguprightleftpolychromatic() ||
							algo.getPaintzigzagdownleftrightpolychromatic() ||
							algo.getPaintzigzagdownrightleftpolychromatic()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 13), (
					algo.getCopy() || algo.getRepeat()
			) ? 1 : 0);
			answers.put(questionName(schema_id, 14), (
					algo.getMirrorcrossvertical() ||
							algo.getMirrorcrosshorizontal() ||
							algo.getMirrorcellsvertical() ||
							algo.getMirrorcellshorizontal() ||
							algo.getMirrorcommandsvertical() ||
							algo.getMirrorcommandshorizontal()
			) ? 1 : 0);
			
			if (!complete) {
				for (int i = 15; i <= 26; i++) {
					answers.put(questionName(schema_id, i), 0);
				}
			} else if (dimension == 0 && feedback && gesture) {
				answers.put(questionName(schema_id, 15), 1);
			} else if (dimension == 0 && gesture) {
				answers.put(questionName(schema_id, 16), 1);
			} else if (dimension == 0 && feedback && (blocks || text)) {
				answers.put(questionName(schema_id, 17), 1);
			} else if (dimension == 0 && (blocks || text)) {
				answers.put(questionName(schema_id, 18), 1);
			} else if (dimension == 1 && feedback && gesture) {
				answers.put(questionName(schema_id, 19), 1);
			} else if (dimension == 1 && gesture) {
				answers.put(questionName(schema_id, 20), 1);
			} else if (dimension == 1 && feedback && (blocks || text)) {
				answers.put(questionName(schema_id, 21), 1);
			} else if (dimension == 1 && (blocks || text)) {
				answers.put(questionName(schema_id, 22), 1);
			} else if (dimension == 2 && feedback && gesture) {
				answers.put(questionName(schema_id, 23), 1);
			} else if (dimension == 2 && gesture) {
				answers.put(questionName(schema_id, 24), 1);
			} else if (dimension == 2 && feedback && (blocks || text)) {
				answers.put(questionName(schema_id, 25), 1);
			} else if (dimension == 2 && (blocks || text)) {
				answers.put(questionName(schema_id, 26), 1);
			}
			for (var q : answers.keySet()) {
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
		
		return itasRepository.save(new ITAS(studentID, outs)).then(Mono.just(outs));
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
