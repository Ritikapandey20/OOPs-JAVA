/*Write a program for billing system for a shopping mall. Create a class BillGenerator that
Uses method overloading to generate bills based on customer type:
•	generateBill(int itemTotal): For regular customers, apply no discount. 
•	generateBill (int itemTotal, int discount): For privileged customers, apply flat discount in rupees.
•	generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage discount.
Write a program to display the final bill amount using appropriate overloaded method based
On customer category.*/

import java.util.Scanner;

class BillGenerator {

    //  Regular customer – No discount
    public void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Total Amount: ₹" + itemTotal);
    }

    //  Privileged customer – Flat discount in rupees
    public void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Original Amount: ₹" + itemTotal);
        System.out.println("Flat Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }

    //  Festive offer – Percentage discount
    public void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Original Amount: ₹" + itemTotal);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}

public class MallBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bg = new BillGenerator();

        System.out.println("Enter total bill amount:");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged (Flat Discount)");
        System.out.println("3. Festive Offer (Percentage Discount)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bg.generateBill(total);
                break;

            case 2:
                System.out.println("Enter flat discount amount:");
                int flatDiscount = sc.nextInt();
                bg.generateBill(total, flatDiscount);
                break;

            case 3:
                System.out.println("Enter discount percentage:");
                double percentDiscount = sc.nextDouble();
                bg.generateBill(total, percentDiscount);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

