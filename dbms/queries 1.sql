select country_name from countries;
select email,phone_number from employees;
select * from employees where last_name = 'fay';
select first_name,last_name,hire_date from employees where last_name='grant' or last_name = 'whalen';

select * from employees where department_id = 8;
select distinct(department_name) from departments order by department_name desc;
select * from employees where last_name like  'k%';
select * from employees where hire_date between '1994-12-31' and '1998-01-01';
select * from jobs where max_salary < 5000;
select lower(email) from employees;
select first_name from employees where hire_date between '1994-12-31' and '1996-01-01';
insert into employees values(207,'Paul','Newton','paul@gmail,com','9495448602','1998-10-23',6,19000,100,11);
select * from departments;
select * from employees;
set sql_safe_updates= 0;
delete from departments where department_name = 'Shipping';



