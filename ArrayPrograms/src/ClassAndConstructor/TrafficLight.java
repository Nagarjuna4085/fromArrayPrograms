package ClassAndConstructor;

public class TrafficLight {

    String color;
    int duration;

    // Constructor
    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change color
    public void changeColor(String newColor) {
        color = newColor;
    }

    // Check if red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Check if green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Display details
    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
    }

    public static void main(String[] args) {

        // Creating object
        TrafficLight t1 = new TrafficLight("Red", 30);

        // Display initial state
        System.out.println("Initial State:");
        t1.display();

        // Check color
        System.out.println("Is Red? " + t1.isRed());
        System.out.println("Is Green? " + t1.isGreen());

        // Change color
        t1.changeColor("Green");

        System.out.println("\nAfter Changing Color:");
        t1.display();

        // Check again
        System.out.println("Is Red? " + t1.isRed());
        System.out.println("Is Green? " + t1.isGreen());
    }
}