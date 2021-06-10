CREATE TABLE IF NOT EXISTS `ADIMO_`.`locacao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `imovel_id` INT NOT NULL,
  `ficha_cliente_id` INT NOT NULL,
  `data_inicial` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  INDEX `fk_locacao_imovel_idx` (`imovel_id` ASC) VISIBLE,
  INDEX `fk_locacao_ficha_cliente1_idx` (`ficha_cliente_id` ASC) VISIBLE,
  CONSTRAINT `fk_locacao_imovel`
    FOREIGN KEY (`imovel_id`)
    REFERENCES `ADIMO_`.`imovel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacao_ficha_cliente1`
    FOREIGN KEY (`ficha_cliente_id`)
    REFERENCES `ADIMO_`.`ficha_cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;