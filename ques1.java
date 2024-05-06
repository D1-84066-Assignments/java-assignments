import java.io.Console;
import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first double value: ");
        if(!scanner.hasNextDouble()) {
        	System.out.println("  NOT Found DOUBLE " +scanner.next());
        	return;
        }
        
        double first = scanner.nextDouble();
        System.out.print("Enter the SECOND double value: ");
        if(!scanner.hasNextDouble()) {
        	System.out.println("  NOT Found DOUBLE " +scanner.next());
        	return;
        }
        double second = scanner.nextDouble();
        double avg = (first +second)/2;
        System.out.println("Average is " +avg);
			

	}

}





