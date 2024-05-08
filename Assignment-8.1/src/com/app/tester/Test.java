package com.app.tester;

import java.util.Scanner;

import com.app.exceptions.ExceptionLineTooLong;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string To check");
		try {
		str=sc.next();
		if(str.length()>8)
			throw new ExceptionLineTooLong("The string is too long");
		}
		
		catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		sc.close();
		System.out.println("Program Successfully terminated");
	}
}
