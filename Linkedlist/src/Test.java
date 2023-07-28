	import java.util.LinkedList;
	import java.util.ListIterator;
public class Test {


		public static void main(String[] args) {
	LinkedList<Employee> A= new LinkedList<>();
    A.add(new Employee(107,"raju",7000));
    A.add(new Employee(103,"raina",700));
    A.add(new Employee(103,"ajay",800));
    A.add(new Employee(103,"ramesh",7003));
    for(Employee e:A)
    	System.out.println(e);
    
    System.out.println(A.remove(new Employee(103,"ramesh",7003)));
    for(Employee e:A)
   	System.out.println(e);
}
}
