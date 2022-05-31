package com.chainsys.jdbc;



import java.io.FileInputStream;
import java.sql.*;

public class RSMD {
    public static void main(String args[]) {
        resultSetMetaData();
        //DatabaseMetaData();
        //printsTotalNumberOfTables();
        //storeImageInTheDatabase();
    }
    
    
    //find total column,individual name and column data type 
    public static void resultSetMetaData()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Dharani@109");

            PreparedStatement ps = con.prepareStatement("select * from fish");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int r=rsmd.getColumnCount();
            System.out.println("Total columns: " + r);
            int i=1;
            while(i<r+1) {
            System.out.println("Column Name of column("+i+"): " + rsmd.getColumnName(i));
            System.out.println("Column Type Name of column("+i+"): " + rsmd.getColumnTypeName(i));
            i++;
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    //Find the JDBC driver details
    public static void DatabaseMetaData()
    {
    try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
          
        Connection con=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","system","DEEPA");  
        DatabaseMetaData dbmd=con.getMetaData();  
          
        System.out.println("Driver Name: "+dbmd.getDriverName());  
        System.out.println("Driver Version: "+dbmd.getDriverVersion());  
        System.out.println("UserName: "+dbmd.getUserName());  
        System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
        System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
          
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
}
    
    
    
    // Print total no of tables...by using view or Table
    public static void printsTotalNumberOfTables()
    {
try{  
    Class.forName("oracle.jdbc.driver.OracleDriver");  
      
    Connection con=DriverManager.getConnection(  
    "jdbc:oracle:thin:@localhost:1521:xe","system","Chikabi@798999");  
      
    DatabaseMetaData dbmd=con.getMetaData();  
    String table[]={"VIEW"};  
    ResultSet rs=dbmd.getTables(null,null,null,table);  
      
    while(rs.next()){  
    System.out.println(rs.getString(3));  
    }  
      
    con.close();  
      
    }catch(Exception e){ System.out.println(e);}  
      
    }  
    //To get images by using the fileInputStream format
    public static void storeImageInTheDatabase()
    {
    try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","system","Chikabi@798999");  
                      
        PreparedStatement ps=con.prepareStatement("insert into ImageJDBC values(?,?)");  
        ps.setString(1,"leela");  
          
        FileInputStream fin=new FileInputStream("d:\\abi.jpeg");  
        ps.setBinaryStream(2,fin,fin.available());  
        int i=ps.executeUpdate();  
        System.out.println(i+" records affected");  
                  
        con.close();  
        }catch (Exception e) {e.printStackTrace();}  
        }  
    
    }