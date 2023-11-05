package com.example.demo.model;

public class CongViecDTO {
    private int maCongViec;
    private String tenCongViec;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String moTa;
    private int maTrangThai;
    private String tenTrangThai;

    public CongViecDTO(String maCongViec, String tenCongViec, String ngayBatDau, String ngayKetThuc, int trangThai) {
    }

    public CongViecDTO(int maCongViec, String tenCongViec, String ngayBatDau, String ngayKetThuc, String moTa, int maTrangThai, String tenTrangThai) {
        this.maCongViec = maCongViec;
        this.tenCongViec = tenCongViec;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.moTa = moTa;
        this.maTrangThai = maTrangThai;
        this.tenTrangThai = tenTrangThai;
    }

    public int getMaCongViec() {
        return maCongViec;
    }

    public void setMaCongViec(int maCongViec) {
        this.maCongViec = maCongViec;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getMaTrangThai() {
        return maTrangThai;
    }

    public void setMaTrangThai(int maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }
}
