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
@AllArgsConstructor
@Table(name = "sessions")
public class Session {
    @Id
    @Generated
    @Column(value = "id")
    private int id;

    @Column(value = "supervisor")
    private int supervisor;

    @Column(value = "school")
    private int school;

    @Column(value = "level")
    private int level;

    @Column(value = "class")
    private int classs;

    @Column(value = "section")
    private String section;

    @Column(value = "date")
    private LocalDate date;

    public Session(int supervisor, int school, int level, int classs, String section, LocalDate date) {
        this.supervisor = supervisor;
        this.school = school;
        this.level = level;
        this.classs = classs;
        this.section = section;
        this.date = date;
    }
}
