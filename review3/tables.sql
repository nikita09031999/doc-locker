drop database doc_locker;

create schema doc_locker;

use doc_locker;

create table user_info_tbl(user_id int primary key auto_increment, firstname varchar(25), lastname varchar(25), user_name varchar(25), password varchar(15), email varchar(250), mobile_no bigint);

create table doc_info_tbl(doc_id int primary key auto_increment, file_name varchar(25), file_size float, upload_date date, doc_type varchar(10), user_id int , foreign key(user_id) references user_info_tbl(user_id));

create table doc_cat_tbl(group_id int primary key auto_increment, category_name varchar(25),user_id int not null,  foreign key(user_id) references user_info_tbl(user_id),doc_id int not null, foreign key(doc_id) references doc_info_tbl(doc_id));

create table request_tbl(req_id int primary key auto_increment, req_desc varchar(100), req_link varchar(250), startdate date , end_date date, access_level varchar(50));

create table req_doc_tbl(req_doc_id int primary key auto_increment,doc_id int, foreign key(doc_id) references doc_info_tbl(doc_id),req_id int, foreign key(req_id) references request_tbl(req_id));

show tables;

desc user_info_tbl;

desc doc_info_tbl;

desc doc_cat_tbl;

desc request_tbl;

desc req_doc_tbl;

insert into user_info_tbl values(default, "Nikita","Ingale", "nikita","nikita","nikita.ingale24@gmail.com",8149420579);
insert into user_info_tbl values(default, "Shrikant","Kolhatkar", "shri","shri","shrikolhatkar@gmail.com",9767479189);

select * from user_info_tbl;

insert into doc_info_tbl values(default,"review1",25.2,"2022/09/09","pdf",1);
insert into doc_info_tbl values(default,"review2",69.2,"2022/09/18","xlsx",2);

select * from doc_info_tbl;

insert into doc_cat_tbl values(default,"personal_Doc",1,1);
insert into doc_cat_tbl values(default,"certificates",2,2);

select * from doc_cat_tbl;

insert into request_tbl values(default,"verification","https://www.javatpoint.com/mysql-foreign-key","2022/5/17","2022/6/29","read-only");
insert into request_tbl values(default,"passport","https://www.javatpoint.com/mysql-foreign-key","2022/12/25","2022/6/6","download");

select * from request_tbl;

insert into req_doc_tbl values(default,1,1);
insert into req_doc_tbl values(default,2,2);

select * from req_doc_tbl;

