create table logs
(
    id        serial
        constraint logs_pk primary key,
    result_id integer not null
        constraint logs_result_id_fk
            references results,
    log       text    not null,
    constraint logs_pk
        primary key (id)
);

