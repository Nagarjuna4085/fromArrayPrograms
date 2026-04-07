package ClassAndConstructor;

import java.util.ArrayList;

class ReservationSystem {

    ArrayList<String> flights;
    ArrayList<String> hotels;

    ArrayList<String> bookedFlights;
    ArrayList<String> bookedHotels;

    // Constructor
    ReservationSystem() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
        bookedFlights = new ArrayList<>();
        bookedHotels = new ArrayList<>();
    }

    // Add flights & hotels (initial data)
    public void addFlight(String flight) {
        flights.add(flight);
    }

    public void addHotel(String hotel) {
        hotels.add(hotel);
    }

    // Search flights
    public void searchFlights() {
        System.out.println("Available Flights:");
        for (String f : flights) {
            System.out.println("- " + f);
        }
    }

    // Search hotels
    public void searchHotels() {
        System.out.println("Available Hotels:");
        for (String h : hotels) {
            System.out.println("- " + h);
        }
    }

    // Book flight
    public void bookFlight(String flight) {
        if (flights.contains(flight)) {
            bookedFlights.add(flight);
            System.out.println("Flight booked: " + flight);
        } else {
            System.out.println("Flight not available!");
        }
    }

    // Cancel flight
    public void cancelFlight(String flight) {
        if (bookedFlights.contains(flight)) {
            bookedFlights.remove(flight);
            System.out.println("Flight cancelled: " + flight);
        } else {
            System.out.println("No such booking found!");
        }
    }

    // Book hotel
    public void bookHotel(String hotel) {
        if (hotels.contains(hotel)) {
            bookedHotels.add(hotel);
            System.out.println("Hotel booked: " + hotel);
        } else {
            System.out.println("Hotel not available!");
        }
    }

    // Cancel hotel
    public void cancelHotel(String hotel) {
        if (bookedHotels.contains(hotel)) {
            bookedHotels.remove(hotel);
            System.out.println("Hotel cancelled: " + hotel);
        } else {
            System.out.println("No such booking found!");
        }
    }

    // Show bookings
    public void showBookings() {
        System.out.println("\n--- Your Bookings ---");

        System.out.println("Flights:");
        for (String f : bookedFlights) {
            System.out.println("- " + f);
        }

        System.out.println("Hotels:");
        for (String h : bookedHotels) {
            System.out.println("- " + h);
        }
    }

    // Main method
    public static void main(String[] args) {

        ReservationSystem rs = new ReservationSystem();

        // Add data
        rs.addFlight("AI-101 New York to London");
        rs.addFlight("AI-202 India to Dubai");
        rs.addFlight("AI-303 Paris to Tokyo");

        rs.addHotel("Hilton Hotel - New York");
        rs.addHotel("Taj Hotel - India");
        rs.addHotel("Marriott - Dubai");

        // Search
        rs.searchFlights();
        rs.searchHotels();

        System.out.println();

        // Book
        rs.bookFlight("AI-101 New York to London");
        rs.bookHotel("Hilton Hotel - New York");

        // Cancel
        rs.cancelFlight("AI-303 Paris to Tokyo");

        // Show bookings
        rs.showBookings();
    }
}