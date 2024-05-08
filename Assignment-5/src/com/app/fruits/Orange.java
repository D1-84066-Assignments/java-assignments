package com.app.fruits;

public class Orange extends Fruits{
	
	public Orange(){
		super("Orange","orange",100,true);
	}
	
	public String toString() {
		return super.toString();
	}
	public String taste() {
			return "Sour";
	}

}
