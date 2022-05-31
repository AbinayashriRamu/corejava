package com.chainsys.jdbc;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBC {

	public static void main(String args[]) throws Exception {
		// selectColumnsRead();
		// databaseMetadataInterface();
		// totalNumberOfTables();
		// insertImage();
		// storeFileInDatabase();
		// callableStatement();
		// functionSums();
		// transactionManagementUsingStatement();
		// transactionManagementPreparedStatement();
		// batchProcessingINJDBC();
		// batchProcessingInPreparedStatement();
		retrieveImage();
	}

	public static void ResultSetMetaData() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			PreparedStatement ps = con.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			System.out.println("Total columns: " + rsmd.getColumnCount());
			System.out.println("Column Name of 1st column: " + rsmd.getColumnName(2));
			System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(2));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
			}
		}
	

	public static void ResultSetMetaDat() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "8122444543aA");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("select * from emp765");

		// getting the record of 3rd row
		rs.absolute(2);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

		con.close();
	}

	public static void fetchdatas() {
		try {
			Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");
			java.sql.Statement mystat = myCon.createStatement();
			ResultSet myRs = mystat.executeQuery("select * from employees");
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
			myCon.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}

	public static void InsertRecordsPressN() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "8122444543aA");

		PreparedStatement ps = con.prepareStatement("insert into emp130 values(?,?,?)");

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

	public static void selectColumnsRead() {
		final String QUERY = "SELECT EMAIL FROM Employees";
		// Open a connection
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"8122444543aA"); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(QUERY);) {
			// Extract data from result set
			while (rs.next()) {
				// Retrieve by column name

				System.out.println(", Last: " + rs.getString("EMAIL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void storedDatasInsert() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");
			PreparedStatement ps = myCon.prepareStatement("insert into FileTable values(?,?)");
			ps.setInt(1, 1555501);
			// ps.setCharacterStream(2, fr,(int)f.length());
			ps.setString(2, "omkytgsumar");
			int i = ps.executeUpdate();
			System.out.println(i + " " + "record affected");
			myCon.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}

	public static void insertUpdateDelete() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "8122444543aA");
		Statement stmt = con.createStatement();

		int result = stmt.executeUpdate("insert into emp765 values(33,'Omkumar',50000)");
		// int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000
		// where id=33");
		// int result=stmt.executeUpdate("delete from emp765 where id=33");
		System.out.println(result + " records affected");
		con.close();
	}

	public static void InsertPrepared() {
		try {

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?,?,?)");
			stmt.setInt(1, 101);// 1 specifies the first parameter in the query
			stmt.setString(2, "Ratan");
			stmt.setInt(3, 200);
			stmt.setString(4, "Omkumar");
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");

			// Prepared Statement update the records from the table

			/*
			 * PreparedStatement
			 * stmt1=con.prepareStatement("update emp1 set Name='Omumar' where Sno=33"); //
			 * int result= stmt1.executeUpdate("insert into emp1 values(33,'Omkumar')");
			 * stmt1.setInt(1, 33); stmt1.setString(2, "Om");
			 * 
			 * int i=stmt1.executeUpdate(); System.out.println(i+" records updated");
			 */

			// Delete the records from the table
			/*
			 * PreparedStatement
			 * stmt=con.prepareStatement("delete from emp where emp_id=?");
			 * stmt.setInt(1,10004);
			 * 
			 * int i=stmt.executeUpdate(); System.out.println(i+" records deleted");
			 */

			// Retrieve the records from the table
			/*
			 * PreparedStatement stmt=con.prepareStatement("select * from emp"); ResultSet
			 * rs=stmt.executeQuery(); while(rs.next()){
			 * System.out.println(rs.getInt(1)+" "+rs.getString(2)); }
			 */
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void databaseMetadataInterface() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");
			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void totalNumberOfTables() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			DatabaseMetaData dbmd = con.getMetaData();
			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void insertImage() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			PreparedStatement ps = con.prepareStatement("insert into mgtable values(?,?)");
			ps.setString(1, "sonoo");

			FileInputStream fin = new FileInputStream("d:\\2.png");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void retrieveImage() {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			PreparedStatement ps = con.prepareStatement("select * from OTABLE");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {// now on 1st row

				Blob b = rs.getBlob(2);// 2 means 2nd column data
				byte barr[] = b.getBytes(1, (int) b.length());// 1 means first image

				FileOutputStream fout = new FileOutputStream("C:\\Users\\omku3118\\Desktop\\temp\\pic.png");
				fout.write(barr);

				fout.close();
			} // end of if
			System.out.println("ok");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void storeFileInDatabase() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			PreparedStatement ps = con.prepareStatement("insert into filetale values(?,?)");

			File f = new File("d:\\myfile.txt");
			FileReader fr = new FileReader(f);

			ps.setInt(1, 101);
			ps.setCharacterStream(2, fr, (int) f.length());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void callableStatement() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "8122444543aA");

		CallableStatement stmt = con.prepareCall("{call insertR(?,?)}");
		stmt.setInt(1, 1021);
		stmt.setString(2, "mit");
		stmt.execute();

		System.out.println("success");
	}

	public static void functionSums() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "8122444543aA");

		CallableStatement stmt = con.prepareCall("{?= call sum4(?,?)}");
		stmt.setInt(2, 10);
		stmt.setInt(3, 43);
		stmt.registerOutParameter(1, Types.INTEGER);
		stmt.execute();

		System.out.println("Output : " + stmt.getInt(1));
	}

	public static void transactionManagementUsingStatement() throws Exception {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "8122444543aA");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into user42 values(190,'abhi',40000)");
		stmt.executeUpdate("insert into user42 values(191,'umesh',50000)");

		con.commit();
		System.out.println("Success ");
		con.close();
	}

	public static void transactionManagementPreparedStatement() {
		try {

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");
			con.setAutoCommit(false);

			PreparedStatement ps = con.prepareStatement("insert into user422 values(?,?,?)");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {

				System.out.println("enter id");
				String s1 = br.readLine();
				int id = Integer.parseInt(s1);

				System.out.println("enter name");
				String name = br.readLine();

				System.out.println("enter salary");
				String s3 = br.readLine();
				int salary = Integer.parseInt(s3);

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
				ps.executeUpdate();

				System.out.println("commit/rollback");
				String answer = br.readLine();
				if (answer.equals("commit")) {
					con.commit();
				}
				if (answer.equals("rollback")) {
					con.rollback();
				}
				System.out.println("Want to add more records y/n");
				String ans = br.readLine();
				if (ans.equals("n")) {
					break;
				}
			}
			con.commit();
			System.out.println("record successfully saved");

			con.close();// before closing connection commit() is called
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void batchProcessingINJDBC() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		con.setAutoCommit(false);

		Statement stmt = con.createStatement();
		stmt.addBatch("insert into user422 values(190,'Praveena',40000)");
		stmt.addBatch("insert into user422 values(191,'Deepa',50000)");

		stmt.executeBatch();// executing the batch

		con.commit();
		con.close();
	}

	public static void batchProcessingInPreparedStatement() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					"8122444543aA");

			PreparedStatement ps = con.prepareStatement("insert into user422 values(?,?,?)");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {

				System.out.println("enter id");
				String s1 = br.readLine();
				int id = Integer.parseInt(s1);

				System.out.println("enter name");
				String name = br.readLine();

				System.out.println("enter salary");
				String s3 = br.readLine();
				int salary = Integer.parseInt(s3);

				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);

				ps.addBatch();
				System.out.println("Want to add more records y/n");
				String ans = br.readLine();
				if (ans.equals("n")) {
					break;
				}

			}
			ps.executeBatch();// for executing the batch

			System.out.println("record successfully saved");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void rowSet() throws Exception {
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
		rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rowSet.setUsername("system");
		rowSet.setPassword("8122444543aA");

		rowSet.setCommand("select * from user422");
		rowSet.execute();

		while (rowSet.next()) {
			// Generating cursor Moved event
			System.out.println("Id: " + rowSet.getString(1));
			System.out.println("Name: " + rowSet.getString(2));
			System.out.println("Salary: " + rowSet.getString(3));
		}
	}
}

