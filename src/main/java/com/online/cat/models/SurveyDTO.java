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
	
	private Long time;
	
	private String q1;
	
	private String q2;
	
	private String q3;
	
	private String q4;
	
	private String q5;
	
	private String q6;
	
	private String q7;
	
	private String q8;
	
	public Survey toSurvey() {
		return Survey.of(studentID, sessionID, time, q1, q2, q3, q4, q5, q6, q7, q8);
	}
}
