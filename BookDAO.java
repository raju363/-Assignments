package com.lvg.JdbcDemo.bean;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import com.lvg.JdbcDemo.bean.Book;
public class BookDAO {

	    private static String url = "jdbc:mysql://localhost:3306/employee";

	    public boolean insertBook(Book book)

	    {

	        int count = 0;

	        try(Connection con = DriverManager.getConnection(url,"root","Kumari@1");

PreparedStatement pst = con.prepareStatement("insert into Book values(?,?,?,?,?,?)"))

	        {

	            pst.setString(1, book.getBookid());

	            pst.setString(2, book.getBooktitle());

	            pst.setString(3, book.getBookAuthor());

	            pst.setString(4, book.getBookcategeroy());

	            pst.setDouble(5, book.getBookprice());

	            pst.setInt(6, book.getCopies());

	            count = pst.executeUpdate();

	        }

	        catch (Exception ex)

	        {

	            ex.printStackTrace();

	        }

	        return count == 1;

	    }
	    
	    
	    
	    
	    

	    public ArrayList<Book> getBookByCategory(String bookCategory)

	    {

	        ArrayList<Book> blist = new ArrayList<>();

	        try(Connection con = DriverManager.getConnection(url,"root","Kumari@1");

   PreparedStatement pst = con.prepareStatement("select * from book where book_category = ?"))

	        {

	            pst.setString(1, bookCategory);

	            ResultSet rs = pst.executeQuery();

	            while(rs.next())

	                blist.add(new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));

	        }

	        catch (Exception ex)

	        {

	            ex.printStackTrace();

	        }

	        return blist;

	        

	    }
	    
	    
	    
	    
	    
	    

	    public ArrayList<Book> getAllBooks()

	    {

	        ArrayList<Book> blist = new ArrayList<>();

	        try(Connection con = DriverManager.getConnection(url,"root","Kumari@1");

	                             PreparedStatement pst = con.prepareStatement("select * from book");

	                             ResultSet rs = pst.executeQuery(); )

	        {

	            while(rs.next())

	                blist.add(new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));

	        }

	        catch (Exception ex)

	        {

	            ex.printStackTrace();

	        }

	        return blist;

	        

	    }
	    
	    
	    
	    
	    
	    

	    public Book getBookByTitle(String bookTitle)

	    {

	        Book book = null;

	        try(Connection con = DriverManager.getConnection(url,"root","kumari@1");

   PreparedStatement pst = con.prepareStatement("select * from book where book_title = ?"))

	        {

	            pst.setString(1, bookTitle);

	            ResultSet rs = pst.executeQuery();

	            if(rs.next())

  book = new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6));

	        }

	        catch (Exception ex)

	        {

	            ex.printStackTrace();

	        }

	        return book;

	    }

	 

	    
	 

	    public boolean delectBookByTitle(String bookTitle)

	    {

	        int count = 0;

	        try(Connection con = DriverManager.getConnection(url,"root","Kumari@1");

PreparedStatement pst = con.prepareStatement("delete from book where book_title = ?"))

	        {

	            pst.setString(1, bookTitle);

	            count = pst.executeUpdate();

	        }

	        catch (Exception ex)

	        {

	            ex.printStackTrace();

	        }

	        return count == 1;

	    }

	 

	}