package com.prolifics.firstmavenapp;

public class person1 {
	int ssn;
	int name;
	int age;

public person1() {
	}

public person1(int ssn, int name, int age) {
	super();
	this.ssn = ssn;
	this.name = name;
	this.age = age;
}

public int getSsn() {
	return ssn;
}

public void setSsn(int ssn) {
	this.ssn = ssn;
}

public int getName() {
	return name;
}

public void setName(int name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
class student extends person1{
	int rollno;
	int admno;
	public student(int rollno,int admno,int ssn, int name, int age) {
		super(ssn, name, age);
this.rollno=rollno;
this.admno=admno;
	}
	
}
public static void main(String[]args) {
	
}
}



