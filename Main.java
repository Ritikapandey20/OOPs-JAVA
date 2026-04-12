/*Create a base class named Vehicle that contains common attributes such as vehicleNumber, brand, and fuelType. Include a constructor to initialize these fields and a method displayDetails() to print them. Derive a subclass Car from Vehicle which adds attributes such as numberOfSeats and ACavailable (boolean). Override the displayDetails() method to include the car-specific details, and use the super keyword to invoke the parent class constructor and methods. Further, derive another subclass ElectricCar from Car that includes attributes such as batteryCapacity and chargingTime, and again override the displayDetails() method to include electric car-specific details. Demonstrate constructor chaining, method overriding, use of protected access specifier for inherited members, and instanceof operator to check object type at runtime. In the main() method, create objects of all three classes and display their details using overridden methods. Also, use upcasting (Vehicle v = new Car(...)) and downcasting with instanceof check to access subclass- specific features.*/

class Vehicle {
    // protected members (accessible in subclasses)
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    // Constructor
    Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
        System.out.println("Vehicle Constructor Called");
    }

    // Method
    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    // Constructor (constructor chaining using super)
    Car(String vehicleNumber, String brand, String fuelType,
        int numberOfSeats, boolean ACavailable) {
        
        super(vehicleNumber, brand, fuelType); // calling parent constructor
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
        System.out.println("Car Constructor Called");
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails(); // calling parent method
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

// Subclass ElectricCar
class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;

    // Constructor chaining
    ElectricCar(String vehicleNumber, String brand, String fuelType,
                int numberOfSeats, boolean ACavailable,
                int batteryCapacity, int chargingTime) {
        
        super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
        System.out.println("ElectricCar Constructor Called");
    }

    // Overriding method
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hrs");
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        // Object of Vehicle
        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        System.out.println("\n--- Vehicle Details ---");
        v1.displayDetails();

        // Object of Car
        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        System.out.println("\n--- Car Details ---");
        c1.displayDetails();

        // Object of ElectricCar
        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric", 5, true, 75, 2);
        System.out.println("\n--- Electric Car Details ---");
        e1.displayDetails();

        // Upcasting
        Vehicle v2 = new Car("GJ04GH3456", "Honda", "Petrol", 4, false);
        System.out.println("\n--- Upcasting Example ---");
        v2.displayDetails(); // calls overridden method (runtime polymorphism)

        // Downcasting using instanceof
        if (v2 instanceof Car) {
            Car c2 = (Car) v2; // downcasting
            System.out.println("Downcasting successful. Accessing Car-specific data:");
            System.out.println("Seats: " + c2.numberOfSeats);
        }

        // instanceof check for ElectricCar
        if (e1 instanceof ElectricCar) {
            System.out.println("\ne1 is an instance of ElectricCar");
        }
    }
}