create table sessions
(
    id         serial
        constraint sessions_pk
            primary key,
    supervisor integer not null
        constraint sessions_supervisors_id_fk
            references supervisors,
    school     integer not null
        constraint sessions_schools_id_fk
            references schools,
    level      integer not null,
    class      integer not null,
    section    text,
    date       date    not null,
    notes      text,
    language   text  not null
);