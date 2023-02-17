package com.online.cat.models;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {
    private int supervisor;

    private int school;

    private int level;

    private int classs;

    private String section;

    private LocalDate date;
}
