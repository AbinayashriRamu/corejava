package com.chainsys.jdbc;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Stored_DB {
   public static void main(String[] args) {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Chikabi@798999");
          PreparedStatement ps = myCon.prepareStatement("insert into Fish values(?,?)");
          File f = new File("D:\\temp\\Beast.txt");
          FileReader fr = new FileReader(f);
          ps.setInt(1, 101);
          ps.setString(2, "abi");
          int i = ps.executeUpdate();
          ps.setInt(1, 102);
          ps.setCharacterStream(2, fr,(int)f.length());
          int j = ps.executeUpdate();
          int k=i+j;
          System.out.println(k + " " + "record affected");
          myCon.close();
      }catch(Exception err) {
          err.printStackTrace();
      }
}
}