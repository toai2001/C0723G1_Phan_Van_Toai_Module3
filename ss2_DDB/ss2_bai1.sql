create database quan_li_vat_lieu;
use quan_li_vat_lieu;
create table NHACUNGCAP(
mncc int primary key auto_increment,
tenncc varchar(50) NOT NULL,
diachi varchar(50) NOT NULL
);
create table DONDH(
sodh int primary key auto_increment,
ngaydh varchar(50),
mncc int,
foreign key(mncc)references NHACUNGCAP (mncc)
);
create table SDT(
mncc int,
sdt varchar(50),
primary key(mncc,sdt),
foreign key(mncc)references NHACUNGCAP (mncc)
);

create table VATTU(
mavtu int primary key auto_increment,
tenvtu varchar(50) NOT NULL
);
create table CT_DONDATHANG(
mavtu int,
sodh int ,
foreign key(mavtu)references VATTU (mavtu),
foreign key(sodh)references DONDH (sodh)
);
create table PHIEUXUAT(
sopx int primary key auto_increment,
ngayxuat date
);
create table CT_PHIEUXUAT(
dgxuat varchar(50) NOT NULL,
slxuat int check(SLXuat>0),
mavtu int,
sopx int,
foreign key(mavtu)references VATTU(mavtu),
foreign key(sopx)references PHIEUXUAT(sopx)
);
create table PHIEUNHAP(
sopn int primary key auto_increment,
ngaynhap date
);
create table CT_PHIEUNHAP(
mavtu int,
sopn int,
dgnhap varchar(50) NOT NULL,
slnhap int check(SLNhap>0),
foreign key(sopn)references PHIEUNHAP (sopn),
foreign key(mavtu)references VATTU(mavtu)
);



