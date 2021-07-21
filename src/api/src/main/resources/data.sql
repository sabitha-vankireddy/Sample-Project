DROP TABLE IF EXISTS departments;
CREATE TABLE departments(
                            id int AUTO_INCREMENT  PRIMARY KEY,
                            name varchar(1000) NOT NULL
);

DROP TABLE IF EXISTS employees;
CREATE TABLE employees(
                          id int AUTO_INCREMENT  PRIMARY KEY,
                          name varchar(1000) NOT NULL
);

INSERT INTO departments(name) values ('engineering');
INSERT INTO departments(name) values ('accounts');
INSERT INTO employees(name) values ('ram');
INSERT INTO employees(name) values ('sam');
