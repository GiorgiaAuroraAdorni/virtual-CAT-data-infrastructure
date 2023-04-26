package com.online.cat.components;

import com.online.cat.models.AlgorithmDTO;
import com.online.cat.repository.AlgorithmsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Component
@Transactional
public class AlgorithmComponent {
	private static final Logger logger = LoggerFactory.getLogger(AlgorithmComponent.class);
	AlgorithmsRepository algorithmsRepository;
	
	public AlgorithmComponent(AlgorithmsRepository algorithmsRepository) {
		this.algorithmsRepository = algorithmsRepository;
	}
	
	@Transactional
	public @NonNull Mono<ServerResponse> addAlgorithm(ServerRequest request) {
		return request
				.bodyToMono(AlgorithmDTO.class)
				.flatMap(algorithmDTO -> algorithmsRepository
						.save(algorithmDTO.toAlgorithm())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(algorithm -> ok().contentType(APPLICATION_JSON).bodyValue(algorithm))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getAlgorithmCommands(ServerRequest request) {
		return request
				.bodyToMono(AlgorithmID.class)
				.flatMap(algorithmID -> algorithmsRepository.findById(algorithmID.id()))
				.switchIfEmpty(Mono.error(new Exception()))
				.flatMap(algorithmID -> ok().body(algorithmsRepository.findByAlgorithmAndReturnCommands(algorithmID.getAlgorithm()),String.class))
				.onErrorResume(error -> notFound().build());
	}
	
	record AlgorithmID(Long id) {
	}
}
