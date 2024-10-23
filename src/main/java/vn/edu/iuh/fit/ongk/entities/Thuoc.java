/*
 * @ (#) Thuoc.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.entities;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

public class Thuoc {
    private String maThuoc;
    private String tenThuoc;
    private int gia;
    private int namSanXuat;
    private String maLoai;

    public Thuoc() {
    }

    public Thuoc(String maThuoc, String tenThuoc, int gia, int namSanXuat, String maLoai) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
        this.maLoai = maLoai;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    @Override
    public String toString() {
        return "Thuoc{" +
                "maThuoc='" + maThuoc + '\'' +
                ", tenThuoc='" + tenThuoc + '\'' +
                ", gia=" + gia +
                ", namSanXuat=" + namSanXuat +
                ", maLoai='" + maLoai + '\'' +
                '}';
    }
}
