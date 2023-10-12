create database quan_li_vat_lieu;
use quan_li_vat_lieu;
create table NHACUNGCAP(
MaNCC int primary key auto_increment,
TenNCC varchar(50) NOT NULL,
DiaChi varchar(50) NOT NULL
);
create table DONDH(
SoDH int primary key auto_increment,
NgayDH varchar(50),
MaNCC int,
foreign key(MaNCC)references NHACUNGCAP (MaNCC)
);
create table SDT(
MaNCC int,
SDT varchar(50),
primary key(MaNCC,SDT),
foreign key(MaNCC)references NHACUNGCAP (MaNCC)
);

create table VATTU(
MaVTU int primary key auto_increment,
TenVTU varchar(50) NOT NULL
);
create table CT_DONDATHANG(
MaVTU int,
SoDH int ,
foreign key(MaVTU)references VATTU (MaVTU),
foreign key(SoDH)references DONDH (SoDH)
);
create table PHIEUXUAT(
SoPx int primary key auto_increment,
NgayXuat date
);
create table CT_PHIEUXUAT(
DGXuat varchar(50) NOT NULL,
SLXuat int check(SLXuat>0),
MaVTU int,
SoPx int,
foreign key(MaVTU)references VATTU(MaVTU),
foreign key(SoPx)references PHIEUXUAT(SoPx)
);
create table PHIEUNHAP(
SoPN int primary key auto_increment,
NgayNhap date
);
create table CT_PHIEUNHAP(
MaVTU int,
SoPN int,
DGNhap varchar(50) NOT NULL,
SLNhap int check(SLNhap>0),
foreign key(SoPN)references PHIEUNHAP (SoPN),
foreign key(MaVTU)references VATTU(MaVTU)
);



