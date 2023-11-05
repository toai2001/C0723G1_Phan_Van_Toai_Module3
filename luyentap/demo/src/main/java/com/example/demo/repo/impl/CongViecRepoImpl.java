package com.example.demo.repo.impl;

import com.example.demo.model.CongViecDTO;
import com.example.demo.repo.BaseRepository;
import com.example.demo.repo.ICongViecRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CongViecRepoImpl implements ICongViecRepo {
    private static final String HIEN_THI = "SELECT * FROM cong_viec c\n" +
            "join trang_thai t on  c.ma_trang_thai=t.ma_trang_thai\n" +
            "WHERE c.xoa_cv = 0;";
    private static final String THEM_CONG_VIEC = "INSERT INTO cong_viec (ten_cong_viec,ngay_bat_dau,ngay_ket_thuc,ma_trang_thai,mo_ta)\\n\" +\n" +
            "            \"VALUES(?,?,?,?,?);";
        private static final String XOA_CONG_VIEC="UPDATE  cong_viec \n" +
                "SET xoa_cv = 1\n" +
                "WHERE ma_cong_viec=?;";
    @Override
    public List<CongViecDTO> hienthi() {
        List<CongViecDTO>dsCongViec = new ArrayList<>();
        CongViecDTO congViecDTO = null;
        BaseRepository baseRepository = new BaseRepository();
        Connection connection = baseRepository.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(HIEN_THI);
            while (resultSet.next()){
                int maCongViec =resultSet.getInt("ma_cong_viec");
                String tenCongViec =resultSet.getString("ten_cong_viec");
                String ngayBatDau = resultSet.getString("ngay_bat_dau");
                String ngayKetThuc = resultSet.getString("ngay_bat_dau");
                String trangThai = resultSet.getString("trang_thai");
                String moTa = resultSet.getString("mo_ta");
                congViecDTO=new CongViecDTO(maCongViec,tenCongViec,ngayBatDau,ngayKetThuc,trangThai);
                dsCongViec.add(congViecDTO);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dsCongViec;
    }

    @Override
    public void themCongViec(CongViecDTO congViecDTO) {
        BaseRepository baseRepository = new BaseRepository();
        Connection connection = baseRepository.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(THEM_CONG_VIEC);
            preparedStatement.setString(1,congViecDTO.getTenCongViec());
            preparedStatement.setString(2,congViecDTO.getNgayBatDau());
            preparedStatement.setString(3,congViecDTO.getNgayKetThuc());
            preparedStatement.setString(4,congViecDTO.getMoTa());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void xoaCongViec(int maCongViec) {
        BaseRepository baseRepository = new BaseRepository();
        Connection connection = baseRepository.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(XOA_CONG_VIEC);
            preparedStatement.setInt(1,maCongViec);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
