package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Data
@Table(name = "students")
public class Student {
	@Id
	@Column(value = "id")
	@Generated
	private Long id;
	
	@Column(value = "date_of_birth")
	@NonNull
	private LocalDate date;
	
	@Column(value = "gender")
	@NonNull
	private boolean gender;
	@Column(value = "session")
	@NonNull
	private int session;
}
