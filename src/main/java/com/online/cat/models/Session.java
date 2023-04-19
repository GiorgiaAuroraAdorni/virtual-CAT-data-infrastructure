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
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Table(name = "sessions")
public class Session {
	@Id
	@Generated
	@Column(value = "id")
	private Integer id;
	
	@Column(value = "supervisor")
	@NonNull
	private Integer supervisor;
	
	@Column(value = "school")
	@NonNull
	private Integer school;
	
	@Column(value = "level")
	@NonNull
	private Integer level;
	
	@Column(value = "class")
	@NonNull
	private Integer classs;
	
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
