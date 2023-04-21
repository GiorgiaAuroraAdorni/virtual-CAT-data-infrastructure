package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Table(name = "results")
public class Result {
	@Column("id")
	@Id
	@Generated
	private Long id;
	@Column("student_id")
	@NonNull
	private Long studentID;
	@Column("schema_id")
	@NonNull
	private Long schemaID;
	@Column("algorithm_id")
	@NonNull
	private Long algorithmID;
	@Column("unplugged")
	@NonNull
	private Boolean unplugged;
	@Column("voice")
	@NonNull
	private Boolean voice;
	@Column("schema")
	@NonNull
	private Boolean schema;
	@Column("visual_feedback")
	@NonNull
	private Boolean visualFeedback;
	@Column("gestures")
	@NonNull
	private Boolean gesture;
	@Column("blocks")
	@NonNull
	private Boolean blocks;
	@Column("text")
	@NonNull
	private Boolean text;
	@Column("artefact_dimension")
	@NonNull
	private Integer artefactDimension;
	
	@Column("time")
	@NonNull
	private Long time;
	
	@Column(value = "timeStamp")
	@NonNull
	private LocalDateTime timeStamp;
}
