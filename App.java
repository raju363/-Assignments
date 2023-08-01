package com.lvg.JdbcDemo;
import java.sql.DriverManager;
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.lvg.model.service.BookService;
 
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	  

    	        BookService bookService = new BookService();

    	        Scanner sc = new Scanner (System.in);

    	        int opt = 0;

    	        do

    	        {

    	            System.out.println("1. Add Book");

    	            System.out.println("2. Show All books");

    	            System.out.println("3. Show Books By Category");

    	            System.out.println("4. Show Book by Title");

    	            System.out.println("5. Delete Book By Title");

    	            System.out.println("6. E X I T");

    	            System.out.print("Enter Your Option :-   ");

    	            opt = sc.nextInt();
//    	            System.out.println("book added sucessfully");
    	            switch (opt)

    	            {

    	            case 1:

    	                bookService.addBook1();

    	                break;

    	            case 2:

    	                bookService.showAllBooks();

    	                break;

    	            case 3:

    	                bookService.showBookByTitle();

    	                break;

    	            case 4:

    	                bookService.showBookByCategory();

    	                break;

    	            case 5:

    	                bookService.deleteBookByTitle();

    	                break;

    	            case 6:

    	                System.out.println("You are Quiting Menu");

    	                break;

    	            default:

    	                System.out.println("Not a Correct Option ....Please choose the Correct Option");

    	            }

    	        }

    	        while(opt!=6);
    	        System.out.println("book added sucessfully");

    	    }

    	}

    	 

    	 

    	 

 
 
 
 
 
 
 
 
 
 
 
 