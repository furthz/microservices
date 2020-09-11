INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('raul','123', 1, 'Raúl', 'Talledo', 'raul.talledo@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('juan','123', 1, 'Juan', 'Talledo', 'juan.talledo@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id, rol_id) VALUES (2,1);