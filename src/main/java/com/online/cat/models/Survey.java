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
	
	@Column(value = "Did you enjoy this activity?")
	@NonNull
	private String q1;
	
	@Column(value = "Have you ever used an app like this to do exercises and learn?")
	@NonNull
	private String q2;
	
	@Column(value = "Was the app easy to use?")
	@NonNull
	private String q3;
	
	@Column(value = "Were the rules of the activity easy to understand?")
	@NonNull
	private String q4;
	
	@Column(value = "Which resolution mode did you prefer to use?")
	@NonNull
	private String q5;
	
	@Column(value = "Were the exercises easy to solve?")
	@NonNull
	private String q6;
	
	@Column(value = "How long did you take to complete the exercises?")
	@NonNull
	private String q7;
	
	@Column(value = "Would you do this experience again?")
	@NonNull
	private String q8;
}
