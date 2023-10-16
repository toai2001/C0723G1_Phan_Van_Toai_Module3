create database quan_li_ban_hang;
use quan_li_ban_hang;
create table customer(
cid int primary key auto_increment,
cName varchar(50),
cAge int
);
create table product(
pId int primary key auto_increment,
pName varchar(50),
pPrice int
);
create table `order`(
oId int primary key auto_increment,
cId int,
oDate datetime,
oTotalPrice int,
foreign key(cId)references customer(cId)
);
create table orderDetail(
oId int,
pId int,
odQTY int,
primary key(oId,pId),
foreign key(oId)references `order`(oId),
foreign key(pId)references product(pId)
);
