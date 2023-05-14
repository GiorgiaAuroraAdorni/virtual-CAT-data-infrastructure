package com.online.cat.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {
	private Long supervisor;
	private Long school;
	private String schoolGrade;
	private String section;
	private LocalDate date;
	private String notes;
	private String language;
	
	public Session toSession() {
		return Session.of(supervisor, school, schoolGrade, section, date, notes, language);
	}
}
