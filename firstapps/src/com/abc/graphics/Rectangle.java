package com.abc.graphics;

public class Rectangle 
{
    private double length,breadth;
	public Rectangle() 
	{
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
public double area() {
	return length*breadth;
}
}
