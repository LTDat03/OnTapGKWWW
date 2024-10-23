/*
 * @ (#) QuanLyThuoc.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.repositories;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

import vn.edu.iuh.fit.ongk.entities.Thuoc;

import java.util.List;
import java.util.Optional;

public interface QuanLyThuocImpl {
    public int addThuoc(Thuoc thuoc);
    public List<Thuoc> findAll();
}
