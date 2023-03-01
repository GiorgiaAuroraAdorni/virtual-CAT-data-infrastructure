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
	private int id;
	
	@Column(value = "supervisor")
	@NonNull
	private int supervisor;
	
	@Column(value = "school")
	@NonNull
	private int school;
	
	@Column(value = "level")
	@NonNull
	private int level;
	
	@Column(value = "class")
	@NonNull
	private int classs;
	
	@Column(value = "section")
	@NonNull
	private String section;
	
	@Column(value = "date")
	@NonNull
	private LocalDate date;
}
