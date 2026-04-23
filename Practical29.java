/*Design a Java program for an Online Order Processing System using partial interface
implementation. Create an interface Order with three methods:
•	placeOrder(String item, int qty)
•	cancelOrder(int orderId)
•	generateBill()
Create an abstract class PartialOrder that implements the Order interface but provides implementation only for placeOrder() (storing order details). Create a concrete class FinalOrder that extends PartialOrder and implements the remaining methods cancelOrder() and generateBill(). Accept user input for order details and allow user to either generate a bill or cancel the order.*/

import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Partial implementation of interface
abstract class PartialOrder implements Order {
    String itemName;
    int quantity;
    int orderId = 101;
    double pricePerItem = 100.0;

    // Implement only placeOrder()
    public void placeOrder(String item, int qty) {
        itemName = item;
        quantity = qty;

        System.out.println("Order Placed Successfully!");
        System.out.println("Order ID   : " + orderId);
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
    }
}

// Final implementation
class FinalOrder extends PartialOrder {

    public void cancelOrder(int id) {
        if (id == orderId) {
            System.out.println("Order ID " + id + " has been cancelled.");
        } else {
            System.out.println("Invalid Order ID.");
        }
    }

    public void generateBill() {
        double total = quantity * pricePerItem;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID   : " + orderId);
        System.out.println("Item Name  : " + itemName);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Price/item : Rs. " + pricePerItem);
        System.out.println("Total Bill : Rs. " + total);
    }
}

public class Practical29 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");
        Scanner sc = new Scanner(System.in);
        FinalOrder obj = new FinalOrder();

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        obj.placeOrder(item, qty);

        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                obj.generateBill();
                break;

            case 2:
                System.out.print("Enter Order ID to Cancel: ");
                int id = sc.nextInt();
                obj.cancelOrder(id);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}