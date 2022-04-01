create database  if not exists smvc_test;

use smvc_test;

create table if not exists T01( id int auto_increment not null, username varchar(20), age int, token char(10), primary key(id) )engine=InnoDB default charset=utf8;

insert into T01(id,username,age,token)values(1,'张三',22,'abcd'),(2,'李四',33,'abcd'),(3,'王二',44,'abcd');
