



public class Test {
public static void main(String[]args) {
//	int x=10, y=2;
//	int[] a= {10,20,30};
//	System.out.println("begin");
//try {
//		System.out.println(x/y);
//		System.out.println(a[y]);
//	}
//catch(Exception ex)
//	{
//		System.out.println(ex);
//	}
//	System.out.println("End");
	
	int x=10,y=5;
	int a[]= {10,20,30};
	try {
		System.out.println(x/y);
		System.out.println(a[y]);
	}
	catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex);
	}
	System.out.println("End");
}
}

