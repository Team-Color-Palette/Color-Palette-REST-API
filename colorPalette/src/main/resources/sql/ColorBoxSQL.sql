create table color_box(
	id int auto_increment primary key,
    hex varchar(50) not null
);

alter table color_box add box_like int default 0
alter table color_box add favorites boolean default 0; 