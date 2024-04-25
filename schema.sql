create table netology_joins.customers(
                                         id serial primary key,
                                         name varchar(50) not null,
                                         surname varchar(50) not null,
                                         age int not null,
                                         phone_number varchar(20));
create table netology_joins.orders(
                       id serial primary key,
                       date timestamp not null,
                       customer_id integer references customers(id),
                       product_name varchar not null,
                       amount bigint not null);