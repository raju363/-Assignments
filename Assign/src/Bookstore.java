import java.util.Objects;

public class Bookstore extends Book {
Book[] book;
String storeName;
String location;
public Bookstore() {

}
public Bookstore(String storeName, String location,int bookid,Book[] book) {
	this.book = book;
	this.storeName = storeName;
	this.location = location;
}
//public Book[] getBooks() {
//	return books;
//}
//public void setBooks(Book[] books) {
//	this.books = books;
//}
//public String getStoreName() {
//	return storeName;
//}
//public void setStoreName(String storeName) {
//	this.storeName = storeName;
//}
//public String getLocation() {
//	return location;
//}
//public void setLocation(String location) {
//	this.location = location;
//}

public void addBook(){
int count=1;
	
	for(int i=0;i<book.length;i++) {
		if(book.length<3) {
			System.out.println("add book");
		}else {
			throw new RuntimeException("cant add");
		}
		if(book[i]==null) {
			System.out.println("is empty");
			count++;
		
		}
		
	}

}


public boolean searchBooksByTitle() {
	for(int i=0;i<book.length;i++) {
if(book[i]==book[0] && book[i]==book[1] && book[i]==book[2] )  



	return true;
}
	return true;
}
//public void showBooksByCategory(String category) {
//
//    int count =0;
//
//    for(int i =0;i<book.length;i++) {
//
//   if(!(Objects.isNull(books[i]))) {
//
// if(this.books[i].getCategory().equals(category))
//
//System.out.println(""+books[i].getBooktitle() + "" +books[i].getAuthor()+""+books[i].getPrice()+" "+books[i].getCategory());
//
//            count++;
//        }
//
//    }
//
//    if(count==0) {
//
//        System.out.println("Book with "+category+" not found");
//
//    }
//
//}
//
//
//public void showAllBooks() {
//
//    for(int i =0;i<books.length;i++) {
//
//            if(!(Objects.isNull(books[i])))
//
//            System.out.println("Book Title :"+books[i].getBooktitle() + ", Book Author :" +books[i].getAuthor()+", Book price :"+books[i].getPrice()+", Book Category "+books[i].getCategory());
//
//            
//
//            
//
//        
//
//    }

}






