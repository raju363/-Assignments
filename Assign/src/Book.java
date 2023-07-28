
public class Book {
int bookid;
String Booktitle;
String author;
double price;
String category;
public Book() {
}
public Book(int bookid, String booktitle, String author, double price) {
	super();
	this.bookid = bookid;
	this.Booktitle = booktitle;
	this.author = author;
	this.price = price;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBooktitle() {
	return Booktitle;
}
public void setBooktitle(String booktitle) {
	Booktitle = booktitle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}


}
