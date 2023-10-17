CREATE database quanlisinhvien1;
	use quanlisinhvien1;
	CREATE TABLE class (
		class_id INT KEY AUTO_INCREMENT,
		class_name VARCHAR(45) NOT NULL,
		class_start DATETIME NOT NULL,
		status BIT
	);
	CREATE TABLE student (
		student_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
		student_name VARCHAR(30) NOT NULL,
		studnet_address VARCHAR(50),
		student_phone VARCHAR(20) default 0,
		status BIT,
		class_id INT NOT NULL,
		FOREIGN KEY (class_id)
			REFERENCES class (class_id)
	);
	CREATE TABLE subject (
		subject_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
		subject_name VARCHAR(30) NOT NULL,
		subject_credit TINYINT NOT NULL DEFAULT 1 CHECK (subject_credit >= 1),
		status BIT DEFAULT 1
	);
	CREATE TABLE mark (
		mark_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
		subject_id INT NOT NULL,
		student_id INT NOT NULL,
		mark FLOAT DEFAULT 0 CHECK (Mark BETWEEN 0 AND 100),
		exam_times TINYINT DEFAULT 1,
		UNIQUE (subject_id , student_id),
		FOREIGN KEY (subject_id)
			REFERENCES subject (subject_id),
		FOREIGN KEY (student_id)
			REFERENCES student (student_id)
	);

	 INSERT INTO subject (subject_id,subject_name,subject_credit,status)
	VALUES (1, 'CF', 5, 1),
	 (2, 'C', 6, 1),
	 (3, 'HDJ', 5, 1),
	 (4, 'RDBMS', 10, 1); 
	 
	INSERT INTO class
	VALUES (3, 'B3', current_date, 0),
	 (2, 'A2', '2008-12-22', 1),
	 (1, 'A1', '2008-12-20', 1);
	 
	 INSERT INTO student (student_name, studnet_address ,student_phone, status, class_id)
	VALUES 
	('Hung', 'Ha Noi', '0912113113', 1, 1),
	 ('Hoa', 'Hai phong','', 1, 1),
	 ('Manh', 'HCM', '0123123123', 0, 2);

	 
	INSERT INTO mark (subject_id, student_id,mark ,exam_times)
	VALUES (1, 1, 8, 1),
	 (1, 2, 10, 2),
	 (2, 1, 12, 1);
SELECT 
    *
FROM
    subject
WHERE
    subject_credit = (SELECT 
            MAX(subject_credit)
        FROM
            subject);
            
SELECT 
    sj.subject_name, MAX(Mark)
FROM
    mark m
        JOIN
    subject sj ON m.subject_id = sj.subject_id
GROUP BY sj.subject_id;


SELECT 
    s.*, AVG(Mark) AS 'Diem thi trung binh'
FROM
    student s
        JOIN
    mark m ON s.student_id = m.student_id
GROUP BY s.student_id;
            
     