/*Problem Statement:

A bank wants to offer a facility to calculate EMI (Equated Monthly Installment) for
Different types of loans. Design a class LoanCalculator with the following overloaded
Methods:
•	calculateEMI(int principal, int time, float rate): For home loans
•	calculateEMI(double principal, int time, double rate): For vehicle loans
•	calculateEMI(int principal, int time): For short-term personal loans with a fixed interest rate of 10%
Demonstrate the use of all three methods in the main method by calculating EMIs for
Different loan types.*/


class LoanCalculator {

    // 1️⃣ Home Loan EMI
    public void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Home Loan EMI: " + emi);
    }

    // 2️⃣ Vehicle Loan EMI
    public void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Vehicle Loan EMI: " + emi);
    }

    // 3️⃣ Personal Loan (Fixed 10% interest)
    public void calculateEMI(int principal, int time) {
        double rate = 10.0; // fixed interest rate
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;

        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);

        System.out.println("Personal Loan EMI (10% fixed): " + emi);
    }

    // Main method
    public static void main(String[] args) {

        LoanCalculator loan = new LoanCalculator();

        // Home Loan
        loan.calculateEMI(500000, 20, 7.5f);

        // Vehicle Loan
        loan.calculateEMI(300000.0, 5, 9.5);

        // Personal Loan
        loan.calculateEMI(200000, 3);
    }
}
