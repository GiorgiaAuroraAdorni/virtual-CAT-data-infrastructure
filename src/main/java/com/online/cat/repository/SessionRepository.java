package com.online.cat.repository;

import com.online.cat.models.Session;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SessionRepository extends ReactiveCrudRepository<Session, Long> {
}
