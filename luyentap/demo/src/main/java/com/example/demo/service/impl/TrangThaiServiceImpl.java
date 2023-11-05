package com.example.demo.service.impl;

import com.example.demo.model.TrangThai;
import com.example.demo.repo.ITrangThaiRepo;
import com.example.demo.repo.impl.TrangThaiRepoImpl;
import com.example.demo.service.ITrangThaiService;

import java.util.List;

public class TrangThaiServiceImpl implements ITrangThaiService {
    private ITrangThaiRepo trangThaiRepo = new ITrangThaiRepo() {
        @Override
        public List<TrangThai> hienThiTrangThai() {
            return trangThaiRepo.hienThiTrangThai();
        }
    };
    @Override
    public List<TrangThai> hienThiTrangThai() {
        return trangThaiRepo.hienThiTrangThai();
    }
}
