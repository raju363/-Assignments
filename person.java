package com.lvg.rj.spcdd.beans;

public class person {
  private int ssn;
  private String name;
  private int age;
   private Address address;
public person() {
}
public person(int ssn, String name, int age, Address address) {
	super();
	this.ssn = ssn;
	this.name = name;
	this.age = age;
	this.address = address;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
   
}
