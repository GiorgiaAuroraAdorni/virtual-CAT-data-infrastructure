package com.online.cat.router;

import com.online.cat.components.CantonComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class CantonRouter {
    @Bean
    public RouterFunction<ServerResponse> cantons(CantonComponent cantonComponent) {
        return route()
                .GET("/cantons",accept(APPLICATION_JSON), cantonComponent::getAll)
                .GET("/cantons/{id}",accept(APPLICATION_JSON), cantonComponent::getById)
                .build();
    }
}
