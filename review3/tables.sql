/*drop database project2;*/

create schema project2;

use project2;

create table user_info_tbl(user_id int primary key auto_increment, firstname varchar(25), lastname varchar(25), user_name varchar(25), password varchar(15), email varchar(250), mobile_no bigint);

create table doc_info_tbl(doc_id int primary key auto_increment, file_name varchar(25), file_size float, upload_date date, doc_type varchar(10), user_id int , foreign key(user_id) references user_info_tbl(user_id));

create table doc_cat_tbl(group_id int primary key auto_increment, category_name varchar(25),user_id int not null,  foreign key(user_id) references user_info_tbl(user_id),doc_id int not null, foreign key(doc_id) references doc_info_tbl(doc_id));

create table request_tbl(req_id int primary key auto_increment, req_desc varchar(100), req_link varchar(250), startdate date , end_date date, access_level varchar(50));

create table req_doc_tbl(req_doc_id int primary key auto_increment,doc_id int, foreign key(doc_id) references doc_info_tbl(doc_id),req_id int, foreign key(req_id) references request_tbl(req_id));

create table user_tbl(id int primary key auto_increment, session_id int)

show tables;

desc user_info_tbl;

desc doc_info_tbl;

desc doc_cat_tbl;

desc request_tbl;

desc req_doc_tbl;

desc user_tbl;


