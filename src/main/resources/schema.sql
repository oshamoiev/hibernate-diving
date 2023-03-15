DROP TABLE IF EXISTS androids CASCADE;
DROP TABLE IF EXISTS heads;
DROP TABLE IF EXISTS names;
DROP TABLE IF EXISTS androids_groups;
DROP TABLE IF EXISTS groups;

CREATE TABLE names
(
    id   integer GENERATED ALWAYS AS IDENTITY,
    name text,

    PRIMARY KEY (id)
);

CREATE TABLE androids
(
    id      integer GENERATED ALWAYS AS IDENTITY,
    name_id integer NOT NULL,

    FOREIGN KEY (name_id) REFERENCES names (id),
    PRIMARY KEY (id)
);

CREATE TABLE heads
(
    id          integer GENERATED ALWAYS AS IDENTITY,
    description text,
    android_id  integer NOT NULL,

    PRIMARY KEY (id),
    FOREIGN KEY (android_id) REFERENCES androids (id) ON DELETE CASCADE
);

CREATE TABLE groups
(
    id   integer GENERATED ALWAYS AS IDENTITY,
    name text,

    PRIMARY KEY (id)
);

CREATE TABLE androids_groups
(
    android_id integer NOT NULL,
    group_id   integer NOT NULL,

    PRIMARY KEY (android_id, group_id),
    FOREIGN KEY (android_id) REFERENCES androids (id) ON DELETE CASCADE,
    FOREIGN KEY (group_id) REFERENCES groups (id) ON DELETE CASCADE
)





