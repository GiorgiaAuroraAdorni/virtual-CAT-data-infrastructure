package com.online.cat.repository;

import com.online.cat.models.Result;
import lombok.NonNull;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ResultsRepository extends ReactiveCrudRepository<Result, Long> {
	Flux<Result> findAllByStudentID(@NonNull Long studentID);
}
