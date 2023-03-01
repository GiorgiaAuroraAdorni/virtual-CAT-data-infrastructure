package com.online.cat.repository;

import com.online.cat.models.Result;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends ReactiveCrudRepository<Result, Long> {
}
