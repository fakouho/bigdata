-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema godd
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema godd
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `godd` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `godd` ;

-- -----------------------------------------------------
-- Table `godd`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `godd`.`customer` (
  `customer_id` VARCHAR(45) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `customer_name` VARCHAR(100) NOT NULL,
  `age` INT NULL,
  `rating` VARCHAR(20) NOT NULL,
  `occupation` VARCHAR(20) NULL,
  `reserves` INT NULL,
  PRIMARY KEY (`customer_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `godd`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `godd`.`product` (
  `product_number` INT NOT NULL,
  `product_name` VARCHAR(100) NULL,
  `inventory` INT NULL,
  `price` INT NULL,
  `manufacturer` VARCHAR(100) NULL,
  PRIMARY KEY (`product_number`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `godd`.`customer_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `godd`.`customer_product` (
  `order_number` INT NOT NULL,
  `quantity` INT NULL,
  `order_date` DATETIME NULL,
  `product_number` INT NOT NULL,
  `customer_id` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`order_number`),
  INDEX `fk_customer_product_product_idx` (`product_number` ASC) VISIBLE,
  INDEX `fk_customer_product_customer1_idx` (`customer_id` ASC) VISIBLE,
  CONSTRAINT `fk_customer_product_product`
    FOREIGN KEY (`product_number`)
    REFERENCES `godd`.`product` (`product_number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_product_customer1`
    FOREIGN KEY (`customer_id`)
    REFERENCES `godd`.`customer` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
