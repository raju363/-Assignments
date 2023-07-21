import java.time.LocalDate;

public class Traveller extends Flight{
String Name;
long mobileNo;
String mail;
String id;
String Travellers;
public String getTravellers() {
	return Travellers;
}
public void setTravellers(String travellers) {
	Travellers = travellers;
}
public Traveller(String string, String string2, Flight flight, String name, long mobileNo, String mail, String id) {
//	super(string, string2, flight);
	Name = name;
	this.mobileNo = mobileNo;
	this.mail = mail;
	this.id = id;
}

public Traveller(String string, long l, String string2, String string3, LocalDate now) {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}



}
