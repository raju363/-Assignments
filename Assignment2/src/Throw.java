
public class Thrive {
	int age;
	public Thrive() {}
	public Thrive(int age) {
		this.age=age;
	}
	public void setAge(int age) {
		this.age = validateAge(age);
	}
private int validateAge(int age){
	  if(age>=0)
		  return age;
		throw new RuntimeException("Not elegible");
	}

//	public int getAge() {
//	return age;
//}

//	public  void check() {
//		if(age<18) {
//			throw new ArithmeticException("Not elegible");
//		}else {
//			System.out.println("eligible");
//		}
//	}
}
public class Throw {
public static void main(String[]args) {
	Thrive t=new Thrive(18);
//	t.setAge(12);

}
}

