/*Create an Employee class with private instance variables for employeeName (String) and employeeSalary (double). Implement public methods readEmployeeData() (to take input from the user) and displayEmployeeData() (to print the employee's name and salary). Demonstrate object creation and method invocation in a main method.*/


import java.util.Scanner;

class Employee {
    // private instance variables
    private String employeeName;
    private double employeeSalary;

    // method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("En-no = 240390107041");

        System.out.println("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    // method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }

    // main method
    public static void main(String[] args) {
        // object creation
        Employee emp = new Employee();

        // method invocation
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
