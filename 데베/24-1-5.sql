-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema haksa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema haksa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `haksa` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `haksa` ;

-- -----------------------------------------------------
-- Table `haksa`.`Dapartment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `haksa`.`Dapartment` (
  `department_code` INT NOT NULL AUTO_INCREMENT,
  `department-name` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`department_code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `haksa`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `haksa`.`student` (
  `student_id` INT NOT NULL AUTO_INCREMENT,
  `student_name` VARCHAR(50) NOT NULL,
  `student_height` DECIMAL(5,2) NULL,
  `department_code` INT NOT NULL,
  PRIMARY KEY (`student_id`),
  INDEX `fk_student_Dapartment_idx` (`department_code` ASC) VISIBLE,
  CONSTRAINT `fk_student_Dapartment`
    FOREIGN KEY (`department_code`)
    REFERENCES `haksa`.`Dapartment` (`department_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `haksa`.`Professor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `haksa`.`Professor` (
  `professor_code` INT NOT NULL AUTO_INCREMENT,
  `professor_name` VARCHAR(50) NOT NULL,
  `department_code` INT NOT NULL,
  PRIMARY KEY (`professor_code`),
  INDEX `fk_Professor_Dapartment1_idx` (`department_code` ASC) VISIBLE,
  CONSTRAINT `fk_Professor_Dapartment1`
    FOREIGN KEY (`department_code`)
    REFERENCES `haksa`.`Dapartment` (`department_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `haksa`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `haksa`.`Course` (
  `course_code` INT NOT NULL AUTO_INCREMENT,
  `course_name` VARCHAR(50) NOT NULL,
  `start_date` DATETIME NOT NULL,
  `end_date` DATETIME NOT NULL,
  `professor_code` INT NOT NULL,
  PRIMARY KEY (`course_code`),
  INDEX `fk_Course_Professor1_idx` (`professor_code` ASC) VISIBLE,
  CONSTRAINT `fk_Course_Professor1`
    FOREIGN KEY (`professor_code`)
    REFERENCES `haksa`.`Professor` (`professor_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `haksa`.`student_course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `haksa`.`student_course` (
  `id` INT NOT NULL,
  `student_id` INT NOT NULL,
  `course_code` INT NOT NULL,
  INDEX `fk_student_course_student1_idx` (`student_id` ASC) VISIBLE,
  INDEX `fk_student_course_Course1_idx` (`course_code` ASC) VISIBLE,
  PRIMARY KEY (`student_id`, `course_code`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  CONSTRAINT `fk_student_course_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `haksa`.`student` (`student_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_course_Course1`
    FOREIGN KEY (`course_code`)
    REFERENCES `haksa`.`Course` (`course_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
