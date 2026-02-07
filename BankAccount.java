/*Create a class BankAccount with accountId (String), accountHolderName (String), and balance (double) as instance variables. Include methods assignValues () (for initialization) and displayValues (). Implement a search function that takes an accountId as input and, if found within an array of BankAccount objects, displays the details of that specific account. In your main method, create an array of at least five BankAccount objects and demonstrate adding, displaying, and searching for accounts.*/

class BankAccount {

    // instance variables
    String accountId;
    String accountHolderName;
    double balance;

    // method to assign values
    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    // method to display values
    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    // main method
    public static void main(String[] args) {

        // array of BankAccount objects
        BankAccount[] accounts = new BankAccount[5];

        // creating and assigning values
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        accounts[0].assignValues("A101", "Ritika", 5000);
        accounts[1].assignValues("A102", "Aman", 8000);
        accounts[2].assignValues("A103", "Neha", 12000);
        accounts[3].assignValues("A104", "Rahul", 3000);
        accounts[4].assignValues("A105", "Priya", 15000);

        // displaying all accounts
        System.out.println("All Bank Accounts:");
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].displayValues();
        }

        // searching for an account
        String searchId = "A103";
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                accounts[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account with ID " + searchId + " not found.");
        }
    }
}


