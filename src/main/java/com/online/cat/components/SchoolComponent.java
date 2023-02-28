package com.online.cat.components;

import com.online.cat.models.School;
import com.online.cat.models.SchoolDTO;
import com.online.cat.repository.SchoolsRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import lombok.NonNull;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.badRequest;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class SchoolComponent {
    SchoolsRepository schoolsRepository;
    private static final Logger logger = LoggerFactory.getLogger(SchoolComponent.class);
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
                        .save(new School(school.getName(), school.getSchoolType(), school.getCanton()))
                        .doOnError(error -> logger.error(error.getMessage()))
                        .onErrorResume(error -> Mono.empty()))
                .flatMap(supervisor -> ok().contentType(APPLICATION_JSON).bodyValue(supervisor))
                .switchIfEmpty(badRequest().bodyValue("Wrong format"));
    }
}
