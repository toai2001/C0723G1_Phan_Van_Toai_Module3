create database quan_li_ban_hang1;
use quan_li_ban_hang1;
CREATE TABLE customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(50),
    customer_age INT
);
CREATE TABLE product (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(50),
    product_price INT
);
CREATE TABLE `order` (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    order_date datetime,
    order_total_price INT,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
);
CREATE TABLE order_detail (
    order_id INT,
    product_id INT,
    order_detail_qty INT,
    PRIMARY KEY (order_id , product_id),
    FOREIGN KEY (order_id)
        REFERENCES `order` (order_id),
    FOREIGN KEY (product_id)
        REFERENCES product (product_id)
);
insert into customer(customer_name,customer_age) value('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);
insert into `order` ( customer_id,order_date)VALUES ( 1,'2006/3/21'),( 2, '2006/3/23'),( 1, '2006/3/16');
insert into product(product_name,product_price) value ('May Giat',3),('Tu Lanh',5),('Dieu Hoa',7),('Quat',1),('Bep Dien',2);
insert into order_detail value(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(1,5,4),(2,3,3);


select order_id,order_date,order_total_price
From `order`; 


select distinct customer.customer_name
from customer
join `order` on customer.customer_id=`order`.customer_id;


select distinct product.product_name
from product
join order_detail on product.product_id=order_detail.product_id;


select customer.customer_name from customer
customer
where customer_id not in(select customer_id from `order`);



select order_detail.order_id, `order`.order_date, order_detail.order_detail_qty*product.product_price as amount
from order_detail
join product on order_detail.product_id = product.product_id
join `order` on `order`.order_id = order_detail.order_id;