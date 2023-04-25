package com.online.cat.router;

import com.online.cat.components.StudentComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class StudentRouter {
    @Bean
    public RouterFunction<ServerResponse> students(StudentComponent studentComponent){
        return route()
                .POST("/students",accept(APPLICATION_JSON),studentComponent::addStudent)
                .GET("/students",accept(APPLICATION_JSON), studentComponent::getAll)
                .build();
    }
}
