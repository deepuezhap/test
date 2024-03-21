-- create database Employee; 
-- use Employee;


-- create table jobs(
-- job_id int primary key,
-- job_title varchar(20),
-- min_salary int,
-- max_salary int
-- );



-- create table regions(
-- region_id int primary key,
-- region_name varchar(20)
-- );

-- create table countries(
-- country_id int primary key,
-- country_name varchar(20),
-- region_id int,
-- foreign key (region_id) references regions(region_id)
-- );

-- create table locations(
-- location_id int primary key,
-- street_address varchar(20),
-- postal_code int,
-- city varchar(20),
-- state_province varchar(20),
-- country_id int,
-- foreign key (country_id) references countries(country_id)
-- );


-- create table departments(
-- department_id int primary key,
-- department_name varchar(20),
-- location_id int,
-- foreign key (location_id) references locations(location_id)
-- );





-- create table employees(
-- employee_id int primary key,
-- first_name varchar(20),
-- last_name varchar(20),
-- email varchar(20),
-- phone_number varchar(20),
-- hire_date date,
-- job_id int,
-- salary int,
-- manager_id int,
-- department_id int,
-- foreign key (job_id) references jobs(job_id),
-- foreign key (department_id) references departments(department_id),
-- foreign key (manager_id) references employees(employee_id)
-- );


-- create table dependents(
-- dependent_id int primary key,
-- first_name varchar(20),
-- last_name varchar(20),
-- relationship varchar(20),
-- employee_id int,
-- foreign key (employee_id) references employees(employee_id)
-- );



-- show tables;
-- alter table departments rename to dept; 
-- show tables;


-- desc employees;
-- alter table employees modify column salary smallint;
-- desc employees;


-- desc employees;
-- alter table employees add column commission varchar(20);
-- desc employees;



-- INSERT INTO regions(region_id,region_name) VALUES (1,'Europe');
-- INSERT INTO regions(region_id,region_name) VALUES
-- (2,'Americas'); INSERT INTO regions(region_id,region_name)
-- VALUES (3,'Asia');
-- INSERT INTO regions(region_id,region_name) VALUES (4,'Middle East and
-- Africa');

-- select * from regions;



select * from INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE TABLE_NAME='locations';

-- alter table locations drop foreign key ;
-- alter table countries modify column country_id varchar(20);
-- desc countries;



-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('AR','Argentina',2);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('AU','Australia',3);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('BE','Belgium',1);
-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('BR','Brazil',2);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('CA','Canada',2);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('CH','Switzerland',1);
-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('CN','China',3);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('DE','Germany',1);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('DK','Denmark',1);
-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('EG','Egypt',4);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('FR','France',1);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('HK','HongKong',3);
-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('IL','Israel',4);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('IN','India',3);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('IT','Italy',1);
-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('JP','Japan',3);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('KW','Kuwait',4);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('MX','Mexico',2);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('NG','Nigeria',4);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('NL','Netherlands',1);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('SG','Singapore',3);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('UK','United Kingdom',1);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('US','United States of America',2);
-- INSERT INTO countries(country_id,country_name,region_id) VALUES
-- ('ZM','Zambia',4);
-- INSERT INTO countries(country_id,country_name,region_id)
-- VALUES ('ZW','Zimbabwe',4);

-- select * from regions;





