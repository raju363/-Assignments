import java.util.ArrayList;
import java.util.ListIterator;
public class Testing {

	public static void main(String[] args) {
ArrayList<String> A= new ArrayList<String>();
System.out.println("Empty :-"+A.isEmpty());
A.add("welcome");
A.add("to ");
A.add("my");
A.add("place");
System.out.println(A.size());
System.out.println("Empty :-"+A.isEmpty());
System.out.println(A.contains("place"));
for(int i=0;i<A.size();i++)
{
	System.out.println(A.get(i));
}
//for each method//
for(String b:A) {
	System.out.println(b);
}
ListIterator itr=A.listIterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());	
	}
	System.out.println(A.remove(1));

	System.out.println(A.remove("welcome"));
	System.out.println(A);

	ArrayList<String> A2=new ArrayList<>();
	A2.add("bannna");
	A2.add("Mango");
	A.addAll(A2);
	A.retainAll(A2);
	for(String s:A)
	System.out.println(s);
	}

}