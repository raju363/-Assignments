import java.util.HashMap;
import java.util.Comparator;
//import java.util.LinkedHashMap;
import java.util.TreeMap;

import job.EmployeeComparator;
import job.employees;

import java.util.Set;
//
//import job.employees;

import java.util.Map.Entry;
public class test {
public static  void main(String[]args) {
//	LinkedHashMap<employees,String> hmap= new LinkedHashMap<>();
//	hmap.put(new  employees("raju",1233,5666), null);
//	hmap.put(new  employees("harisj",1233,5666), null);
//	hmap.put(new  employees("shanker",1233,5666), null);
//	Set<Entry<employees, String>>entries=hmap.entrySet();
//	for(Entry<employees,String> e:entries)
//		System.out.println(e.getKey()+" "+e.getValue());
	
	TreeMap<employees,String> hmap= new TreeMap<>(new  EmployeeComparator() );
	hmap.put(new employees("raju",1212,112.0),"ui");
	hmap.put(new employees("babu",000,116.0),"gg");
	hmap.put(new employees("hello",144412,11552.0), null);
	Set<Entry<employees, String>>entries=hmap.entrySet();
	for(Entry<employees,String> e:entries)
		System.out.println(e.getKey()+" "+e.getValue());
 }
}




