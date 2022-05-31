package com.chainsys.jdbc;


import java.sql.*;

import java.io.*;

public class Stored_DB1 {

    public static void main(String args[]) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Chikabi@798999");

        PreparedStatement ps = con.prepareStatement("insert into empo values(?,?,?)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("enter id:");
            int id = Integer.parseInt(br.readLine());
            System.out.println("enter name:");
            String name = br.readLine();
            System.out.println("enter salary:");
            float salary = Float.parseFloat(br.readLine());

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setFloat(3, salary);
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");

            System.out.println("Do you want to continue: y/n");
            String s = br.readLine();
            if (s.startsWith("n")) {
                break;
            }
        } while (true);

        con.close();
    }
}