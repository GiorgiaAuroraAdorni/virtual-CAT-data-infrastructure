package com.online.cat.models;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDate;

@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentsDTO {
    private LocalDate date;
    private Boolean gender;
    private Integer session;
}
