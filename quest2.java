
import java.util.Scanner;
public class ques2 {

	
	public static double drivingcost(double miles,double cost,double miles_per_gallon,double parking_fees,double tolls) {
		double drivingCost = (miles/miles_per_gallon)*cost+parking_fees+tolls;
		return drivingCost;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice= 0;
		double last_cost, miles, cost, miles_per_gallon, parking_fees, tolls;
		
		do{
			System.out.println("1 Enter Details and calculate");
			System.out.println("2 exit");
			choice  = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Total  miles driven per day");
				miles = sc.nextInt();
				System.out.println("Cost per gallon");
				cost = sc.nextInt();
				System.out.println("Average miles per gallon");
				miles_per_gallon = sc.nextInt();
				System.out.println("Parking fees per day");
				 parking_fees= sc.nextInt();
				System.out.println("Tolls per day");
				tolls = sc.nextInt();
				last_cost =  drivingcost(miles,cost,miles_per_gallon,parking_fees,tolls);
				System.out.println("Driving cost is  "+ last_cost);
				break;
				
			case 2:
				break;
			default:
				System.out.println("invalid choice");
			
			}
			
			
		  }while (choice != 2);

	}

}
