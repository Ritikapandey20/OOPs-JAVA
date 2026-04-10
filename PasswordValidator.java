/*Create a Java method isValidPassword (String password) that checks if a given string is a
Valid password based on the following rules:
•	It must have at least eight characters.
•	It must consist only of letters and digits.
•	It must contain at least two digits.
The program should prompt the user to enter a password and display “Valid Password” or “Invalid Password” accordingly.*/

import java.util.Scanner;

public class PasswordValidator {

    // Method to check if password is valid
    public static boolean isValidPassword(String password) {
        
        // Rule 1: At least 8 characters
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        // Loop through each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Rule 2: Only letters and digits
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: At least 2 digits
        if (digitCount < 2) {
            return false;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        sc.close();
    }
}
