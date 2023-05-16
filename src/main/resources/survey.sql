create table survey
(
    id         serial
        constraint survey_pk primary key,
    student_id integer not null
        constraint student_id_fk references students,
    session_id integer not null
        constraint session_id_fk references sessions,
    q1    text    not null,
    q2    text    not null,
    q3    text    not null,
    q4    text    not null,
    q5    text    not null,
    q6    text    not null,
    q7    text    not null,
    q8    text    not null
);