create table survey
(
    id                                                            serial
        constraint survey_pk primary key,
    student_id                                                    integer not null
        constraint student_id_fk references students,
    session_id                                                    integer not null
        constraint session_id_fk references sessions,
    Did_you_enjoy_this_activity                                   text    not null,
    Have_you_ever_used_an_app_like_this_to_do_exercises_and_learn text    not null,
    Was_the_app_easy_to_use                                       text    not null,
    Were_the_rules_of_the_activity_easy_to_understand             text    not null,
    Which_resolution_mode_did_you_prefer_to_use                   text    not null,
    Were_the_exercises_easy_to_solve                              text    not null,
    How_long_did_you_take_to_complete_the_exercises               text    not null,
    Would_you_do_this_experience_again                            text    not null
);