package com.online.cat.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="students")
public class Student {
    @Id
    @Column(value = "id")
    @Generated
    private Long id;

    @Column(value = "date_of_birth")
    private LocalDate date;

    @Column(value = "gender")
    private boolean gender;
    @Column(value = "session")
    private int session;

    public Student(LocalDate date, Boolean gender, Integer session){
        this.date = date;
        this.gender = gender;
        this.session = session;
    }
}
