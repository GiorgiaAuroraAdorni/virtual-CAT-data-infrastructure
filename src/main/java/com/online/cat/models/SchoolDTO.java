package com.online.cat.models;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SchoolDTO {
	private String name;
	private Long canton;
	
	public School toSchool() {
		return School.of(name, canton);
	}
}
