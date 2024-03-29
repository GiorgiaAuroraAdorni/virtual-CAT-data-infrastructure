package com.online.cat.components;

import com.online.cat.models.CatLogsDTO;
import com.online.cat.repository.CatLogsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.badRequest;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class CatLogsComponent {
	private static final Logger logger = LoggerFactory.getLogger(CatLogsComponent.class);
	
	CatLogsRepository catLogsRepository;
	
	public CatLogsComponent(CatLogsRepository catLogsRepository) {
		this.catLogsRepository = catLogsRepository;
	}
	
	@Transactional
	public @NonNull Mono<ServerResponse> addLogs(ServerRequest request) {
		return request.bodyToMono(CatLogsDTO.class)
				.flatMap(catLogs -> catLogsRepository.save(catLogs.toCatLogs())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(logs -> ok().contentType(MediaType.APPLICATION_JSON).bodyValue(logs))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
}
