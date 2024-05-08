package com.app.test;

import com.app.classes.Circle;


public class Test {

	public static void main(String[] args) {
		Circle c1=new Circle();
		try {
		c1.setMyDiameter(-100);
		}
		
		catch(RuntimeException e ) {
			e.printStackTrace();
		}
		
		System.out.println("hello");
	}
	}
