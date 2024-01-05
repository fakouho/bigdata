-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema temp
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema temp
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `temp` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `temp` ;

-- -----------------------------------------------------
-- Table `temp`.`t_region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.`t_region` (
  `region-code` VARCHAR(3) NOT NULL,
  `region_name` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`region-code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `temp`.` t_customer table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.` t_customer table` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customer_name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(30) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `regist_date` VARCHAR(45) NOT NULL,
  `regist_date` DATE NOT NULL DEFAULT now(),
  `region-code` VARCHAR(3) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  INDEX `fk_ t_customer table_t_region_idx` (`region-code` ASC) VISIBLE,
  CONSTRAINT `fk_ t_customer table_t_region`
    FOREIGN KEY (`region-code`)
    REFERENCES `temp`.`t_region` (`region-code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `temp`.` t_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.` t_product` (
  `id` INT NOT NULL,
  `product_code` VARCHAR(45) NULL,
  `product_name` VARCHAR(45) NOT NULL,
  ` t_productcol` VARCHAR(45) NOT NULL,
  `price` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `product_name_UNIQUE` (`product_name` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `temp`.` t_sales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `temp`.` t_sales` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `qty` INT NULL,
  `sales_date` VARCHAR(45) NULL,
  ` t_salescol` VARCHAR(45) NULL DEFAULT 'now()',
  ` t_customer table_id` INT NOT NULL,
  ` t_product_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_ t_sales_ t_customer table1_idx` (` t_customer table_id` ASC) VISIBLE,
  INDEX `fk_ t_sales_ t_product1_idx` (` t_product_id` ASC) VISIBLE,
  CONSTRAINT `fk_ t_sales_ t_customer table1`
    FOREIGN KEY (` t_customer table_id`)
    REFERENCES `temp`.` t_customer table` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ t_sales_ t_product1`
    FOREIGN KEY (` t_product_id`)
    REFERENCES `temp`.` t_product` (`product_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
