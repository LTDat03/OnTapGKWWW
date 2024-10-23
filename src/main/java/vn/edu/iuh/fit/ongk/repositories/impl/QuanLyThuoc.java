/*
 * @ (#) QuanLyThuoc.java       1.0     10/23/2024
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
import vn.edu.iuh.fit.ongk.entities.Thuoc;
import vn.edu.iuh.fit.ongk.repositories.QuanLyThuocImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuanLyThuoc implements QuanLyThuocImpl {
    Connection connection = ConnectionDB.getConnection();
    @Override
    public int addThuoc(Thuoc thuoc) {
        String sql = "INSERT INTO thuoc (maThuoc, tenThuoc, donGia, namSX, maLoai) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, thuoc.getMaThuoc());
            preparedStatement.setString(2, thuoc.getTenThuoc());
            preparedStatement.setInt(3, thuoc.getGia());
            preparedStatement.setInt(4, thuoc.getNamSanXuat());
            preparedStatement.setString(5, thuoc.getMaLoai());
            return preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Thuoc> findAll() {
        List<Thuoc> listThuoc = new ArrayList<>();
        String sql = "SELECT * FROM thuoc";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String maThuoc = resultSet.getString(1);
                String tenThuoc = resultSet.getString(2);
                int donGia = resultSet.getInt(3);
                int namSX = resultSet.getInt(4);
                String maLoai = resultSet.getString(5);
                Thuoc thuoc = new Thuoc(maThuoc, tenThuoc, donGia, namSX, maLoai);
                listThuoc.add(thuoc);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listThuoc;
    }
}
