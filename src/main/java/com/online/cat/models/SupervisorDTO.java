package com.online.cat.models;

import lombok.*;

@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupervisorDTO {
	private String fullName;
	
	public Supervisor toSupervisor() {
		return Supervisor.of(fullName);
	}
}
