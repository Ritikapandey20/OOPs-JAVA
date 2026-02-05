/*Define a Java class named Rectangle. It should have two double data fields: width and height. In your main method, create two Rectangle objects: one with width 4 and height 40, and another with width 3.5 and height 35.9. For each rectangle, display its width, height, calculated area, and perimeter. Then, compare the two rectangles based on their areas and print which one has a larger area.*/
class Rectangle2 { //i have already created a class name rectangle that's why i will be naming it Rectangle2 
    double width;
    double height;

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        // Creating first Rectangle object
        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 40;

        // Creating second Rectangle object
        Rectangle r2 = new Rectangle();
        r2.width = 3.5;
        r2.height = 35.9;

        // Display details of first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        // Display details of second rectangle
        System.out.println("\nRectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());

        // Comparing areas
        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has a larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("\nRectangle 2 has a larger area.");
        } else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
}


