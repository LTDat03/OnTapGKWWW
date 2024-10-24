/*
 * @ (#) QuanLyLoaiThuoc.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.repositories.impl;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

import vn.edu.iuh.fit.ongk.connectDB.ConnectionDB;
import vn.edu.iuh.fit.ongk.entities.LoaiThuoc;
import vn.edu.iuh.fit.ongk.entities.Thuoc;
import vn.edu.iuh.fit.ongk.repositories.QuanLyLoaiThuocImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class QuanLyLoaiThuoc implements QuanLyLoaiThuocImpl {
    Connection connection = ConnectionDB.getConnection();
    @Override
    public List<LoaiThuoc> findAll() {
        List<LoaiThuoc> listLoaiThuoc = new ArrayList<>();
        String sql = "SELECT * FROM loaithuoc";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String maLoai = resultSet.getString(1);
                String tenLoai = resultSet.getString(2);
                LoaiThuoc loaiThuoc = new LoaiThuoc(maLoai,tenLoai);
                listLoaiThuoc.add(loaiThuoc);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listLoaiThuoc;
    }
    @Override
    public List<LoaiThuoc> findByLoaiThuoc(String loaiThuoc) {
        List<LoaiThuoc> listLoaiThuoc = new ArrayList<>();
        String sql = "SELECT * FROM thuoc WHERE loaiThuoc = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String maLoai = resultSet.getString(1);
                String tenLoai = resultSet.getString(2);
                LoaiThuoc loai = new LoaiThuoc(maLoai, tenLoai);
                listLoaiThuoc.add(loai);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listLoaiThuoc;
    }

    @Override
    public Optional<LoaiThuoc> findById(String id) throws SQLException {
        String sql = "SELECT * FROM loaithuoc WHERE maLoai = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            String maLoai = resultSet.getString(1);
            String tenLoai = resultSet.getString(2);
            LoaiThuoc loaiThuoc = new LoaiThuoc(maLoai, tenLoai);
            return Optional.of(loaiThuoc);
        }
        return Optional.empty();
    }

}
