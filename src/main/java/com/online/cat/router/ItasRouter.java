package com.online.cat.router;

import com.online.cat.components.AlgorithmComponent;
import com.online.cat.components.ItasComponent;
import com.online.cat.helper.ItasModelProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@EnableConfigurationProperties(ItasModelProperties.class)
public class ItasRouter {
	@Bean
	public RouterFunction<ServerResponse> itas(ItasComponent itasComponent) {
		return route()
				.GET("/itas", accept(APPLICATION_JSON), itasComponent::getEvaluation)
				.build();
	}
}
