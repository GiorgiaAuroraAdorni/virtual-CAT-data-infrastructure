package com.online.cat.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultsDTO {
	private Long studentID;
	private Long schemaID;
	private Long algorithmID;
	private Boolean unplugged;
	private Boolean voice;
	private Boolean schema;
	private Boolean visualFeedback;
	private Boolean gesture;
	private Boolean blocks;
	private Boolean text;
	private Integer artefactDimension;
	private Long time;
	private LocalDateTime timeStamp;
	
	public Result toResult() {
		return Result.of(studentID,
				schemaID,
				algorithmID,
				unplugged,
				voice,
				schema,
				visualFeedback,
				gesture,
				blocks,
				text,
				artefactDimension,
				time, timeStamp);
	}
}
