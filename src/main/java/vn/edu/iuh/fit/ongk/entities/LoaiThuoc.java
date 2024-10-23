/*
 * @ (#) LoaiThuoc.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.entities;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

public class LoaiThuoc {
    private String maLoai;
    private String tenLoai;

    public LoaiThuoc() {
    }

    public LoaiThuoc(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "LoaiThuoc{" +
                "maLoai='" + maLoai + '\'' +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }
}
