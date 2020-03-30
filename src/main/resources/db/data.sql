create table user (
                      id int unsigned auto_increment primary key,
                      name varchar(20) not null default '',
                      age int null,
                      creat_time datetime not null default current_timestamp
);
insert into user (name,age)
values ('a1',10) , ('a2',11) , ('a3',12);
