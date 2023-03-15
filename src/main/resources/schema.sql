DROP TABLE IF EXISTS androids CASCADE;
DROP TABLE IF EXISTS heads;
DROP TABLE IF EXISTS names;

CREATE TABLE names
(
    id   integer GENERATED ALWAYS AS IDENTITY,
    name text,

    PRIMARY KEY (id)
);

CREATE TABLE heads
(
    id          integer GENERATED ALWAYS AS IDENTITY,
    description text,

    PRIMARY KEY (id)
);

CREATE TABLE androids
(
    id      integer GENERATED ALWAYS AS IDENTITY,
    name_id integer,
    head_id integer,

    FOREIGN KEY (name_id) REFERENCES names (id),
    FOREIGN KEY (head_id) REFERENCES heads (id),
    PRIMARY KEY (id)
);




