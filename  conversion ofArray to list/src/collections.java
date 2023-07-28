import java.util.ArrayList;

public class collections {
public static void main(String[]args) {
	String a[]= {"apple","bannana"};
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
ArrayList<String> l=new ArrayList<String>();
for(String e:a) 
l.add(e);
}
}
