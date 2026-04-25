/*Write a Java program to create a class VotingApp where:
•	The method checkEligibility(int age) checks if a person is eligible to vote.
•	If age < 18, explicitly throw the predefined exception IllegalArgumentException with the message “Age must be 18 or above to vote”.
In the main method, test the method with different age inputs.
•	Use a try-catch-finally block to handle exceptions.
•	The finally block should always print “Validation process completed”;*/

class VotingApp {

    // Method to check voting eligibility
    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");
        VotingApp app = new VotingApp();

        // Different age inputs
        int[] ages = {16, 18, 25, 15};

        for (int age : ages) {
            System.out.println("Checking age: " + age);

            try {
                app.checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }

            System.out.println();
        }
    }
}