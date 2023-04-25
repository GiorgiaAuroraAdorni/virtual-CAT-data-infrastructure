package com.online.cat.router;

import com.online.cat.components.SessionComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SessionRouter {
    @Bean
    public RouterFunction<ServerResponse> sessions(SessionComponent sessionComponent) {
        return route()
                .POST("/sessions", accept(APPLICATION_FORM_URLENCODED), sessionComponent::addSession)
                .GET("/sessions",accept(APPLICATION_JSON), sessionComponent::getAll)
                .build();
    }
}
