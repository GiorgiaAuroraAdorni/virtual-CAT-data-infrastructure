package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Data
@Table(name = "survey")
public class Survey {
	@Id
	@Column(value = "id")
	@Generated
	private Long id;
	
	@Column(value = "student_id")
	@NonNull
	private Long studentID;
	
	@Column(value = "session_id")
	@NonNull
	private Long sessionID;
	
	@Column(value = "results")
	@NonNull
	private String results;
}
