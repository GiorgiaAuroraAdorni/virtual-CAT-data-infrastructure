create table results
(
    id                 serial
        constraint results_pk primary key,
    student_id         integer               not null,
    schema_id          integer               not null,
    algorithm_id       integer               not null,
    domain             text                  not null,
    voice              boolean default false not null,
    schema             boolean default false not null,
    visual_feedback    boolean default false not null,
    gestures           boolean default false not null,
    blocks             boolean default false not null,
    text               boolean default false not null,
    artefact_dimension integer               not null,
    time               integer               not null,
    timeStamp          datetime              not null,
    complete           boolean               not null,
    colored_correctly  integer               not null,
    colored            integer               not null,
    constraint results_pk
        primary key (id)
);