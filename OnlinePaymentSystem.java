/*Write a Java program to demonstrate method overriding in an online payment system. Create a superclass Payment with a method processPayment (int amount). In the subclass CreditCardPayment, override the method to print “Payment of Rs. <amount> done Using Credit Card”. In the subclass UPIPayment, override the method to print “Payment of Rs. <amount> done using UPI”. Accept user choice and amount, and display the payment result using method overriding.*/


import java.util.Scanner;

// Superclass
class Payment {
    void processPayment(int amount) {
        System.out.println("Processing payment...");
    }
}

// Subclass CreditCardPayment
class CreditCardPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done Using Credit Card");
    }
}

// Subclass UPIPayment
class UPIPayment extends Payment {
    @Override
    void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

// Main class
public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment p;

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        if (choice == 1) {
            p = new CreditCardPayment();
        } else if (choice == 2) {
            p = new UPIPayment();
        } else {
            System.out.println("Invalid Choice");
            sc.close();
            return;
        }

        // Method overriding demonstration
        p.processPayment(amount);

        sc.close();
    }
}

