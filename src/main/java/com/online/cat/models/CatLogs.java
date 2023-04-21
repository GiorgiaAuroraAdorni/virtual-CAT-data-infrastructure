package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Table(name = "logs")
public class CatLogs {
	@Id
	@Column(value = "id")
	@Generated
	private Long id;
	
	@Column(value = "result_id")
	@NonNull
	private Long resultID;
	
	@Column(value = "log")
	@NonNull
	private String log;
}
