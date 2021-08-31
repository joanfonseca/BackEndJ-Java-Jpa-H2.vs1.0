insert into schools(name_school) values ('El colegio de Olimpo');

insert into courses(classroom,grade,id_school) values ('A',10,1);
insert into courses(classroom,grade,id_school) values ('B',10,1);
insert into courses(classroom,grade,id_school) values ('A',11,1);
insert into courses(classroom,grade,id_school) values ('B',11,1);

insert into teachers(name_teacher) values ('Nemesis');
insert into teachers(name_teacher) values ('Priapo');
insert into teachers(name_teacher) values ('Iris');

insert into subjects(name_subject,id_teacher,id_course) values ('Matematicas',1,1);
insert into subjects(name_subject,id_teacher,id_course) values ('Matematicas',1,2);
insert into subjects(name_subject,id_teacher,id_course) values ('Matematicas',1,3);
insert into subjects(name_subject,id_teacher,id_course) values ('Matematicas',1,4);
insert into subjects(name_subject,id_teacher,id_course) values ('Español',2,1);
insert into subjects(name_subject,id_teacher,id_course) values ('Español',2,2);
insert into subjects(name_subject,id_teacher,id_course) values ('Ingles basico',3,1);
insert into subjects(name_subject,id_teacher,id_course) values ('Ingles avanzado',3,2);
insert into subjects(name_subject,id_teacher,id_course) values ('Pre icfes',1,3);
insert into subjects(name_subject,id_teacher,id_course) values ('Pre icfes',1,4);

insert into students(name_student) values ('Afrodita');
insert into materias(id_subject,id_student) values (1,1);
insert into materias(id_subject,id_student) values (5,1);
insert into materias(id_subject,id_student) values (7,1);

insert into students(name_student) values ('Apolo');
insert into materias(id_subject,id_student) values (1,2);
insert into materias(id_subject,id_student) values (5,2);
insert into materias(id_subject,id_student) values (7,2);

insert into students(name_student) values ('Ares');
insert into materias(id_subject,id_student) values (1,3);
insert into materias(id_subject,id_student) values (5,3);
insert into materias(id_subject,id_student) values (7,3);

insert into students(name_student) values ('Artemisa');
insert into materias(id_subject,id_student) values (2,4);
insert into materias(id_subject,id_student) values (6,4);
insert into materias(id_subject,id_student) values (8,4);

insert into students(name_student) values ('Atenea');
insert into materias(id_subject,id_student) values (2,5);
insert into materias(id_subject,id_student) values (6,5);
insert into materias(id_subject,id_student) values (8,5);

insert into students(name_student) values ('Dionisio');
insert into materias(id_subject,id_student) values (2,6);
insert into materias(id_subject,id_student) values (6,6);
insert into materias(id_subject,id_student) values (8,6);

insert into students(name_student) values ('Hefesto');
insert into materias(id_subject,id_student) values (3,7);
insert into materias(id_subject,id_student) values (9,7);

insert into students(name_student) values ('Hera');
insert into materias(id_subject,id_student) values (3,8);
insert into materias(id_subject,id_student) values (9,8);

insert into students(name_student) values ('Hermes');
insert into materias(id_subject,id_student) values (4,9);
insert into materias(id_subject,id_student) values (10,9);

insert into students(name_student) values ('Hades');
insert into materias(id_subject,id_student) values (4,10);
insert into materias(id_subject,id_student) values (10,10);

insert into students(name_student) values ('Poseidon');
insert into materias(id_subject,id_student) values (4,11);
insert into materias(id_subject,id_student) values (10,11);

insert into students(name_student) values ('Zeus');
insert into materias(id_subject,id_student) values (4,12);
insert into materias(id_subject,id_student) values (10,12);