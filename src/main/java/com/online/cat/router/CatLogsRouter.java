package com.online.cat.router;

import com.online.cat.components.CatLogsComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CatLogsRouter {
	@Bean
	public RouterFunction<ServerResponse> logs(CatLogsComponent catLogsComponent) {
		return route()
				.POST("/logs", accept(APPLICATION_JSON), catLogsComponent::addLogs)
				.build();
	}
}
