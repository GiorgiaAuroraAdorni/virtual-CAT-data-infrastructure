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
	
	@Column(value = "time")
	@NonNull
	private Long time;
	
	@Column(value = "Did_you_enjoy_this_activity")
	@NonNull
	private String q1;
	
	@Column(value = "Have_you_ever_used_an_app_like_this_to_do_exercises_and_learn")
	@NonNull
	private String q2;
	
	@Column(value = "Was_the_app_easy_to_use")
	@NonNull
	private String q3;
	
	@Column(value = "Were_the_rules_of_the_activity_easy_to_understand")
	@NonNull
	private String q4;
	
	@Column(value = "Which_resolution_mode_did_you_prefer_to_use")
	@NonNull
	private String q5;
	
	@Column(value = "Were_the_exercises_easy_to_solve")
	@NonNull
	private String q6;
	
	@Column(value = "How_long_did_you_take_to_complete_the_exercises")
	@NonNull
	private String q7;
	
	@Column(value = "Would_you_do_this_experience_again")
	@NonNull
	private String q8;
}
