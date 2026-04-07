package ClassAndConstructor;

public class Airplane {

    String flightNumber;
    String destination;
    String departureTime;
    int delayMinutes;

    // Constructor
    Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayMinutes = 0; // default no delay
    }

    // Method to check flight status
    public void checkStatus() {
        if (delayMinutes == 0) {
            System.out.println("Flight " + flightNumber + " is ON TIME.");
        } else {
            System.out.println("Flight " + flightNumber + " is DELAYED by " + delayMinutes + " minutes.");
        }
    }

    // Method to add delay
    public void addDelay(int minutes) {
        delayMinutes += minutes;
    }

    // Display flight details
    public void display() {
        System.out.println("Flight No: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Delay: " + delayMinutes + " minutes");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Create airplane object
        Airplane a1 = new Airplane("AI101", "New York", "10:30 AM");

        // Display initial status
        a1.display();
        a1.checkStatus();

        // Add delay
        a1.addDelay(45);

        System.out.println("\nAfter Delay Update:");
        a1.display();
        a1.checkStatus();
    }
}