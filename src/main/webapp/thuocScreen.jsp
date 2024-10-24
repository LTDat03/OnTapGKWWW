<%@ page import="vn.edu.iuh.fit.ongk.repositories.QuanLyLoaiThuocImpl" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.QuanLyThuocImpl" %>
<%@ page import="vn.edu.iuh.fit.ongk.entities.Thuoc" %>
<%@ page import="vn.edu.iuh.fit.ongk.entities.LoaiThuoc" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.impl.QuanLyThuoc" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.impl.QuanLyLoaiThuoc" %><%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 10/24/2024
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    QuanLyLoaiThuocImpl quanLyLoaiThuoc = new QuanLyLoaiThuoc();
    QuanLyThuocImpl quanLyThuoc = new QuanLyThuoc();
    List<Thuoc> allThuoc = new ArrayList<>();
    List<LoaiThuoc> allLoaiThuoc = new ArrayList<>();
%>

<%
    allThuoc = quanLyThuoc.findAll();
    allLoaiThuoc = quanLyLoaiThuoc.findAll();
%>

<table class = "table">
    <thead>
        <tr>
            <th>#</th>
            <th>Mã thuốc</th>
            <th>Tên thuốc</th>
            <th>Giá</th>
            <th>Năm SX</th>
        </tr>
        <tbody>
            <%
                int length = allThuoc.size();
                for (int i = 0; i < length; i++) {
                    Thuoc thuoc = allThuoc.get(i);
            %>
            <tr>
                <td>
                    <%=i + 1%>
                </td>
                <td>
                    <%= thuoc.getMaThuoc()%>
                </td>
                <td>
                    <%= thuoc.getTenThuoc()%>
                </td>
                <td>
                    <%= thuoc.getGia()%>
                </td>
                <td>
                    <%= thuoc.getNamSanXuat()%>
                </td>
            </tr>
<%
                }
%>
        </tbody>
    </thead>
</table>
<a href="index.jsp">Quay lại</a>
</body>
</html>
