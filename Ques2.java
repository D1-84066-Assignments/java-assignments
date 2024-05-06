import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 1;
		int total_bill = 0;
		 
		do{
			
			System.out.println("1 IDLI - 10rs");
			System.out.println("2 Dosa - 35rs");
			System.out.println("3 SAMOSA -15 rs");
			System.out.println("4 Medu VADA - 15rs"); 
			System.out.println("5 GENERATE BILL");
			System.out.println("6 EXIT");
			choice = scanner.nextInt();
			int qty=0;
			switch(choice){    
			case 1:    
				System.out.println("enter the qty");
				qty = scanner.nextInt();
				total_bill = 10 *qty + total_bill;
			 break;  
			case 2:    
				System.out.println("enter the qty");
				qty = scanner.nextInt();
				total_bill = 35 *qty + + total_bill;
			 break;   
			case 3:    
				System.out.println("enter the qty");
				qty = scanner.nextInt();
				total_bill = 15 *qty + total_bill;
			 break;
			case 4:    
				System.out.println("enter the qty");
				qty = scanner.nextInt();
				total_bill = 15 *qty + total_bill;
			 break;
			case 5:    
				System.out.println("GENERATE BILL");
				System.out.println("  BILL IS " +total_bill);
			 break;   
			    
			default:     
				System.out.println("INVALID choice");
			}    
			
		  }while (choice != 6);
		System.out.println("  BILL IS RS  " +total_bill);
		System.out.println("THANKYOU  DO NOT VISIT AGAIN");

      
		 
      
     
        
        

	}

}
