/*Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes both x and y to 5. Provide a parameterized constructor to initialize x and y with user-supplied values. Also, implement a copy constructor to create a new Point object as a copy of an existing Point object. Include a display() method to show the point's coordinates and write a main method to test all constructors and the display functionality.
in java*/

class Point {

    int x;
    int y;

    // 1. Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // 2. Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // 3. Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Method to display coordinates
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    // Main method
    public static void main(String[] args) {

        // Using default constructor
        Point p1 = new Point();
        p1.display();

        // Using parameterized constructor
        Point p2 = new Point(10, 20);
        p2.display();

        // Using copy constructor
        Point p3 = new Point(p2);
        p3.display();
    }
}
 