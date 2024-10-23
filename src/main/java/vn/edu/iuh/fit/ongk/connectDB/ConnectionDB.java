/*
 * @ (#) ConnectionDB.java       1.0     10/23/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.ongk.connectDB;
/*
 * @description:
 * @author: Luong Tan Dat
 * @date: 10/23/2024
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static Connection connection;

    public static Connection getConnection(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/ongk";
            connection = DriverManager.getConnection(url, "root", "root");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
