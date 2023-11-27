drop table if exists guest;

create table guest(id int primary key auto_increment,name varchar,role varchar);
insert into guest(name,role) values('小杰','学生');
insert into guest(name,role) values('zzt','教师');
insert into guest(name,role) values('dmc','教师');