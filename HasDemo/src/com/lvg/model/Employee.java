package com.lvg.model;
import java.io.Serializable;
import  java.time.LocalDate;
public class Employee implements Serializable{
int employeeid;
String employeeName;
double salary;
String Dob;
public Employee() {
}
public Employee(int employeeid, String employeeName, double salary, String Dob) {
	this.employeeid = employeeid;
	this.employeeName = employeeName;
	this.salary = salary;
	this.Dob = Dob;
}
public Employee(int i, String string, int j) {
	// TODO Auto-generated constructor stub
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	Dob = dob;
}



}


