CREATE TABLE schools
(
id_school long not null AUTO_INCREMENT,
name_school varchar(255) not null,
primary key(id_school) 
);

CREATE TABLE courses
(
id_course long not null AUTO_INCREMENT,
classroom varchar(255) not null,
grade integer not null,
id_school long not null,
FOREIGN KEY (id_school) REFERENCES schools(id_school) ,
primary key(id_course)
);

CREATE TABLE teachers
(
id_teacher long not null AUTO_INCREMENT,
name_teacher varchar(255) not null,
primary key(id_teacher)
);

CREATE TABLE students
(
id_student long not null AUTO_INCREMENT,
name_student varchar(255) not null,
primary key(id_student)
);

CREATE TABLE subjects
(
id_subject long not null AUTO_INCREMENT,
name_subject varchar(255) not null,
id_teacher long not null,
id_course long not null,
FOREIGN KEY (id_teacher) REFERENCES teachers(id_teacher),
FOREIGN KEY (id_course) REFERENCES courses(id_course),
primary key(id_subject)
);

CREATE TABLE materias
(
id_materia long not null AUTO_INCREMENT,
id_subject  long not null,
id_student long not null,
FOREIGN KEY (id_subject) REFERENCES subjects(id_subject) ,
FOREIGN KEY (id_student) REFERENCES students(id_student),
primary key(id_materia)
);