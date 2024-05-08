package com.app.classes;

public class Circle {
	Point2D center;
	double myDiameter;
	
	public Circle() {};
	
	public Circle(Point2D center, double myDiameter) {
		super();
		this.center = center;
		this.myDiameter = myDiameter;
	}
	
	public Point2D getCenter() {
		return center;
	}
	public void setCenter(Point2D center) {
		this.center = center;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	public void setMyDiameter(double myDiameter) {
		if(myDiameter<0)
			throw new RuntimeException("negative not allowed");
		this.myDiameter = myDiameter;
	}
	
	
}
