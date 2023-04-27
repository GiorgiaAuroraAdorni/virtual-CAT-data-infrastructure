package com.online.cat.router;

import com.online.cat.components.SurveyComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SurveyRoute {
	@Bean
	public RouterFunction<ServerResponse> surveys(SurveyComponent surveyComponent) {
		return route()
				.POST("/surveys",accept(APPLICATION_JSON),surveyComponent::addSurvey)
				.build();
	}
}
