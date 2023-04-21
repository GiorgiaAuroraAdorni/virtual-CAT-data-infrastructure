package com.online.cat.models;

import lombok.*;

@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CatLogsDTO {
	private Long resultID;
	private String log;
	
	public CatLogs toCatLogs() {
		return CatLogs.of(resultID, log);
	}
}
