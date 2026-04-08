package polymorphism;

class Vehicle {
    int speed = 0;

    public void speedUp() {
        System.out.println("The vehicle is accelerating...");
    }
    
    public static void main(String[] args) {
        // UPCASTING: Storing different types in a Vehicle array
        Vehicle[] racingLine = { new Car(), new Bicycle(), new Car() };

        System.out.println("--- The Race Starts! ---");
        
        for (Vehicle v : racingLine) {
            // We don't need to know if it's a car or bike.
            // We just tell the "Vehicle" to speedUp().
            v.speedUp(); 
        }
    }
}

class Car extends Vehicle {
    @Override
    public void speedUp() {
        speed += 20; // High increase
        System.out.println("Car engine roars! Speed is now: " + speed + " km/h");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 5; // Low increase
        System.out.println("Pedaling hard! Speed is now: " + speed + " km/h");
    }
}