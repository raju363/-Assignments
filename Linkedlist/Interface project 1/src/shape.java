interface shapes{
	double area();
}
class circle {
	double radius;
	public circle(double radius) {
		this.radius=radius;
	}
	public double perimeter() {
		return 3.14*radius*radius;
	}
}
 class ThreeDCircle extends circle implements shapes{
	 public ThreeDCircle(double radius)
	 {
		 super(radius);
	 }
	 public double area() {
		  return 3.14*radius*radius;
	 }
 }
public class shape {
	public static void main(String[]args) {
	ThreeDCircle c=new ThreeDCircle(3);
	System.out.println(c.area());
	System.out.println(c.area());
}

}