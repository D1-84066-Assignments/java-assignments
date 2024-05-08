import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = scanner.nextLine();

  
        boolean isPalindrome = checkPalindrome(inputString);

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a given string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Normalize the string: remove non-alphanumeric characters and convert to lower case
        String normalizedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two pointers to check if the string is a palindrome
        int left = 0;
        int right = normalizedString.length() - 1;

        while (left < right) {
            if (normalizedString.charAt(left) != normalizedString.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }
}
