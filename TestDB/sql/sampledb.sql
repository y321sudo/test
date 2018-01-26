drop database if exists sampledb;
create database sampledb;
use sampledb;

create table sample_table(
No int,name varchar(50),age int,Mail varchar(50));

insert into sample_table values(1,"山田",21,"xxx@yahoo.co.jp");
insert into sample_table values(2,"佐藤",39,"yyy@google.com");
insert into sample_table values(3,"原田",44,"zzz@yahoo.co.jp");