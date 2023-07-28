package com.lvg.JdbcDemo;
import java.sql.DriverManager;
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
import java.sql.SQLException;
 
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	Connection con=null;
    	PreparedStatement pst=null;
    	ResultSet rs=null;
    	String url="jdbc:mysql://localhost:3306/employee";
    	try {
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       String url="jdbc:mysql://localhost:3306/employee";
      con=DriverManager.getConnection(url,"root","Kumari@1");
 pst=con.prepareStatement("select*from employee");
    rs=pst.executeQuery();
       while(rs.next())
    	   System.out.println(rs.getString(1) + "  "+ rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4));
    }
       catch(SQLException ex) {
	   ex.printStackTrace();
   }
    }
}
