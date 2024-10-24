/*
 * @ (#) QuanLyThuocServlet.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.controllers;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.ongk.entities.LoaiThuoc;
import vn.edu.iuh.fit.ongk.entities.Thuoc;
import vn.edu.iuh.fit.ongk.repositories.QuanLyLoaiThuocImpl;
import vn.edu.iuh.fit.ongk.repositories.QuanLyThuocImpl;
import vn.edu.iuh.fit.ongk.repositories.impl.QuanLyLoaiThuoc;
import vn.edu.iuh.fit.ongk.repositories.impl.QuanLyThuoc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/QuanLyThuocServlet")
public class QuanLyThuocServlet extends HttpServlet {
    private QuanLyThuocImpl quanLyThuoc = new QuanLyThuoc();
    private QuanLyLoaiThuocImpl quanLyLoaiThuoc = new QuanLyLoaiThuoc();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String action = req.getParameter("action");
            switch (action) {
                case "handleFindAll":
                    handleFindAll(req, resp);
                    break;
                case "handleFindAllLoaiThuoc":
                    handleFindAllLoaiThuoc(req, resp);
                    break;
                case "handleFindByLoaiThuoc":
                    handleFindByLoaiThuoc(req, resp);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String action = req.getParameter("action");
            switch (action){
                case "handleAddThuoc":
                    handleAddThuoc(req, resp);
                    break;
                default:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private boolean handleAddThuoc(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Thuoc thuoc = extractThuocFromRequest(req);
        if (!validateThuoc(thuoc)) {
            resp.getWriter().println("Thuoc da ton tai");
            return false;
        }
        quanLyThuoc.addThuoc(thuoc);
        req.setAttribute("thuoc", thuoc);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("thuocScreen.jsp");
        requestDispatcher.forward(req, resp);
        return true;
    }

    private Thuoc extractThuocFromRequest(HttpServletRequest req) {
        String maThuoc = req.getParameter("maThuoc");
        String tenThuoc = req.getParameter("tenThuoc");
        int gia = Integer.parseInt(req.getParameter("gia"));
        int namSanXuat = Integer.parseInt(req.getParameter("namSanXuat"));
        String maLoai = req.getParameter("maLoai");
        return new Thuoc(maThuoc, tenThuoc, gia, namSanXuat, maLoai);
    }

    private void handleFindAll(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<Thuoc> thuocList = new ArrayList<>();
        thuocList = quanLyThuoc.findAll();
        req.setAttribute("thuocList", thuocList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("thuocScreen.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void handleFindAllLoaiThuoc(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<LoaiThuoc> loaiThuocList = new ArrayList<>();
        loaiThuocList = quanLyLoaiThuoc.findAll();
        req.setAttribute("loaiThuocList", loaiThuocList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("dashboard.jsp");
        requestDispatcher.forward(req, resp);
    }

    private void handleFindByLoaiThuoc(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String name = req.getParameter("name");
        List<LoaiThuoc> loaiThuocList = new ArrayList<>();
        loaiThuocList = quanLyLoaiThuoc.findByLoaiThuoc(name);
        req.setAttribute("loaiThuocList", loaiThuocList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("dashboard.jsp");
        requestDispatcher.forward(req, resp);
    }

    private boolean validateThuoc(Thuoc thuoc) throws Exception {
        if (quanLyThuoc.findById(thuoc.getMaThuoc()).isPresent()) {
            return false;
        }
        return true;
    }
}
