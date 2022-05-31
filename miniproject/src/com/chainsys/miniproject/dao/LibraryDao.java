package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.chainsys.miniproject.pojo.Library;

public class LibraryDao {
	private static Connection getConnection() {
		String drivername = "oracle.jdbc.OracleDriver";
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "Chikabi@798999";

		try {
			Class.forName(drivername);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Connection co = null;
		try {
			co = DriverManager.getConnection(dburl, username, password);
		} catch (Exception err) {
			err.printStackTrace();
		}

		return co;

	}
public static int InsertLibraryBooks(Library newlib) {
	String insertquery="insert into Library(Lib_name,book_name,Author_name,Book_Id,City)values(?,?,?,?,?)";
	Connection co=null;
	int rows=0;
	PreparedStatement pps=null;
	try {
		co=getConnection();
		pps=co.prepareStatement(insertquery);
		pps.setString(1, newlib.getLib_Name());
		pps.setString(2,newlib.getAuthor_name());
		pps.setInt(3, newlib.getBook_Id());
		pps.setString(4, newlib.getCity());
		pps.setString(5, newlib.getBook_name());
		rows=pps.executeUpdate();
	}catch(Exception e) {
		
	}
	return 0;
}
}
