package com.app.fruits;

import java.util.Scanner;

public class Fruitbasket {

	public static void main(String[] args) {
		int basket;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basket size -");
		basket = sc.nextInt();
		int index = 0;
		int choice  =1;
		Fruits arr[] = new Fruits[basket];
		 
		do{
			
			System.out.println("0 EXIT ");
			System.out.println("1 Add Mango");
			System.out.println("2 Add Orange");
			System.out.println("3 Add Apple"); 
			System.out.println("4 Display names of all fruits in the basket.");
			System.out.println("5 Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6 Mark a fruit as stale");
			System.out.println("7 Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("8  Mark all sour fruits stale");
			choice = sc.nextInt();
			switch(choice){    
			case 0:    
				System.out.println("Thankyou");
			 break;  
			case 1:
				if(index<=basket) {
					arr[index] = new Mango();
					index++;
				}
				else {
					System.out.println("Basket is fulll");
				}
				break;
			case 2:    
				if(index<=basket) {
					arr[index] = new Orange();
					index++;
				}
				else {
					System.out.println("Basket is fulll");
				}
				break;
			case 3:    
				if(index<=basket) {
					arr[index] = new Apple();
					index++;
				}
				else {
					System.out.println("Basket is fulll");
				}
				break;
			case 4:    
				for(Fruits element:arr)
				{
					if(element!=null)
					System.out.println(element.getName());
				}
			 break;   
			case 5:    
				for(Fruits element:arr)
				{
					if(element!=null)
					System.out.println(element.toString());
					
				}
				break;
			case 6:
				System.out.println("Enter index of fruit  to mark stale ");
				int i = sc.nextInt();
				arr[i].setIsfresh(false);
				break;
			case 7:
				int count =0;
				for(Fruits element:arr)
				{
					if(element.isIsfresh() == false) {
						System.out.println(element.getName());
						count =1;
					}	
				} 
				if(count == 0) {
					System.out.println("All fruits are fresh");
						
				}
			case 8:
				for(Fruits element:arr)
				{
					element.setIsfresh(false);
					
				}
				break;
									
			default:     
				System.out.println("INVALID choice");
			}    
			
		  }while (choice != 0);
		System.out.println("THANKYOU  DO NOT VISIT AGAIN");

	}

}
