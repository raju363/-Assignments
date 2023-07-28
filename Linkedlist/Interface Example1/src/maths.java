interface printable{
	 static int a=720;
	int add(int x, int y);
	int square(int n);
	int power(int x,int n);
}
class showable implements printable{
	 public int add( int x,int y) {
		return x+y;
	}
	public int square( int x) {
		return x*x;
	}
	public int power( int x,int n) {
		int res=0;
		for(;n>0;n--)
			res=res*x;
		return x;
	}
}
public class maths {
 public static void main(String[]args) {
	 showable m=new showable();
	System.out.println(m.add(2,3));
	System.out.println(m.power(2,3));
	System.out.println(m.square(3));
	System.out.println(printable.a);//by using the interface name we can directly call the variable//
 }
}
