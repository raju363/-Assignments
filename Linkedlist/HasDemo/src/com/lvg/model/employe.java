package com.lvg.model;
import com.lvg.model.Address;
public class employe  extends Employee{
private int Name;
private int id;
private String role;
public employe() {
}
//public employe(String companyName, String location, Department[] department) {
////	super(companyName, location, department);
//
//}
public employe(String companyName, String location,int name, int id, String role) {
	Name = name;
	this.id = id;
	this.role = role;
}
public int getName() {
	return Name;
}
public void setName(int name) {
	Name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}

