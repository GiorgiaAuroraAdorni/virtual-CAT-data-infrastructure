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
@Table(name = "schools")
public class School {
	@Id
	@Column(value = "id")
	@Generated
	private Long id;
	
	@Column(value = "name")
	@NonNull
	private String name;
	
	@Column(value = "canton")
	@NonNull
	private Long canton;
}
