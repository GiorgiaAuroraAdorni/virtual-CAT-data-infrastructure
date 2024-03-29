package com.online.cat.configuration;

import io.r2dbc.h2.H2ConnectionConfiguration;
import io.r2dbc.h2.H2ConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import lombok.NonNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.R2dbcTransactionManager;
import org.springframework.r2dbc.connection.init.CompositeDatabasePopulator;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.transaction.ReactiveTransactionManager;

@Configuration
@EnableR2dbcRepositories
public class DatabaseConfig extends AbstractR2dbcConfiguration {
	@Override
	@Bean
	public @NonNull ConnectionFactory connectionFactory() {
		return new H2ConnectionFactory(
				H2ConnectionConfiguration.builder()
						.file("~/demodb")
//                        .option("MODE=PostgreSQL;DATABASE_TO_LOWER=TRUE;DEFAULT_NULL_ORDERING=HIGH")
						.username("user")
						.password("password").build()
		);
	}
	
	@Bean
	ReactiveTransactionManager transactionManager(ConnectionFactory connectionFactory) {
		return new R2dbcTransactionManager(connectionFactory);
	}
	
	@Bean
	ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
		
		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);
		CompositeDatabasePopulator populator = new CompositeDatabasePopulator();
		populator.addPopulators(
				new ResourceDatabasePopulator(
						true, true, null,
						new ClassPathResource("cantons.sql"),
						new ClassPathResource("schools.sql"),
						new ClassPathResource("supervisors.sql"),
						new ClassPathResource("session.sql"),
						new ClassPathResource("students.sql"),
						new ClassPathResource("algorithms.sql"),
						new ClassPathResource("results.sql"),
						new ClassPathResource("logs.sql"),
						new ClassPathResource("survey.sql")
				));
		
		initializer.setDatabasePopulator(populator);
		
		return initializer;
	}
}
