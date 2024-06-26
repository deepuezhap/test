create database university;
use university;
create table student(
name varchar(200),
student_number int primary key,
class int,
major varchar(200)
);

desc student;

create table course(
course_name varchar(200),
course_number varchar(200) primary key,
credit_hours int,
department varchar(200)
);

create table section(
section_identifier int primary key,
course_number varchar(200),
semester varchar(200),
year int,
instructor varchar(200),
foreign key (course_number) references course(course_number)

);

create table grade_report(
student_number int,
section_identifier int,
grade varchar(200),
primary key(student_number,section_identifier),
foreign key (student_number) references student(student_number),
foreign key (section_identifier) references section(section_identifier)
);

create table prerequisite(
course_number varchar(200),
prerequisite_number varchar(200),
foreign key (prerequisite_number) references section(course_number),
foreign key (course_number) references section(course_number),
primary key(course_number,prerequisite_number)
);

insert into student values ("Smith",17,1,"CS"),("Brown",8,2,"CS");



insert into course values ("intro to computer science","CS1310",4,"CS");
insert into course values('data structure', 'CS3320', 4, 'CS'),('discrete mathematics', 'MATH2410', 3, 'MATH'),('database', 'CS3380', 3, 'CS');

insert into section values(85, 'MATH2410', 'Fall', 07, 'King');
insert into section values(92, 'CS1310', 'Fall', 07, 'Anderson');
insert into section values(102, 'CS3320', 'Spring', 08, 'Knuth');
insert into section values(112, 'MATH2410', 'Fall', 08, 'Chang');
insert into section values(119, 'CS1310', 'Fall', 08, 'Anderson');
insert into section values(135, 'CS3380', 'Fall', 08, 'Stone');


insert into grade_report values(17, 112, 'B'),(17, 119, 'C'),(8, 85, 'A'),(8, 92, 'A'),(8, 102, 'A'),(8, 135, 'A');




insert into prerequisite values('CS3380', 'CS3320');
insert into prerequisite values('CS3380', 'MATH2410');
insert into prerequisite values('CS3320', 'CS1310');


desc course;
select * from grade_report;

select course_name,credit_hours,department,semester,year,instructor from course inner join section where course.course_number=section.course_number;



select student.name,course_name,grade from student 
inner join grade_report on student.student_number = grade_report.student_number 
inner join section on grade_report.section_identifier=section.section_identifier 
inner join course on section.course_number=course.course_number
where student.name="smith";

select student.name,grade from course
inner join section on course.course_number=section.course_number
inner join grade_report on section.section_identifier = grade_report.section_identifier
inner join student on student.student_number=grade_report.student_number
where course_name = "database" and semester="fall" and year=8;

-- question 5  
select prerequisite.prerequisite_number from course
inner join prerequisite on course.course_number=prerequisite.course_number
where course_name="database";


-- question 6 
select name from student where major="CS";

-- question 7
select c.Course_name from course c inner join section s on c.Course_number=s.Course_number
where s.Instructor="King" and Year in (07,08);


select c.Course_name from course c inner join section s on c.Course_number=s.Course_number
 where s.Instructor="King" and Year in (07,08);

select Course_number,Semester,Year, Instructor,count(Student_number) from section inner join 
Grade_report on Section.Section_identifier=Grade_report.Section_identifier 
group by Grade_report.Section_identifier having instructor="King"; 

select Name,course.Course_number,Course_name,Credit_hours,Semester,Year,Grade 
from student inner join grade_report on student.Student_number = grade_report.Student_number 
inner join section on grade_report.Section_identifier=section.Section_identifier 
inner join course on section.Course_number=course.Course_number where Class=2 and Major="cs";

insert into Student values('Johnson',25,1,'Math');


SET SQL_SAFE_UPDATES=0;
update Student set class=2 where Name='Smith';
SET SQL_SAFE_UPDATES=1;

insert into Course values("Knowledge Engineering","CS4390",3,"CS");

delete from student where name="Smith" and student_number=17;

create view stud as select Name from student where major="CS";

select * from stud;



