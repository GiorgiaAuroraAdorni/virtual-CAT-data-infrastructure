package com.online.cat.repository;

import com.online.cat.models.Session;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionsRepository extends ReactiveCrudRepository<Session, Long> {
}
