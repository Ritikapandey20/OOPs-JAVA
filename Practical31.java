/*Write a Java program using packages to generate a mark sheet for students.
Create a package student that contains a class Student with the following:
•	Data members: rollNo, name.
•	A constructor to initialize student details.
•	A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
•	Extends the Student class.
•	Has data members: marks1, marks2, marks3.
•	A method displayResult() that prints the student’s mark sheet including total and average marks.
In the main method (inside the exam package), create a student with marks and display the
mark sheet.*/



class Student {
    protected int rollNo;
    protected String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}

class Result extends Student {
    int marks1, marks2, marks3;

    // Constructor
    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Display result
    public void displayResult() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("----- MARK SHEET -----");
        displayStudent();
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }
}

public class Practical31 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");

        Result obj = new Result(101, "Rahul", 85, 90, 88);
        obj.displayResult();
    }
}
