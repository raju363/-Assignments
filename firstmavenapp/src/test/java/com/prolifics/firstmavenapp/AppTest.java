package com.prolifics.firstmavenapp;



class a{
	
	 private int x=10;
													//	public void methodA() {
													//		System.out.println("A");
													//	}
													//	public a() {}
													//	public a(int x) {
													//		this.x=x;
													//	}
	 public void setx(int x) {
		 this.x=x;
		 
	 }
	 public int getx() {
		 return x;
	 }
}
class b extends a{
	
	int y;
										//	public void methodB() {
										//		System.out.println("B");
										//	}
										//		public b() {}
										//		public b(int x,int y) {
										//			super(101);
										//			this.y=y;
										//		}
	public void setb(int x, int y) {
		setx(x);
		this.y=y;
	}
	public void showb() {
		System.out.println("x="+getx());
		System.out.println("y="+y);
	}
	}
public class AppTest 
{
   public static void main(String[]args) {
	   b B=new b();
		B.setb(786,999);
		B.showb();										//	   System.out.println("x="+B.x);
												//	   System.out.println("y="+B.y);
											//	   System.out.println(B.x+B.y);
											//	   B.methodA();
											//	   B.methodB();
   }
}
