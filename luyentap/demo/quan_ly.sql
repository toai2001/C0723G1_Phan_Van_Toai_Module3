create database quan_ly;
use quan_ly;
create table trang_thai(
ma_trang_thai int key auto_increment,
ten_trang_thai varchar(45) not null
);
create table cong_viec(
ma_cong_viec int key auto_increment,
ten_cong_viec varchar(45) not null,
ngay_bat_dau varchar(255) not null,
ngay_ket_thuc varchar(255) not null,
mo_ta text,
xoa_cv int default 0,
ma_trang_thai int not null,
foreign key (ma_trang_thai) references trang_thai(ma_trang_thai)
);
INSERT INTO trang_thai(ten_trang_thai)
VALUES('Chua Lam');
INSERT INTO trang_thai(ten_trang_thai)
VALUES('Dang Lam');
INSERT INTO trang_thai(ten_trang_thai)
VALUES('Da Xong');
SELECT * FROM cong_viec c
join trang_thai t on  c.ma_trang_thai=t.ma_trang_thai
WHERE c.xoa_cv = 0;



