INSERT INTO usuario (nome, email, senha) values 
('Administrador', 'admin@gmail.com', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.'),
('cliente','cliente@gmail.com','$2a$10$Kw.u8UQEPfMcCUVTulA1meRM3HuK5nNfMSVBP4lbxCle4E5601lKW');

#usuario 'atendente'
#login -> admin@gmail.com 
#senha -> admin

#usuario 'cliente'
#login -> cliente@gmail.com
#senha -> cliente


INSERT INTO `imovel` VALUES 
(1,'Casa','Rua vieira de morais','Casa com 3 quartos e 2 banheiros',1000.00),
(2,'Apartamento','Rua barão duprat','Apartamento 2 dormitórios e 1 banheiro',600.00),
(3,'Apartamento','Avenida joão dias','Apartamento de 36m²',700.00);

INSERT INTO `permissao` VALUES 
(1,'ROLE_ATENDENTE'),
(2,'ROLE_CLIENTE');

INSERT INTO `usuario_permissao` VALUES 
(1,1),
(2,2);