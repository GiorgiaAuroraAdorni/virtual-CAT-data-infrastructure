package com.online.cat.repository;

import com.online.cat.models.CatLogs;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CatLogsRepository extends ReactiveCrudRepository<CatLogs, Long> {
}
