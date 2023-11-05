package com.example.demo.repo.impl;

import com.example.demo.model.TrangThai;
import com.example.demo.repo.BaseRepository;
import com.example.demo.repo.ITrangThaiRepo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TrangThaiRepoImpl implements ITrangThaiRepo {
    private static final String HIEN_THI ="SELECT *FROM trang_thai;";
    @Override
    public List<TrangThai> hienThiTrangThai() {
        List<TrangThai> dsTrangThai = new ArrayList<>();
        BaseRepository baseRepository = new BaseRepository();
        TrangThai trangThai = null;
        Connection connection = baseRepository.getConnection();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(HIEN_THI);
            while (resultSet.next()){
                int maTrangThai =resultSet.getInt("ma_trang_thai");
                String tenTrangThai = resultSet.getString("ten_trang_thai");
                trangThai=new TrangThai(maTrangThai,tenTrangThai);
                dsTrangThai.add(trangThai);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dsTrangThai;
    }
}
