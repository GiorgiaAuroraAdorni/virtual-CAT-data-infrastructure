package com.online.cat.router;

import com.online.cat.components.ResultsComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class ResultsRoute {
	@Bean
	public RouterFunction<ServerResponse> results(ResultsComponent resultsComponent) {
		return route()
				.POST("/results", accept(APPLICATION_JSON), resultsComponent::addResult)
				.GET("/results", accept(APPLICATION_JSON), resultsComponent::getByStudentID)
				.build();
	}
}
