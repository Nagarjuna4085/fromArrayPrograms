package interfaces;

interface Flyable {
    // The "Action" contract
    void fly_obj();
}

class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft: Using rocket boosters to exit the atmosphere.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane: Using wings and jet engines to maintain lift.");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter: Using rotating blades to fly vertically.");
    }
}