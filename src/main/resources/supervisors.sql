create table supervisors
(
    id        IDENTITY(11, 1)
        constraint supervisors_pk
            primary key,
    full_name text not null
);

create unique index supervisors_id_uindex
    on supervisors (id);

INSERT INTO supervisors (id, full_name) VALUES (1, 'Giorgia Adorni');
INSERT INTO supervisors (id, full_name) VALUES (2, 'Elia Lutz');
INSERT INTO supervisors (id, full_name) VALUES (3, 'Kunal Massé');
INSERT INTO supervisors (id, full_name) VALUES (4, 'Melissa Skweres');
INSERT INTO supervisors (id, full_name) VALUES (5, 'Alberto Piatti');
INSERT INTO supervisors (id, full_name) VALUES (6, 'Dorit Assaf');
INSERT INTO supervisors (id, full_name) VALUES (7, 'Lucio Negrini');
INSERT INTO supervisors (id, full_name) VALUES (8, 'Francesco Mondada');
INSERT INTO supervisors (id, full_name) VALUES (9, 'Engin Bumbacher');
INSERT INTO supervisors (id, full_name) VALUES (10, 'Jérôme Brender');
INSERT INTO supervisors (id, full_name) VALUES (11, 'Luca Gambardella');
INSERT INTO supervisors (id, full_name) VALUES (12, 'Francesca Mangili');



