package com.online.cat.components;

import com.online.cat.helper.LongValidator;
import com.online.cat.models.Canton;
import com.online.cat.repository.CantonsRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import lombok.NonNull;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.notFound;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class CantonComponent {
    CantonsRepository cantonsRepository;

    CantonComponent(CantonsRepository cantonsRepository) {
        this.cantonsRepository = cantonsRepository;
    }

    @Transactional(readOnly = true)
    public @NonNull Mono<ServerResponse> getAll(ServerRequest request) {
        return ok().contentType(APPLICATION_JSON).body(cantonsRepository.findAll(), Canton.class);
    }

    @Transactional(readOnly = true)
    public @NonNull Mono<ServerResponse> getById(ServerRequest request){
        return Mono.just(request.pathVariable("id"))
                .flatMap(id -> LongValidator.validate(id) == null ? Mono.empty(): Mono.just(Long.parseLong(id)))
                .flatMap(id -> cantonsRepository.findById(id))
                .flatMap(canton -> ok().contentType(APPLICATION_JSON).bodyValue(canton))
                .switchIfEmpty(notFound().build());
    }
}
