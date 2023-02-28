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
INSERT INTO supervisors (id, full_name) VALUES (2, 'Alberto Piatti');
INSERT INTO supervisors (id, full_name) VALUES (3, 'Luca Gambardella');
INSERT INTO supervisors (id, full_name) VALUES (4, 'Francesca Mangili');
INSERT INTO supervisors (id, full_name) VALUES (5, 'Francesco Mondada');
INSERT INTO supervisors (id, full_name) VALUES (6, 'Lucio Negrini');
INSERT INTO supervisors (id, full_name) VALUES (7, 'Kunal Massé');
INSERT INTO supervisors (id, full_name) VALUES (8, 'Engin Bumbacher');
INSERT INTO supervisors (id, full_name) VALUES (9, 'Jérôme Brender');
INSERT INTO supervisors (id, full_name) VALUES (10, 'Dorit Assaf');
