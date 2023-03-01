package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
@Data
@Table(name = "supervisors")
public class Supervisor {
	@Id
	@Column(value = "id")
	@Generated
	private Long id;
	
	@Column(value = "full_name")
	@NonNull
	private String fullName;
}
