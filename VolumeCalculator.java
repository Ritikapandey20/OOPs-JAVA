/*Write a Java program that demonstrates method overloading to calculate the volume of different 3D shapes. Implement overloaded methods named calculateVolume () for a Cube (takes one side length), a RectangularCube (takes length, width, height), and a Sphere (takes radius).*/

class VolumeCalculator {

    // Volume of Cube
    void calculateVolume(double side) {
        double volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    // Volume of Rectangular Cube
    void calculateVolume(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println("Volume of Rectangular Cube: " + volume);
    }

    // Volume of Sphere
    void calculateVolume(int radius) {
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
    }

    public static void main(String[] args) {

        VolumeCalculator v = new VolumeCalculator();

        v.calculateVolume(4);           // Cube
        v.calculateVolume(5, 3, 2);     // Rectangular Cube
        v.calculateVolume(3);           // Sphere
    }
}