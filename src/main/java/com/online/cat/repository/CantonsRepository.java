package com.online.cat.repository;

import com.online.cat.models.Canton;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CantonsRepository extends ReactiveCrudRepository<Canton, Long> {
}
