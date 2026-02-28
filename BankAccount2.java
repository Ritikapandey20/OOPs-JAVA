/*Design a class BankAccount with account_holder_name and balance. Use a static variable
interest_rate (same for all accounts). Include methods to calculate and display the interest
Earned. Update interest rate using a static method.*/
class BankAccount2 {

    // Instance variables (har object ke liye alag)
    String account_holder_name;
    double balance;

    // Static variable (sab accounts ke liye same)
    static double interest_rate = 5.0;  // 5% default

    // Constructor
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display interest earned
    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println("----------------------------");
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("New Interest Rate Updated to: " + interest_rate + "%");
    }

    // Main method
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Ritika", 10000);
        BankAccount acc2 = new BankAccount("Aman", 20000);

        acc1.displayInterest();
        acc2.displayInterest();

        // Update interest rate
        BankAccount.updateInterestRate(7.0);

        // Interest after update
        acc1.displayInterest();
        acc2.displayInterest();
    }
}