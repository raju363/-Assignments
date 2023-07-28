
 class utility {
//	 public static int div(int x, int y) {
//		 return x/y;
//
	

//
//public static void div(int x , int y)
//{
//	try {
//		System.out.println(x/y);
//	}
//		catch(ArithmeticException ex) {
//			System.out.println("exception handled in divide");
//		
//	throw ex;
//	}
//}
public static int div(int x,int y) throws java.sql.SQLException{
	if(y!=0)
		System.out.println(x/y);
	throw new java.sql.SQLException();
}
 }
