package com.example.demo.repo;

import com.example.demo.model.CongViecDTO;

import java.util.List;

public interface ICongViecRepo {
    List<CongViecDTO>hienthi();
    void  themCongViec(CongViecDTO congViecDTO);
    void xoaCongViec(int maCongViec);
}
