DELETE FROM user_role WHERE user_id != 0;
DELETE FROM user_role WHERE role_id != 0;
DELETE FROM roles WHERE id != 0;
DELETE FROM users WHERE id != 0;

DROP TABLE user_role;
DROP TABLE roles;
DROP TABLE users;