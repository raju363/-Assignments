 
public class student {
 private char Name;
 private int age;
 private String gender;
public student() {
	super();
}
public student(char name, int age, String gender) {
	this.Name = name;
	this.age = age;
	this.gender = gender;
}
public char getName() {
	return Name;
}
public void setName(char name) {
	this.Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = ValidateAge(age);
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
private int ValidateAge(int age) {
		if(age>=0) 
 return age;
		throw new ArithmeticException("Age cannot be lessthan 1");
	}
private String ValidateGender(String gender) {
	if(gender=="Male" || gender=="Female")
		return gender;
	throw new ArithmeticException("Age cannot be lessthan 1");
}
private char ValidateName(char Name) {
//	int a=65;
//	int z=90;
	char a[]=new char[26];
	for(int i=0;i<a.length;i++) {
	if(a[i]==65 && a[i]==90) 
return Name;
	throw new ArithmeticException("Age cannot be lessthan 1");
	}
}
}

