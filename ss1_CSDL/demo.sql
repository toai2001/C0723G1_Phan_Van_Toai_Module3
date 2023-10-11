create database demo;
use demo;
create table Student(
id int,
name varchar(200),
age int,
country varchar(50)
);

create table Teacher(
id int,
name varchar(200),
age int,
country varchar(50)
);

create table class(
id int,
name varchar(200)
);
SELECT * FROM Student;
SELECT * FROM Teacher;
SELECT * FROM class;
