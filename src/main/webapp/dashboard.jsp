<%@ page import="vn.edu.iuh.fit.ongk.repositories.QuanLyLoaiThuocImpl" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.QuanLyThuocImpl" %>
<%@ page import="vn.edu.iuh.fit.ongk.entities.Thuoc" %>
<%@ page import="vn.edu.iuh.fit.ongk.entities.LoaiThuoc" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.impl.QuanLyLoaiThuoc" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.impl.QuanLyThuoc" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 10/23/2024
  Time: 9:12 PM
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

<h1>Danh sách loại thuốc</h1>
<a href="addthuocmodel.jsp">Thêm thuốc</a>
<table class = "table">
    <thead>
        <tr>
            <th>#</th>
            <th>Mã loại thuốc</th>
            <th>Tên loại thuốc</th>
        </tr>
        <tbody>
            <%
                int length = allThuoc.size();
                for (int i = 0; i < length; i++) {
                    LoaiThuoc loaiThuoc = allLoaiThuoc.get(i);
            %>
            <tr>
                <td>
                    <%=i + 1%>
                </td>
                <td>
                    <%= loaiThuoc.getMaLoai()%>
                </td>
                <td>
                    <%= loaiThuoc.getTenLoai()%>
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
