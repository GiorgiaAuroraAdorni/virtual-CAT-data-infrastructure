package com.online.cat.repository;

import com.online.cat.models.School;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends ReactiveCrudRepository<School, Long> {
}
