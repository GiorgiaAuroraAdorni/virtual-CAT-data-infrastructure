package com.online.cat.models;

import lombok.*;

@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CatLogsDTO {
	private Integer resultID;
	private String log;
	
	public CatLogs toCatLogs() {
		return CatLogs.of(resultID, log);
	}
}
