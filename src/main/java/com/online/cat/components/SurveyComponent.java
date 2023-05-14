package com.online.cat.components;

import com.online.cat.models.SurveyDTO;
import com.online.cat.repository.SurveyRepository;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Component
@Transactional
public class SurveyComponent {
	private static final Logger logger = LoggerFactory.getLogger(SurveyComponent.class);
	
	SurveyRepository surveyRepository;
	
	public SurveyComponent(SurveyRepository surveyRepository){
		this.surveyRepository = surveyRepository;
	}
	
	@Transactional
	public @NonNull Mono<ServerResponse> addSurvey(ServerRequest request){
		return request
				.bodyToMono(SurveyDTO.class)
				.flatMap(surveyDTO -> surveyRepository
						.save(surveyDTO.toSurvey()).doOnError(error -> logger.error(error.getMessage()))
						.onErrorResume(error -> Mono.empty()))
				.flatMap(survey -> ok().contentType(APPLICATION_JSON).bodyValue(survey))
				.switchIfEmpty(badRequest().bodyValue("Wrong format"));
	}
	
	@Transactional(readOnly = true)
	public @NonNull Mono<ServerResponse> getSurvey(ServerRequest request){
		return request
				.bodyToMono(Information.class)
				.flatMap(information -> surveyRepository.findBySessionIDAndStudentID(information.sessionID, information.studentID))
				.switchIfEmpty(Mono.error(new Exception()))
				.flatMap(survey -> ok().build())
				.onErrorResume(error -> notFound().build());
	}
	
	record Information(Long sessionID, Long studentID){
	
	}
}
