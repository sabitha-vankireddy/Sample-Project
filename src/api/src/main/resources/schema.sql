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
