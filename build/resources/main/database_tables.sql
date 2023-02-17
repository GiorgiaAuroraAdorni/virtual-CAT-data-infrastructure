create table if not exists cantons
(
    id     serial
        constraint cantons_pk
            primary key,
    canton text not null
);

create unique index if not exists canton_id_uindex
    on cantons (id);

create table if not exists schools
(
    id          serial
        constraint schools_pk
            primary key,
    name        text,
    school_type text,
    canton      integer not null
        constraint schools_cantons_id_fk
            references cantons
            on delete restrict
);

create unique index if not exists schools_id_uindex
    on schools (id);

create table if not exists supervisors
(
    id        serial
        constraint supervisors_pk
            primary key,
    full_name text not null
);

create unique index if not exists supervisors_id_uindex
    on supervisors (id);

create table if not exists algorithms
(
    schema              integer not null,
    algorithm           integer not null,
    commands            text,
    algorithm_dimension integer,
    description         text,
    constraint algorithms_pk
        primary key (algorithm, schema)
);

create table if not exists results
(
    student_id       integer               not null,
    schema_id        integer               not null,
    algorithm_id     integer               not null,
    cat_score        integer               not null,
    visual_feedback  boolean default false not null,
    unplugged        boolean default true  not null,
    voice            boolean default true  not null,
    "voice_&_schema" boolean default false not null,
    gestures         boolean default false not null,
    blocks           boolean default false not null,
    constraint results_pk
        primary key (student_id, schema_id, algorithm_id)
);

create unique index if not exists results_student_id_schema_id_uindex
    on results (student_id, schema_id);

create table if not exists sessions
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
    date_collection       date    not null
);

create table if not exists students
(
    id            serial
        constraint students_pk
            primary key,
    date_of_birth date    not null,
    gender        boolean  not null,
    session       integer not null
        constraint students_sessions_id_fk
            references sessions
);

create unique index if not exists students_id_uindex
    on students (id);

