package com.online.cat.repository;

import com.online.cat.models.Survey;
import lombok.NonNull;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository("surveyRepository")
public interface SurveyRepository extends ReactiveCrudRepository<Survey,Long> {
	Mono<Survey> findBySessionIDAndStudentID(@NonNull Long sessionID, @NonNull Long studentID);
}
