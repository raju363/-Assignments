

public class test {
public static void main(String[]args) {

	        Book[] book = new Book[5];

	        book[0] = new Book(1,"First","ram",300);
	        book[1] = new Book(1,"second","Kiran",2000);
	        book[2] = new Book(1,"third","arjun",350);
	        
	    	Bookstore b=new Bookstore("rrr","rtrtrtr",6767,book);
			
for(Book e:book)
{
System.out.println(""+e.getBookid() );
System.out.println(""+e.getAuthor());
System.out.println(""+e.getCategory());
System.out.println(""+e.getPrice());
System.out.println(""+e.getBooktitle());

}


System.out.println(b.getBooktitle());
												 
b.searchBooksByTitle();													 

}
}

	 



