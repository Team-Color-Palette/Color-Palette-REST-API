create table user(
	id varchar(100) primary key,
    password varchar(100) not null,
	name varchar(20) not null,
	join_date timestamp default now()
);