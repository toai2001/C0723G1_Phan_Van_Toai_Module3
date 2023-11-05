package com.example.demo.model;

public class CongViec {
    private int maCongViec;
    private String tenCongViec;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String moTa;

    public CongViec() {
    }

    public CongViec(int congViec, String tenCongViec, String ngayBatDau, String ngayKetThuc, String moTa) {
        this.maCongViec = congViec;
        this.tenCongViec = tenCongViec;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.moTa = moTa;
    }

    public int getCongViec() {
        return maCongViec;
    }

    public void setCongViec(int congViec) {
        this.maCongViec = congViec;
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
}
