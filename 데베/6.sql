create database haksa;
-- Create Department table
CREATE TABLE Department (
department_code INT PRIMARY KEY,
department_name VARCHAR(50)
);
-- Create Student table
CREATE TABLE Student (
student_id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
height DECIMAL(5,2),
department_code INT
);
-- Create Professor table
CREATE TABLE Professor (
professor_code INT PRIMARY KEY AUTO_INCREMENT,
professor_name VARCHAR(50),
department_code INT
);
-- Create Course table
CREATE TABLE Course (
course_code INT PRIMARY KEY AUTO_INCREMENT,
course_name VARCHAR(50),
professor_code INT,
start_date DATE,
end_date DATE
);
-- Create Student_Course table
CREATE TABLE Student_Course (
id INT PRIMARY KEY AUTO_INCREMENT,
student_id INT,
course_code INT
);
-- Add foreign key constraints using ALTER TABLE
ALTER TABLE Student
ADD CONSTRAINT FK_Student_Department
FOREIGN KEY (department_code) REFERENCES Department(department_code);
ALTER TABLE Professor
ADD CONSTRAINT FK_Professor_Department
FOREIGN KEY (department_code) REFERENCES Department(department_code);
ALTER TABLE Course
ADD CONSTRAINT FK_Course_Professor
FOREIGN KEY (professor_code) REFERENCES Professor(professor_code);
ALTER TABLE Student_Course
ADD CONSTRAINT FK_Student_Course_Student
FOREIGN KEY (student_id) REFERENCES Student(student_id);
ALTER TABLE Student_Course
ADD CONSTRAINT FK_Student_Course_Course
FOREIGN KEY (course_code) REFERENCES Course(course_code);