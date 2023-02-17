package com.online.cat.router;

import com.online.cat.components.SchoolComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SchoolRouter {
    @Bean
    public RouterFunction<ServerResponse> schools(SchoolComponent schoolComponent) {
        return route()
                .GET("/school",accept(APPLICATION_JSON), schoolComponent::getAll)
//                .GET("/school/{id}",accept(APPLICATION_JSON), schoolComponent::getById)
                .POST("/school",accept(APPLICATION_JSON), schoolComponent::addSchool)
                .build();
    }
}
