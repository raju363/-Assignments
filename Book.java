package com.lvg.JdbcDemo.bean;
public class Book {
 private String bookid;
 private String booktitle;
 private String bookAuthor;
 private String bookcategeroy;
 private double bookprice;
 private int copies;
public Book(String string, String string2, String string3, double d, int i) {}
public Book(String bookid, String booktitle, String bookAuthor, String string, double bookprice, int copies) {
	super();
	this.bookid = bookid;
	this.booktitle = booktitle;
	this.bookAuthor = bookAuthor;
	this.bookcategeroy = bookcategeroy;
	this.bookprice = bookprice;
	this.copies = copies;
}

public String getBookid() {
	return bookid;
}
public void setBookid(String bookid) {
	this.bookid = bookid;
}
public String getBooktitle() {
	return booktitle;
}
public void setBooktitle(String booktitle) {
	this.booktitle = booktitle;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBookcategeroy() {
	return bookcategeroy;
}
public void setBookacategeroy(String bookcategeroy) {
	this.bookcategeroy = bookcategeroy;
}
public double getBookprice() {
	return bookprice;
}
public void setBookprice(double bookprice) {
	this.bookprice = bookprice;
}
public int getCopies() {
	return copies;
}
public void setCopies(int copies) {
	this.copies = copies;
}

 
}

