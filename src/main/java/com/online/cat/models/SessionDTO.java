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
	private Integer supervisor;
	private Integer school;
	private Integer level;
	private Integer classs;
	private String section;
	private LocalDate date;
	
	public Session toSession() {
		return Session.of(supervisor, school, level, classs, section, date);
	}
}
