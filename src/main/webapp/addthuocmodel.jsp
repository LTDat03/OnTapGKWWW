<%--
  Created by IntelliJ IDEA.
  User: luong
  Date: 10/23/2024
  Time: 9:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="QuanLyThuocServlet" method="post">
    <input type="hidden" name="action" value="handleAddThuoc">
    Mã Thuốc<input type="text" id="maThuoc" name="maThuoc">
    <hr>
    Tên thuốc<input type="text" id="tenThuoc" name="tenThuoc">
    <hr>
    Giá<input type="text" id="gia" name="gia">
    <hr>
    Năm sản xuất<input type="text" id="namSanXuat" name="namSanXuat">
    <hr>
    Mã Loại<input type="text" id="maLoai" name="maLoai">
    <button type="submit" value="handleAddThuoc">Thêm</button>
</form>
<a href="index.jsp">Quay lại</a>
</body>
</html>
