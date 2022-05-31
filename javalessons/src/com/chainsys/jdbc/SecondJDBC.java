package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondJDBC {
    
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER = "system";
    static final String PASS = "Chikabi@798999";
    static final String QUERY = "SELECT Last_name FROM Employees";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name

                System.out.println("Last_Name: " + rs.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}