create database demo;
use demo;
create table student(
student_id int,
student_name varchar(200),
student_age int,
student_country varchar(50)
);

create table teacher(
teacher_id int,
teacher_name varchar(200),
teacher_age int,
teacher_country varchar(50)
);

create table class(
class_id int,
class_name varchar(200)
);
SELECT * FROM student;
SELECT * FROM teacher;
SELECT * FROM class;
