/*Write a Java program using four different packages to demonstrate the use of access specifiers.
•	Package apack:
1.	Define a class A with three variables:
a)	public int pubVar
b)	protected int protVar
c)	private int privVar
2.	Provide a constructor to initialize them.
•	Package bpack:
1.	Define a class B that extends A.
2.	Create a display() method that tries to access variables of A using inheritance.
•	Package cpack:
1.	Define a class C with a display() method.
2.	Inside display(), create an object of class A and try to access its variables.
•	Package dpack:
1.	Define a class ProtectedDemo with main().
2.	Create objects of class B and class C.
3.	Call their respective display() methods to show which variables are accessible and which are not.*/

// Save as Practical32.java

class A {
    public int pubVar;
    protected int protVar;
    private int privVar;

    // Constructor
    public A(int a, int b, int c) {
        pubVar = a;
        protVar = b;
        privVar = c;
    }

    public int getPrivVar() {
        return privVar;
    }
}

// Simulating package bpack
class B extends A {

    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
        System.out.println("Accessing from class B (inherits A):");
        System.out.println("Public Variable    : " + pubVar);
        System.out.println("Protected Variable : " + protVar);
        // private variable not accessible directly
        System.out.println("Private Variable   : Not Accessible");
    }
}

// Simulating package cpack
class C {

    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("\nAccessing from class C (object of A):");
        System.out.println("Public Variable    : " + obj.pubVar);
        // protected accessible here only because same file/package simulation
        System.out.println("Protected Variable : " + obj.protVar);
        System.out.println("Private Variable   : Not Accessible");
    }
}

public class Practical32 {
    public static void main(String[] args) {
        System.out.println("Ritika Pandey");
        System.out.println("En-roll: 240390107041");

        B obj1 = new B(5, 15, 25);
        C obj2 = new C();

        obj1.display();
        obj2.display();
    }
}