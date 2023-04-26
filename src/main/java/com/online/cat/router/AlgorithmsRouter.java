package com.online.cat.router;

import com.online.cat.components.AlgorithmComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class AlgorithmsRouter {
	
	@Bean
	public RouterFunction<ServerResponse> algorithms(AlgorithmComponent algorithmComponent) {
		return route()
				.POST("/algorithms", accept(APPLICATION_JSON), algorithmComponent::addAlgorithm)
				.GET("/algorithms", accept(APPLICATION_JSON), algorithmComponent::getAlgorithmCommands)
				.build();
	}
}
