/*Design a base class Shape with two double data members’ d1 and d2 to store dimensions. Include a method getData (double d1, double d2) to initialize these dimensions. Create two derived classes, Triangle and Rectangle, which inherit from Shape. Each derived class should have its own method to calculate its specific area.*/

class Shape {
    double d1, d2;

    // Method to initialize dimensions
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class for Triangle
class Triangle extends Shape {

    // Method to calculate area of triangle
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}

// Derived class for Rectangle
class Rectangle extends Shape {

    // Method to calculate area of rectangle
    double calculateArea() {
        return d1 * d2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.getData(10, 5);
        System.out.println("Area of Triangle: " + t.calculateArea());

        Rectangle r = new Rectangle();
        r.getData(10, 5);
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}

