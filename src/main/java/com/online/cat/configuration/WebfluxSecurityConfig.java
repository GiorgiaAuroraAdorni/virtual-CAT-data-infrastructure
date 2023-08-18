package com.online.cat.configuration;

import com.online.cat.helper.ItasModelProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableConfigurationProperties(ItasModelProperties.class)
@EnableWebFluxSecurity
public class WebfluxSecurityConfig {
    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .cors()
                .disable()
                .csrf()
                .disable()
                .httpBasic(withDefaults());
        return http.build();
    }
}
