/*
 * @ (#) QuanLyLoaiThuocImpl.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.repositories;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

import vn.edu.iuh.fit.ongk.entities.LoaiThuoc;
import vn.edu.iuh.fit.ongk.entities.Thuoc;

import java.util.List;

public interface QuanLyLoaiThuocImpl {
    public List<LoaiThuoc> findAll();
     public List<LoaiThuoc> findByLoaiThuoc(String loaiThuoc);
}
