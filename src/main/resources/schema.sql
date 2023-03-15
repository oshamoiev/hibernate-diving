DROP TABLE IF EXISTS androids;
DROP TABLE IF EXISTS names;

CREATE TABLE names
(
    id   integer GENERATED ALWAYS AS IDENTITY,
    name text,
    PRIMARY KEY (id)
);

CREATE TABLE androids
(
    id integer GENERATED ALWAYS AS IDENTITY,
    name_id integer,
    PRIMARY KEY (id),
    CONSTRAINT names_fk FOREIGN KEY (name_id) REFERENCES names (id)
);
