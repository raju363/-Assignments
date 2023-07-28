package com.prolifics.firstmavenapp;

public class salesMan extends employee1 {
	private int points;
public salesMan() {}
public salesMan(int points,int ssn,String name,int age,int empid,double salary,String orgname) {
		super(ssn,name,age,empid,salary,orgname);
		this.points = points;

	}


public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
public static void main(String[]args) {
	salesMan sm=new salesMan(9,7001,"raj",34,5678,76767,"Rv");
	System.out.println(sm.getSsn());
	System.out.println(sm.getName());
	System.out.println(sm.getAge());
	System.out.println(sm.getEmpid());
	System.out.println(sm.getSalary());
	System.out.println(sm.getPoints());
	System.out.println(sm.getPoints()*750);
	System.out.println("total salary"+(sm.getSalary()+sm.getPoints()*750));
}
}
