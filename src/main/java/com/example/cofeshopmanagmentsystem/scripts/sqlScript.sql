CREATE TABLE `cafe`.`product` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `prod_id` VARCHAR(100) NULL,
  `prod_name` VARCHAR(100) NULL,
  `stock` INT NULL,
  `price` DOUBLE NULL,
  `status` VARCHAR(100) NULL,
  `image` VARCHAR(500) NULL,
  `date` DATE NULL,
  PRIMARY KEY (`id`));

--  table for employee
  create table cafe.user(
  id int not null auto_increment,
    username varchar(100) null,
    password varchar(100) null,
    question varchar(100) null,
    answer varchar(100) null,
    date date null,
    primary key(id)
  );
--  table for customers
  CREATE TABLE `cafe`.`customer` (
    id INT NOT NULL AUTO_INCREMENT,
    customer_id INT NULL,
    prod_id varchar(100) null,
    prod_name VARCHAR(100) NULL,
    type varchar(100) null,
    quantity INT NULL,
    price DOUBLE NULL,
    date DATE NULL,
    image VARCHAR(500) NULL,
    em_username VARCHAR(100) NULL,
    PRIMARY KEY (id));
--  table for receipt customer_id, total, date, em_username
  CREATE TABLE `cafe`.`receipt` (
    id INT NOT NULL AUTO_INCREMENT,
    customer_id INT NULL,
    total DOUBLE NULL,
    date DATE NULL,
    em_username VARCHAR(100) NULL,
    PRIMARY KEY (id));