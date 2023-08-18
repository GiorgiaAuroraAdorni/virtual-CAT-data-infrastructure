package com.online.cat.components;

import ch.idsia.crema.factor.bayesian.BayesianFactor;
import ch.idsia.crema.inference.InferenceJoined;
import ch.idsia.crema.inference.ve.FactorVariableElimination;
import ch.idsia.crema.inference.ve.order.MinFillOrdering;
import ch.idsia.crema.model.graphical.GraphicalModel;
import com.online.cat.helper.ItasModelProperties;
import com.online.cat.itas.Model;
import com.online.cat.models.Result;
import com.online.cat.repository.ResultsRepository;
import gnu.trove.map.hash.TIntIntHashMap;
import lombok.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.badRequest;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class ItasComponent {
	
	final InferenceJoined<GraphicalModel<BayesianFactor>, BayesianFactor> infVE;
	Model model;
	
	ItasModelProperties catProperties;
	
	ResultsRepository resultsRepository;
	
	public ItasComponent(ItasModelProperties catProperties, ResultsRepository resultsRepository) throws IOException {
		this.resultsRepository = resultsRepository;
		this.catProperties = catProperties;
		model = Model.parse(catProperties.getModel().getPath());
		final MinFillOrdering mfo = new MinFillOrdering();
		int[] sequence = mfo.apply(model.model);
		infVE = new FactorVariableElimination<>(sequence);
		
	}
	
	private double[] runModel(List<Result> results) {
		final TIntIntHashMap obs = new TIntIntHashMap();
		if (catProperties.getModel().isConstrained())
			for (Integer constraint : model.constraints)
				obs.put(constraint, 1);
		if (model.hasLeak)
			obs.put(model.leakVar, 1);
		
		results.forEach(result -> {
		
		});
		
		final int[] skills = model.skillIds();
		
		List<BayesianFactor> query = Arrays.stream(skills).mapToObj(s -> infVE.query(model.model, obs, s)).toList();
		return query.stream().map(x -> x.getValue(1)).mapToDouble(x -> x).toArray();
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
