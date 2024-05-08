package com.app.fruits;

public class Apple extends Fruits {
	
	public Apple(){
		super("Apple","Red",150,true);
	}
	
	public String toString() {
		return super.toString();
	}
	public String taste() {
			return "Sweet n Sour";
	}
	
	

}
