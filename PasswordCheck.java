/*Create a Java method isValidPassword (String password) that checks if a given string is a
Valid password based on the following rules:
•	It must have at least eight characters.
•	It must consist only of letters and digits.
•	It must contain at least two digits.
The program should prompt the user to enter a password and display “Valid Password” or “Invalid Password” accordingly.*/

import java.util.Scanner;

public class PasswordCheck {

    // Method to check password validity
    public static boolean isValidPassword(String password) {

        int digitCount = 0;

        // Rule 1: length check
        if (password.length() < 8) {
            return false;
        }

        // Loop to check characters
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            // Rule 2: only letters and digits allowed
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: at least 2 digits
        if (digitCount >= 2) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
