package com.example.demo.service;

import com.example.demo.model.CongViecDTO;

import java.util.List;

public interface ICongViecService {
    List<CongViecDTO> hienthi();
    void  themCongViec(CongViecDTO congViecDTO);
    void xoaCongViec(int maCongViec);
}
