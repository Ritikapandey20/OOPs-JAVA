public class Rectangle {

    double width;
    double height;

    // No-argument constructor
    Rectangle() {
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        System.out.println("En-no = 240390107041");
        Rectangle obj1 = new Rectangle();
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPerimeter());

        Rectangle obj2 = new Rectangle(10.0, 20.0);
        System.out.println("Area: " + obj2.getArea());
        System.out.println("Perimeter: " + obj2.getPerimeter());
    }
}

