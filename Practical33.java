/*Take the value of denominator and numerator from user using command-line argument. Implement the concept of exception handling to manage all possible run-time error.*/

class Practical33 {
    public static void main(String[] args) {
    System.out.println("Ritika Pandey");
    System.out.println("En-roll: 240390107041");


        try {
            // Check if two arguments are provided
            if (args.length != 2) {
                throw new IllegalArgumentException(
                    "Please provide exactly two command-line arguments: numerator denominator"
                );
            }

            // Convert arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}