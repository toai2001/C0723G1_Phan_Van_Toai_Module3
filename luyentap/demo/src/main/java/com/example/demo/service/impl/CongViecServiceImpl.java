package com.example.demo.service.impl;

import com.example.demo.model.CongViecDTO;
import com.example.demo.repo.ICongViecRepo;
import com.example.demo.service.ICongViecService;

import java.util.List;

public class CongViecServiceImpl implements ICongViecService {
    private ICongViecRepo congViecRepo = new ICongViecRepo() {
        @Override
        public List<CongViecDTO> hienthi() {
            return null;
        }

        @Override
        public void themCongViec(CongViecDTO congViecDTO) {

        }

        @Override
        public void xoaCongViec(int maCongViec) {

        }
    };

    @Override
    public List<CongViecDTO> hienthi() {
        return null;
    }

    @Override
    public void themCongViec(CongViecDTO congViecDTO) {

    }

    @Override
    public void xoaCongViec(int maCongViec) {

    }
}
