

interface A{
	int sum(int x ,int y);
}
interface B extends A{
	int square(int x);
}
interface c extends B {
	int power(int x ,int n);
}

public class Test implements A,B,c{
	public int sum(int x,int y) {
		return x+y;
	}
public int square(int x) {
return x*x;
}
public int power(int a,int b ) {
int res=1;
for(;b>0;b--)
	res=res*a;
return res;
}
public static void main(String[]args) {
//	First p= new BCDcalculator();
	Test p= new Test();
	System.out.println(p.sum(12, 2));
	System.out.println(p.square(12));
	System.out.println(p.power(4,6));
}
}

