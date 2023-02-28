create table results
(
    student_id         integer               not null,
    schema_id          integer               not null,
    algorithm_id       integer               not null,
    unplugged          boolean default true  not null,
    voice              boolean default true  not null,
    schema             boolean default false not null,
    visual_feedback    boolean default false not null,
    gestures           boolean default false not null,
    blocks             boolean default false not null,
    artefact_dimension integer               not null,
    constraint results_pk
        primary key (student_id, schema_id, algorithm_id)
);

create unique index results_student_id_schema_id_uindex
    on results (student_id, schema_id);