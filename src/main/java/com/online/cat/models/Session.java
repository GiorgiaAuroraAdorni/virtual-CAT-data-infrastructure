package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor(force = true)
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Table(name = "sessions")
public class Session {
	@Id
	@Generated
	@Column(value = "id")
	private Long id;
	
	@Column(value = "supervisor")
	@NonNull
	private Long supervisor;
	
	@Column(value = "school")
	@NonNull
	private Long school;
	
	@Column(value = "level")
	@NonNull
	private Long level;
	
	@Column(value = "class")
	@NonNull
	private Long classs;
	
	@Column(value = "section")
	@NonNull
	private String section;
	
	@Column(value = "date")
	@NonNull
	private LocalDate date;
	
	@Column(value = "notes")
	@NonNull
	private String notes;
	
	@Column(value = "language")
	@NonNull
	private String language;
}
