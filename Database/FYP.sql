create database elb

use elb

create table signup(role varchar(50) ,id int primary key,
username varchar(50) , pass varchar(50), 
sques varchar(100), aques varchar(100))

select * from signup

create table prod(pid int primary key, prodbarcode varchar(90),
p_name varchar(100), p_cat varchar(100), quan int,
spec varchar(250),prprice int)

select * from prod

create table emp (eid int primary key, ename varchar(100),
sr_name varchar(100), p_num int, ecity varchar(50), estate varchar(50),
edes varchar(100)) 

select * from emp

create table quantity (qid int primary key, quantity_no int , prod_id int foreign key references prod(pid))


create table ord(o_num int primary key , c_name varchar(90),
c_cell int, c_address varchar(90),   pid int foreign key references prod(pid),
opname varchar(90),opq int, ops varchar(90),
oprice float , otprice float , opaidpr float,
orempri float , orddisc float, orddisrs float, odeliv float, tobpaid float)

select * from ord

create table ret (r_num int primary key , r_cname varchar(90),
pid int foreign key references prod(pid),
r_ccell int,rpname varchar(90), rpq int)

select * from ret

create table cat (catid int primary key,categ varchar(90))

drop table cat 

select * from cat

select ord.o_num, ord.c_name, ord.c_cell, ord.opname, prod.pid from
ord inner join prod on ord.pid = prod.[pid];

select orders.order_num,prod.prodbarcode, prod.p_name, orders.cust_name, 
orders.cust_cell, prod.prprice,orders.ordremaining,orders.ordtotal 
from ord inner join prod on ord.pid = prod.[pid];



drop table prod
