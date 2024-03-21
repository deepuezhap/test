-- use hari;

-- select country_name from countries;

-- select first_name, last_name, email, phone_number from employees;

-- select first_name, last_name from employees where last_name = 'fay';

-- select first_name, last_name, hire_date from employees where last_name = 'Grant' or last_name = 'Whalen';

-- select * from jobs;

-- select first_name, last_name from employees where job_id = 17;

-- select e.first_name, e.last_name from employees e join jobs j on e.job_id = j.job_id where j.job_title = 'Shipping clerk';

-- select e.first_name, e.last_name from employees e join dept d on e.department_id = d.department_id where d.department_id = 8;

-- select department_name from dept order by department_name desc;

-- select first_name, last_name from employees where last_name like 'k%';

-- select first_name, last_name, hire_date from employees where hire_date between '1994-12-31' and '1997-01-01';

-- select job_title from jobs where max_salary < 5000;

-- select * from jobs;

-- select LOWER(email) as email from employees;

-- select first_name, last_name from employees where hire_date between '1994-12-31' and '1996-01-01';

-- insert into employees values (207,'Paul','Newton','p.newton27@sqltutorial.org','555.712.0987','1996-01-30',3,21000.00,101,11,NULL);

-- set SQL_SAFE_UPDATES = 0;
-- delete from dept where department_name = 'Shipping';
-- set SQL_SAFE_UPDATES = 1;

-- select * from employees where dayname(hire_date) = 'thursday';










 