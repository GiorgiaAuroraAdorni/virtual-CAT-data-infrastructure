package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="supervisors")
public class Supervisor {
    @Id
    @Column(value = "id")
    @Generated
    private Long id;

    @Column(value = "full_name")
    private String fullName;

    public Supervisor(String fullName) {
        this.fullName = fullName;
    }
}
