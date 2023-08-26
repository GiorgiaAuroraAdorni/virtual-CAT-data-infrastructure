package com.online.cat.repository;

import com.online.cat.models.Student;
import lombok.NonNull;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository("studentsRepository")
public interface StudentsRepository extends ReactiveCrudRepository<Student, Long> {
	Mono<Student> findStudentByIdIsAndSession(Long id, @NonNull Long session);
}
