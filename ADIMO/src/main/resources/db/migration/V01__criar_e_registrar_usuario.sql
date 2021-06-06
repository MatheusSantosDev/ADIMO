INSERT INTO usuario (codigo, nome, email, senha) values 
(1, 'Administrador', 'admin@gmail.com', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.');
#senha default "admin"

INSERT INTO usuario_permissao (usuario_codigo, permissao_codigo) values (1, 1);