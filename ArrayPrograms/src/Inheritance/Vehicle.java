package Inheritance;

// Public class must match the filename
public class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }

    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle v = new Vehicle();
        v.drive(); // Prints: Driving a vehicle

        // Create a Car object
        Car c = new Car();
        c.drive(); // Prints: Repairing a car

        // Polymorphism: Vehicle reference, Car object
        Vehicle polyCar = new Car();
        polyCar.drive(); // Prints: Repairing a car
    }
}

// Subclass in the same file (not public)
class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}