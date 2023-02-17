package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "schools")
public class School {
    @Id
    @Column(value = "id")
    @Generated
    private Long id;

    @Column(value = "name")
    private String name;

    @Column(value = "school_type")
    private String schoolType;

    @Column(value = "canton")
    private Long canton;

    public School(String name, String schoolType, long canton) {
        this.name = name;
        this.schoolType = schoolType;
        this.canton = canton;
    }
}
