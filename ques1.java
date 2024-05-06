import java.util.Scanner;

public class ques1 {

	
	public static void calculate(int accno, int pend_bal, 
			int total_items_cost, int total_credits, int allowed_credit) {
		int newBalance = pend_bal + total_items_cost -total_credits;
		System.out.println("Account no: " + accno);
		System.out.println("Allowed Credit: " + allowed_credit);
		System.out.println("New Balance: " + newBalance);
		if(newBalance>allowed_credit) {
			System.out.println("Credit limit exceeded");
		}
		else {
			System.out.println("Credit limit not exceeded");
		}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accno,pend_bal,total_items_cost,total_credits,allowed_credit;
		int choice = 0;
		 
		do{
			System.out.println("1 Enter Details and calculate");
			System.out.println("2 exit");
			choice  = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter account no");
				accno = sc.nextInt();
				System.out.println("Enter pending balance");
				pend_bal = sc.nextInt();
				System.out.println("Enter total item cost");
				total_items_cost = sc.nextInt();
				System.out.println("Allowed credits");
				allowed_credit = sc.nextInt();
				System.out.println("Enter total of all credits");
				total_credits = sc.nextInt();
				calculate(accno,pend_bal,total_items_cost,total_credits,allowed_credit);
				break;
			case 2:
				break;
			default:
				System.out.println("invalid choice");
			
			}
			
			
		  }while (choice != 2);
		System.out.println("THANKYOU  DO NOT VISIT AGAIN");

	}

}
