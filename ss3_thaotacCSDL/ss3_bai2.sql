create database quan_li_ban_hang1;
use quan_li_ban_hang1;
CREATE TABLE customer (
    cId INT PRIMARY KEY AUTO_INCREMENT,
    cName VARCHAR(50),
    cAge INT
);
CREATE TABLE product (
    pId INT PRIMARY KEY AUTO_INCREMENT,
    pName VARCHAR(50),
    pPrice INT
);
CREATE TABLE `order` (
    oId INT PRIMARY KEY AUTO_INCREMENT,
    cId INT,
    oDate datetime,
    oTotalPrice INT,
    FOREIGN KEY (cId)
        REFERENCES customer (cId)
);
CREATE TABLE order_detail (
    oId INT,
    pId INT,
    odQTY INT,
    PRIMARY KEY (oId , pId),
    FOREIGN KEY (oId)
        REFERENCES `order` (oId),
    FOREIGN KEY (pId)
        REFERENCES product (pId)
);
insert into customer(cName,cAge) value('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);
insert into `order` ( cId,oDate)VALUES ( 1,'2006/3/21'),( 2, '2006/3/23'),( 1, '2006/3/16');
insert into product(pName,pPrice) value ('May Giat',3),('Tu Lanh',5),('Dieu Hoa',7),('Quat',1),('Bep Dien',2);
insert into order_detail value(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(1,5,4),(2,3,3);


select oId,oDate,oTotalPrice
From `order`; 


select distinct customer.cName
from customer
join `order` on customer.cId=`order`.cId;


select distinct product.pName
from product
join order_detail on product.pId=order_detail.pId;


select customer.cName from customer
customer
where cId not in(select cId from `order`);



select order_detail.oId, `order`.oDate, order_detail.odQTY*product.pPrice as amount
from order_detail
join product on order_detail.pId = product.pId
join `order` on `order`.oId = order_detail.oId;