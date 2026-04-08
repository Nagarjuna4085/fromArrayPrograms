package Inheritance;

// Base Class: Holds common data
abstract class Vehicle01 {
    String make, model, fuelType;
    int year;

    public Vehicle01(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Abstract methods: Every subclass MUST define its own math
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistance(double fuelUsed);
    public abstract int maxSpeed();

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
    }
    
}

// Subclass 1: Truck (Low efficiency, high torque)
class Truck extends Vehicle01 {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() { return 15.0; } // 15 miles per gallon

    @Override
    public double calculateDistance(double fuelUsed) { return fuelUsed * calculateFuelEfficiency(); }

    @Override
    public int maxSpeed() { return 90; }
}

// Subclass 2: Motorcycle (High efficiency, high speed)
class Motorcycle extends Vehicle01 {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() { return 50.0; } // 50 miles per gallon

    @Override
    public double calculateDistance(double fuelUsed) { return fuelUsed * calculateFuelEfficiency(); }

    @Override
    public int maxSpeed() { return 180; }
}