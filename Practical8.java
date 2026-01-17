import java.util.Scanner;
class Practical8 {
    public static void main(String[] args) {

        // Check if exactly two arguments are given
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        // Convert command-line arguments from String to int
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate sum
        int sum = num1 + num2;

        // Print result
        System.out.println("Sum = " + sum);
    }
}
