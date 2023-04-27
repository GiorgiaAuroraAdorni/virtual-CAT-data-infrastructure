package com.online.cat.models;

import lombok.*;

@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SurveyDTO {
	private Long studentID;
	
	private Long sessionID;
	
	private String results;
	
	public Survey toSurvey(){
		return Survey.of(studentID,sessionID,results);
	}
}
