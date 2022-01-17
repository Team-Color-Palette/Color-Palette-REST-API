create table color(
	
    color_id int auto_increment primary key,
    box_id int,
    hex varchar(50) not null, 
    reg_date timestamp Default now(),
    FOREIGN KEY (box_id)
    REFERENCES color_box(box_id) ON DELETE CASCADE
);