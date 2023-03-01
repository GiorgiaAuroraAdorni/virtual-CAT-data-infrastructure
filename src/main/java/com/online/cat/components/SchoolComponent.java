package com.online.cat.components;

import com.online.cat.models.School;
import com.online.cat.models.SchoolDTO;
import com.online.cat.repository.SchoolsRepository;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class SchoolComponent {
	private static final Logger logger = LoggerFactory.getLogger(SchoolComponent.class);
	SchoolsRepository schoolsRepository;
	
	public SchoolComponent(SchoolsRepository schoolsRepository) {
		this.schoolsRepository = schoolsRepository;
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getAll(ServerRequest request) {
		return ok().contentType(APPLICATION_JSON).body(schoolsRepository.findAll(), School.class);
	}
	
	@Transactional()
	public @NonNull Mono<ServerResponse> addSchool(ServerRequest request) {
		return request
				.bodyToMono(SchoolDTO.class)
				.flatMap(school -> schoolsRepository
						.save(school.toSchool())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(supervisor -> ok().contentType(APPLICATION_JSON).bodyValue(supervisor))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
}
