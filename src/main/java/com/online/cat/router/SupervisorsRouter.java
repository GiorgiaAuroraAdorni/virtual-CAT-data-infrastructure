package com.online.cat.router;

import com.online.cat.components.SupervisorComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SupervisorsRouter {
    @Bean
    public RouterFunction<ServerResponse> supervisors(SupervisorComponent supervisorComponent) {
        return route()
                .GET("/supervisors",accept(APPLICATION_JSON),supervisorComponent::getAll)
//                .GET("/supervisors/{id}",accept(APPLICATION_JSON),supervisorComponent::getById)
                .POST("/supervisors",accept(APPLICATION_JSON),supervisorComponent::addSupervisor)
                .build();
    }
}
