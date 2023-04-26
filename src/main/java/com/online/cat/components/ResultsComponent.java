package com.online.cat.components;

import com.online.cat.models.Result;
import com.online.cat.models.ResultsDTO;
import com.online.cat.repository.ResultsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.badRequest;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class ResultsComponent {
	private static final Logger logger = LoggerFactory.getLogger(ResultsComponent.class);
	ResultsRepository resultsRepository;
	
	public ResultsComponent(ResultsRepository resultsRepository) {
		this.resultsRepository = resultsRepository;
	}
	
	@Transactional
	public @NonNull Mono<ServerResponse> addResult(ServerRequest request) {
		return request
				.bodyToMono(ResultsDTO.class)
				.flatMap(resultsDTO -> resultsRepository.save(resultsDTO.toResult())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(result -> ok().contentType(APPLICATION_JSON).bodyValue(result))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getByStudentID(ServerRequest request){
		return request
				.bodyToMono(StudentID.class)
				.flatMap(studentID -> ok().contentType(APPLICATION_JSON).body(resultsRepository.findAllByStudentID(studentID.id),
						Result.class))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
		record StudentID(Long id) {
	}
}
