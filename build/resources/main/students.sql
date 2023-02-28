create table students
(
    id            serial
        constraint students_pk
            primary key,
    date_of_birth date    not null,
    gender        boolean not null,
    session       integer not null
        constraint students_sessions_id_fk
            references sessions
);

create unique index students_id_uindex
    on students (id);