        <%@ page import="vn.edu.iuh.fit.ongk.repositories.QuanLyLoaiThuocImpl" %>
<%@ page import="vn.edu.iuh.fit.ongk.repositories.QuanLyThuocImpl" %>
<%@ page import="vn.edu.iuh.fit.ongk.entities.Thuoc" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="vn.edu.iuh.fit.ongk.entities.LoaiThuoc" %>
        <%@ page import="vn.edu.iuh.fit.ongk.repositories.impl.QuanLyLoaiThuoc" %>
        <%@ page import="vn.edu.iuh.fit.ongk.repositories.impl.QuanLyThuoc" %>
        <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Danh sách thuốc</title>
</head>
<body>
<h1>21016661_LuongTanDat</h1>
<a href="QuanLyThuocServlet?action=handleFindAll" >Xem danh sách các thuốc</a>
<a href="QuanLyThuocServlet?action=handleFindAllLoaiThuoc" >Xem danh sách các loại thuốc</a>
<a href="addthuocmodel.jsp">Thêm thuốc</a>
</body>
</html>