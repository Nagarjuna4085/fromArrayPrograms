package ClassAndConstructor;

import java.util.ArrayList;

class Restaurant {

    ArrayList<String> menuItems;
    ArrayList<Double> prices;
    ArrayList<Integer> ratings;

    // Constructor
    Restaurant() {
        menuItems = new ArrayList<>();
        prices = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    // Add item
    public void addItem(String item, double price, int rating) {
        menuItems.add(item);
        prices.add(price);
        ratings.add(rating);
    }

    // Remove item
    public void removeItem(String item) {
        int index = menuItems.indexOf(item);

        if (index != -1) {
            menuItems.remove(index);
            prices.remove(index);
            ratings.remove(index);
            System.out.println(item + " removed successfully.");
        } else {
            System.out.println("Item not found!");
        }
    }

    // Calculate average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int r : ratings) {
            sum += r;
        }

        return (double) sum / ratings.size();
    }

    // Display menu
    public void displayMenu() {
        System.out.println("----- Restaurant Menu -----");

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) +
                    " | Price: $" + prices.get(i) +
                    " | Rating: " + ratings.get(i));
        }
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        // Add items
        r.addItem("Burger", 5.99, 4);
        r.addItem("Pizza", 8.99, 5);
        r.addItem("Pasta", 7.49, 4);
        r.addItem("Fries", 3.99, 3);

        // Display menu
        r.displayMenu();

        // Remove item
        r.removeItem("Fries");

        System.out.println();

        // Display again
        r.displayMenu();

        // Average rating
        System.out.println("\nAverage Rating: " + r.calculateAverageRating());
    }
}