
public class Flight {
public static int length;
String id;
String source;
String destination;
double fare;
int totalSeats;
String arrivalTime;
String depature;
String companyName;
int getAvailableSeats;
public Flight() {}
public Flight(String id, String source, String destination, double fare, int totalSeats, String arrivalTime,
		String depature, String companyName) {
	this.id = id;
	this.source = source;
	this.destination = destination;
	this.fare = fare;
	this.totalSeats = totalSeats;
	this.arrivalTime = arrivalTime;
	this.depature = depature;
	this.companyName = companyName;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public double getFare() {
	return fare;
}
public void setFare(double fare) {
	this.fare = fare;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
public String getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
	this.arrivalTime = arrivalTime;
}
public String getDepature() {
	return depature;
}
public void setDepature(String depature) {
	this.depature = depature;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getAvailableSeats() {
	// TODO Auto-generated method stub
	return 0;
}
public void setAvailableSeats() {
	// TODO Auto-generated method stub
	
}

}
