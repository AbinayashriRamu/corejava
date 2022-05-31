package com.chainsys.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Filer {
    public static void main(String args[]) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Chikabi@798999");
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select * from employees");

        //getting the record of 3rd row  
        rs.absolute(5);
        System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

        con.close();
    }

}