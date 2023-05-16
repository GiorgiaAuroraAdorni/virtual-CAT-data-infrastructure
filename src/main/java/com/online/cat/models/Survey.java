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
	
	@Column(value = "q1")
	@NonNull
	private String q1;
	
	@Column(value = "q2")
	@NonNull
	private String q2;
	
	@Column(value = "q3")
	@NonNull
	private String q3;
	
	@Column(value = "q4")
	@NonNull
	private String q4;
	
	@Column(value = "q5")
	@NonNull
	private String q5;
	
	@Column(value = "q6")
	@NonNull
	private String q6;
	
	@Column(value = "q7")
	@NonNull
	private String q7;
	
	@Column(value = "q8")
	@NonNull
	private String q8;
}
