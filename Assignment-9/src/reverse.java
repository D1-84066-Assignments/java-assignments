import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

   
        String reversedString = reverseString(inputString);

       
        System.out.println("Reversed string: " + reversedString);

        
        scanner.close();
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        // Using a StringBuilder for efficient string reversal
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
