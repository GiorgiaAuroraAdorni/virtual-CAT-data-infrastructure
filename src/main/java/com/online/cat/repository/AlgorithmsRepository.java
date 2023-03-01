package com.online.cat.repository;

import com.online.cat.models.Algorithm;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlgorithmsRepository extends ReactiveCrudRepository<Algorithm, Long> {
}
