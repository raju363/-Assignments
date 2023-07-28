
 class parent {
	 public int sum(int x,int y)
		{
		 	return x+y;
		}
class child extends parent
		{
	 public int sum(int x, int y)
		{
	
		 	return x-(-y);
		}
		}
//public String toString() {
// return "sum"+sum;	
//}
public static  void main(String[]args){

		parent p=new parent();
//		p.sum(12,4);
		System.out.println(	p.sum(12,4));
}
		}
