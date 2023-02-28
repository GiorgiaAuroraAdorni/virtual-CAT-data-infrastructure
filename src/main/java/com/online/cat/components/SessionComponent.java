package com.online.cat.components;

import com.online.cat.models.Session;
import com.online.cat.models.SessionDTO;
import com.online.cat.repository.SessionsRepository;
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
public class SessionComponent {
    private static final Logger logger = LoggerFactory.getLogger(SessionComponent.class);
    SessionsRepository sessionRepository;

    SessionComponent(SessionsRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Transactional()
    public @NonNull Mono<ServerResponse> addSession(ServerRequest request) {
        return request
                .bodyToMono(SessionDTO.class)
                .flatMap(session -> sessionRepository
                        .save(new Session(session.getSupervisor(), session.getSchool(), session.getLevel(), session.getClasss(), session.getSection(), session.getDate()))
                        .doOnError(error -> logger.error(error.getMessage()))
                        .onErrorResume(error -> Mono.empty()))
                .flatMap(supervisor -> ok().contentType(APPLICATION_JSON).bodyValue(supervisor))
                .switchIfEmpty(badRequest().bodyValue("Wrong format"));
    }
}
