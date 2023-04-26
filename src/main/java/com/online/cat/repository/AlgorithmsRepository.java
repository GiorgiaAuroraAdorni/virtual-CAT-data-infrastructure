package com.online.cat.repository;

import com.online.cat.models.Algorithm;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AlgorithmsRepository extends ReactiveCrudRepository<Algorithm, Long> {
	String FIND_PROJECTS = "SELECT a.commands FROM algorithms a where a.algorithm = :id";
	
	@Query(value = FIND_PROJECTS)
	Mono<String> findByAlgorithmAndReturnCommands(@Param("id") Long algorithm);
}
