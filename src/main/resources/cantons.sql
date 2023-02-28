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
VALUES (1, 'Appenzello Esterno (AR)');
INSERT INTO cantons (id, canton)
VALUES (2, 'Appenzello Interno (AI)');
INSERT INTO cantons (id, canton)
VALUES (3, 'Argovia (AG)');
INSERT INTO cantons (id, canton)
VALUES (4, 'Basilea Campagna (BL)');
INSERT INTO cantons (id, canton)
VALUES (5, 'Basilea Città (BS)');
INSERT INTO cantons (id, canton)
VALUES (6, 'Berna (BE)');
INSERT INTO cantons (id, canton)
VALUES (7, 'Friburgo (FR)');
INSERT INTO cantons (id, canton)
VALUES (8, 'Ginevra (GE)');
INSERT INTO cantons (id, canton)
VALUES (9, 'Giura (JU)');
INSERT INTO cantons (id, canton)
VALUES (10, 'Glarona (GL)');
INSERT INTO cantons (id, canton)
VALUES (11, 'Grigioni (GR)');
INSERT INTO cantons (id, canton)
VALUES (12, 'Lucerna (LU)');
INSERT INTO cantons (id, canton)
VALUES (13, 'Neuchâtel (NE)');
INSERT INTO cantons (id, canton)
VALUES (14, 'Nidvaldo (NW)');
INSERT INTO cantons (id, canton)
VALUES (15, 'Obvaldo (OW)');
INSERT INTO cantons (id, canton)
VALUES (16, 'San Gallo (SG)');
INSERT INTO cantons (id, canton)
VALUES (17, 'Sciaffusa (SH)');
INSERT INTO cantons (id, canton)
VALUES (18, 'Soletta (SO)');
INSERT INTO cantons (id, canton)
VALUES (19, 'Svitto (SZ)');
INSERT INTO cantons (id, canton)
VALUES (20, 'Ticino (TI)');
INSERT INTO cantons (id, canton)
VALUES (21, 'Turgovia (TG)');
INSERT INTO cantons (id, canton)
VALUES (22, 'Uri (UR)');
INSERT INTO cantons (id, canton)
VALUES (23, 'Vallese (VS)');
INSERT INTO cantons (id, canton)
VALUES (24, 'Vaud (VD)');
INSERT INTO cantons (id, canton)
VALUES (25, 'Zugo (ZG)');
INSERT INTO cantons (id, canton)
VALUES (26, 'Zurigo (ZH)');
