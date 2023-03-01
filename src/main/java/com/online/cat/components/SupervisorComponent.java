package com.online.cat.components;

import com.online.cat.models.Supervisor;
import com.online.cat.models.SupervisorDTO;
import com.online.cat.repository.SupervisorsRepository;
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
public class SupervisorComponent {
	private static final Logger logger = LoggerFactory.getLogger(SupervisorComponent.class);
	SupervisorsRepository supervisorsRepository;
	
	public SupervisorComponent(SupervisorsRepository supervisorsRepository) {
		this.supervisorsRepository = supervisorsRepository;
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getAll(ServerRequest request) {
		return ok().contentType(APPLICATION_JSON).body(supervisorsRepository.findAll(), Supervisor.class);
	}
	
	@Transactional()
	public @NonNull Mono<ServerResponse> addSupervisor(ServerRequest request) {
		return request
				.bodyToMono(SupervisorDTO.class)
				.flatMap(supervisor -> supervisorsRepository
						.save(supervisor.toSupervisor())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(supervisor -> ok().contentType(APPLICATION_JSON).bodyValue(supervisor))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
}
