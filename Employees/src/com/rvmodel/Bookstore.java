package com.rvmodel;

public class Bookstore {
String bookname;
int bookid;
Bookstore [] books;
public Bookstore() {}
public Bookstore(String bookname,int bookid) {
	this.bookname=bookname;
	this.bookid=bookid;
}

public static void main(String[]args) {
//	Bookstore book[]=new Bookstore[5];
	Bookstore b=new Bookstore("organi",899);
	System.out.println(b.bookname);
	System.out.println(b.bookid);
}
}