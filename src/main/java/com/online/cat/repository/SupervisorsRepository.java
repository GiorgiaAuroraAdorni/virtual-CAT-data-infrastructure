package com.online.cat.repository;

import com.online.cat.models.Supervisor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository("supervisorsRepository")
public interface SupervisorsRepository extends ReactiveCrudRepository<Supervisor, Long> { }
