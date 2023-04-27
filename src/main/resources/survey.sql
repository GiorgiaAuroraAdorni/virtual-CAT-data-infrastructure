create table survey
(
    id         serial
        constraint survey_pk primary key,
    student_id integer not null
        constraint student_id_fk references students,
    session_id integer not null
        constraint session_id_fk references sessions,
    results    text    not null,
);