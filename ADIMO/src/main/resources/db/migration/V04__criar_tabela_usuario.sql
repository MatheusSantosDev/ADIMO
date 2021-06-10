CREATE TABLE IF NOT EXISTS `ADIMO_`.`usuario` (
  `codigo` BIGINT(20) NOT NULL auto_increment,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;