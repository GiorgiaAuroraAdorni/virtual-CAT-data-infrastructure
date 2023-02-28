package com.online.cat.repository;

import com.online.cat.models.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository("studentsRepository")
public interface StudentsRepository extends ReactiveCrudRepository<Student, Long> {
}
