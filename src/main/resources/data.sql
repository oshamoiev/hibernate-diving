INSERT INTO names (name)
VALUES ('Oleksandr');
INSERT INTO names (name)
VALUES ('Marusya');
INSERT INTO names (name)
VALUES ('Lyoha');

INSERT INTO androids (name_id)
VALUES (1);

INSERT INTO heads (description, android_id)
VALUES ('The best head ever', 1);

INSERT INTO groups (name) VALUES ('runner');
INSERT INTO groups (name) VALUES ('swimmer');
INSERT INTO groups (name) VALUES ('cycler');

INSERT INTO androids_groups(android_id, group_id) VALUES (1, 1);
INSERT INTO androids_groups(android_id, group_id) VALUES (1, 2);
INSERT INTO androids_groups(android_id, group_id) VALUES (1, 3);


