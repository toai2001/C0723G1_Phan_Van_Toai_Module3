create database demo1;
use demo1;

create table may_tinh(
ma_may_tinh int key auto_increment,
hang_san_xuat varchar(50) NOT NULL,
vi_tri_dat_may 	varchar(45) NOT NULL unique
);
create table loai_khach(
ma_loai_khach int key auto_increment,
ten_loai_khach varchar(45) NOT NULL
);
create table khach_hang(
ma_khach_hang int key auto_increment,
ten varchar (50) NOT NULL,
so_dien_thoai varchar (50),
email varchar (50),
loai_khach_hang varchar(50),
ma_loai_khach int,
foreign key(ma_loai_khach)references loai_khach(ma_loai_khach)
);

create table dich_vu_di_kem (
ma_dich_vu_di_kem int key auto_increment,
ten_dich_vu varchar(45)
);
create table hoa_don(
ma_hoa_don int key auto_increment,
ma_khach_hang int,
thoi_gian_bat_dau datetime,
thoi_gian_ket_thuc datetime,
ma_may_tinh int,
foreign key (ma_may_tinh)references may_tinh(ma_may_tinh),
foreign key(ma_khach_hang) references khach_hang (ma_khach_hang 	)
);
create table hoa_don_chi_tiet(
ma_hoa_don_chi_tiet int key auto_increment,
ma_hoa_don int,
ma_dich_vu_di_kem int,
so_luong int,
foreign key(ma_hoa_don) references hoa_don(ma_hoa_don),
foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);