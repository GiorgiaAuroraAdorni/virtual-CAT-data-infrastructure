create table survey
(
    id         serial
        constraint survey_pk primary key,
    student_id integer not null
        constraint student_id_fk references students,
    session_id integer not null
        constraint session_id_fk references sessions,
    "Did you enjoy this activity?"                                      text    not null,
    "Have you ever used an app like this to do exercises and learn?"    text    not null,
    "Was the app easy to use?"                                          text    not null,
    "Were the rules of the activity easy to understand?"                text    not null,
    "Which resolution mode did you prefer to use?"                      text    not null,
    "Were the exercises easy to solve?"                                 text    not null,
    "How long did you take to complete the exercises?"                  text    not null,
    "Would you do this experience again?"                               text    not null
);