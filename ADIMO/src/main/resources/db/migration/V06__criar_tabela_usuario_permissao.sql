CREATE TABLE IF NOT EXISTS `ADIMO_`.`usuario_permissao` (
  `usuario_codigo` BIGINT(20) NOT NULL,
  `permissao_codigo` BIGINT(20) NOT NULL,
  PRIMARY KEY (`usuario_codigo`, `permissao_codigo`),
  INDEX `fk_usuario_has_permissao_permissao1_idx` (`permissao_codigo` ASC) VISIBLE,
  INDEX `fk_usuario_has_permissao_usuario1_idx` (`usuario_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_has_permissao_usuario1`
    FOREIGN KEY (`usuario_codigo`)
    REFERENCES `ADIMO_`.`usuario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_has_permissao_permissao1`
    FOREIGN KEY (`permissao_codigo`)
    REFERENCES `ADIMO_`.`permissao` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;