create table algorithms
(
    schema                                integer not null,
    algorithm                             serial constraint algorithms_pk primary key,
    commands                              text not null,
    algorithm_dimension                   integer,
    description                           text,
    paintdot                              boolean default false not null,
    paintupmonochromatic                  boolean default false not null,
    paintdownmonochromatic                boolean default false not null,
    paintleftmonochromatic                boolean default false not null,
    paintrightmonochromatic               boolean default false not null,
    paintsquaremonochromatic              boolean default false not null,
    paintdiagonalupleftmonochromatic      boolean default false not null,
    paintdiagonaluprightmonochromatic     boolean default false not null,
    paintdiagonaldownleftmonochromatic    boolean default false not null,
    paintdiagonaldownrightmonochromatic   boolean default false not null,
    paintlupleftmonochromatic             boolean default false not null,
    paintluprightmonochromatic            boolean default false not null,
    paintldownleftmonochromatic           boolean default false not null,
    paintldownrightmonochromatic          boolean default false not null,
    paintlleftupmonochromatic             boolean default false not null,
    paintlleftdownmonochromatic           boolean default false not null,
    paintlrightupmonochromatic            boolean default false not null,
    paintlrightdownmonochromatic          boolean default false not null,
    paintzigzagleftupdownmonochromatic    boolean default false not null,
    paintzigzagleftdownupmonochromatic    boolean default false not null,
    paintzigzagrightupdownmonochromatic   boolean default false not null,
    paintzigzagrightdownupmonochromatic   boolean default false not null,
    paintzigzagupleftrightmonochromatic   boolean default false not null,
    paintzigzaguprightleftmonochromatic   boolean default false not null,
    paintzigzagdownleftrightmonochromatic boolean default false not null,
    paintzigzagdownrightleftmonochromatic boolean default false not null,
    paintuppolychromatic                  boolean default false not null,
    paintdownpolychromatic                boolean default false not null,
    paintleftpolychromatic                boolean default false not null,
    paintrightpolychromatic               boolean default false not null,
    paintsquarepolychromatic              boolean default false not null,
    paintdiagonalupleftpolychromatic      boolean default false not null,
    paintdiagonaluprightpolychromatic     boolean default false not null,
    paintdiagonaldownleftpolychromatic    boolean default false not null,
    paintdiagonaldownrightpolychromatic   boolean default false not null,
    paintlupleftpolychromatic             boolean default false not null,
    paintluprightpolychromatic            boolean default false not null,
    paintldownleftpolychromatic           boolean default false not null,
    paintldownrightpolychromatic          boolean default false not null,
    paintlleftuppolychromatic             boolean default false not null,
    paintlleftdownpolychromatic           boolean default false not null,
    paintlrightuppolychromatic            boolean default false not null,
    paintlrightdownpolychromatic          boolean default false not null,
    paintzigzagleftupdownpolychromatic    boolean default false not null,
    paintzigzagleftdownuppolychromatic    boolean default false not null,
    paintzigzagrightupdownpolychromatic   boolean default false not null,
    paintzigzagrightdownuppolychromatic   boolean default false not null,
    paintzigzagupleftrightpolychromatic   boolean default false not null,
    paintzigzaguprightleftpolychromatic   boolean default false not null,
    paintzigzagdownleftrightpolychromatic boolean default false not null,
    paintzigzagdownrightleftpolychromatic boolean default false not null,
    fillempty                             boolean default false not null,
    copy                                  boolean default false not null,
    mirrorvertical                        boolean default false not null,
    mirrorhorizontal                      boolean default false not null,
    constraint algorithms_pk
        primary key (algorithm, schema)
);