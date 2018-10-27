# ManyToOne
Hibernate many-to-one implementation

# Please find all the database schema.

```
create database product_db;
use product_db;

create table customer(
id int primary key auto_increment,
name varchar(20)
);

create table phone_number(
id primary key auto_increment,
customer_id int,
number varchar(40),
type varchar(40),
foreign key(customer_id) references(customer)
);

```

