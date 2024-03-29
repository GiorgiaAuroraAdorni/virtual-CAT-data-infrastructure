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
	private String domain;
	private Boolean voice;
	private Boolean schema;
	private Boolean visualFeedback;
	private Boolean gesture;
	private Boolean blocks;
	private Boolean text;
	private Integer artefactDimension;
	private Long time;
	private LocalDateTime timeStamp;
	private Boolean complete;
	private Long coloredCorrectly;
	private Long colored;
	
	public Result toResult() {
		return Result.of(studentID,
				schemaID,
				algorithmID,
				domain,
				voice,
				schema,
				visualFeedback,
				gesture,
				blocks,
				text,
				artefactDimension,
				time,
				timeStamp,
				complete,
				coloredCorrectly,
				colored);
	}
}
