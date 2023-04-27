package com.online.cat.repository;

import com.online.cat.models.Survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository("surveyRepository")
public interface SurveyRepository extends ReactiveCrudRepository<Survey,Long> {
}
