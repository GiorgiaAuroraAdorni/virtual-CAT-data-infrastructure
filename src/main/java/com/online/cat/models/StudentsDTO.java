package com.online.cat.models;

import lombok.*;

import java.time.LocalDate;

@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentsDTO {
	private LocalDate date;
	private String gender;
	private Long session;
	
	public Student toStudent() {
		return Student.of(date, gender, session);
	}
}
