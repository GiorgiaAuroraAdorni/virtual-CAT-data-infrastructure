create table schools
(
    id          IDENTITY(3, 1)
        constraint schools_pk
            primary key,
    name        text,
    canton      integer not null
        constraint schools_cantons_id_fk
            references cantons
            on delete restrict
);

create unique index schools_id_uindex
    on schools (id);

INSERT INTO schools (id, name, canton)
VALUES (0, 'SM Castione', 21);
INSERT INTO schools (id, name, canton)
VALUES (1, 'SI Monte Carasso', 21);
INSERT INTO schools (id, name, canton)
VALUES (2, 'SE Bellinzona Nord', 21);
