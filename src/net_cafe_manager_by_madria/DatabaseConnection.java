package net_cafe_manager_by_madria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/net_cafe_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(">>> Console: Database Connected Successfully!");
            return conn;
        } catch (SQLException e) {
            System.out.println(">>> Console Error: Connection Failed! " + e.getMessage());
            return null;
        }
    }
}