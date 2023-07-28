	
interface Utility{
	
 public  static int sum(int x,int y) {
	 return x+y;
 }
// public int sum(int ...x) {
//	 int s=0;
//	 for(int i:x)
//		 s=s+i;
//	 return s;
// }
 public static  int square(int x) {
	 return x*x;
 }
 public   static int power(int x,int n) {
	int res=1;
	for(;n>0;n--)
		res=res*x;
return res;

 }
	}
public class utitlity {
		
// public static int sum(int x,int y) {
//	 return x+y;
// }
//// public int sum(int ...x) {
////	 int s=0;
////	 for(int i:x)
////		 s=s+i;
////	 return s;
//// }
// public static  int square(int x) {
//	 return x*x;
// }
// public   static int power(int x,int n) {
//	int res=1;
//	for(;n>0;n--)
//		res=res*x;
//	return res;
// }
 public static void main(String[]args) {
System.out.println(Utility.sum(101,202));	 
System.out.println(Utility.square(10));
System.out.println(Utility.power(4,6));
 }
}
