create table cantons
(
    id     serial
        constraint cantons_pk
            primary key,
    canton text not null
);

create unique index canton_id_uindex
    on cantons (id);

INSERT INTO cantons (id, canton)
VALUES (1, 'Aargau (AG)');
INSERT INTO cantons (id, canton)
VALUES (2, 'Appenzell Ausserrhoden (AR)');
INSERT INTO cantons (id, canton)
VALUES (3, 'Appenzell Innerrhoden (AI)');
INSERT INTO cantons (id, canton)
VALUES (4, 'Basel-Landschaft (BL)');
INSERT INTO cantons (id, canton)
VALUES (5, 'Basel-Stadt (BS)');
INSERT INTO cantons (id, canton)
VALUES (6, 'Bern (BE)');
INSERT INTO cantons (id, canton)
VALUES (7, 'Fribourg (FR)');
INSERT INTO cantons (id, canton)
VALUES (8, 'Genève (GE)');
INSERT INTO cantons (id, canton)
VALUES (9, 'Glarus (GL)');
INSERT INTO cantons (id, canton)
VALUES (10, 'Graubünden (GR)');
INSERT INTO cantons (id, canton)
VALUES (11, 'Jura (JU)');
INSERT INTO cantons (id, canton)
VALUES (12, 'Lucerne (LU)');
INSERT INTO cantons (id, canton)
VALUES (13, 'Neuchâtel (NE)');
INSERT INTO cantons (id, canton)
VALUES (14, 'Nidwalden (NW)');
INSERT INTO cantons (id, canton)
VALUES (15, 'Obwalden (OW)');
INSERT INTO cantons (id, canton)
VALUES (16, 'Schaffhausen (SH)');
INSERT INTO cantons (id, canton)
VALUES (17, 'Schwyz (SZ)');
INSERT INTO cantons (id, canton)
VALUES (18, 'Solothurn (SO)');
INSERT INTO cantons (id, canton)
VALUES (19, 'St. Gallen (SG)');
INSERT INTO cantons (id, canton)
VALUES (20, 'Thurgau (TG)');
INSERT INTO cantons (id, canton)
VALUES (21, 'Ticino (TI)');
INSERT INTO cantons (id, canton)
VALUES (22, 'Uri (UR)');
INSERT INTO cantons (id, canton)
VALUES (23, 'Valais (VS)');
INSERT INTO cantons (id, canton)
VALUES (24, 'Vaud (VD)');
INSERT INTO cantons (id, canton)
VALUES (25, 'Zug (ZG)');
INSERT INTO cantons (id, canton)
VALUES (26, 'Zurich (ZH)');
