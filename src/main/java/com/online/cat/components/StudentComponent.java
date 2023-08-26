package com.online.cat.components;

import com.online.cat.models.Student;
import com.online.cat.models.StudentsDTO;
import com.online.cat.repository.StudentsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.badRequest;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Transactional
public class StudentComponent {
	private static final Logger logger = LoggerFactory.getLogger(StudentComponent.class);
	StudentsRepository studentsRepository;
	
	public StudentComponent(StudentsRepository studentsRepository) {
		this.studentsRepository = studentsRepository;
	}
	
	@Transactional
	public @NonNull Mono<ServerResponse> addStudent(ServerRequest request) {
		return request
				.bodyToMono(StudentsDTO.class)
				.flatMap(student -> studentsRepository
						.save(student.toStudent())
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(student -> ok().contentType(MediaType.APPLICATION_JSON).bodyValue(student))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getAll(ServerRequest request) {
		return ok().contentType(APPLICATION_JSON).body(studentsRepository.findAll(), Student.class);
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getStudent(ServerRequest request) {
		return request.bodyToMono(StudentL.class)
				.flatMap(student -> studentsRepository
						.findStudentByIdIsAndSession(student.id, student.sessionID)
						.doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(student -> ok().contentType(APPLICATION_JSON).bodyValue(student))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
	record StudentL(Long id, Long sessionID) {
	}
}
