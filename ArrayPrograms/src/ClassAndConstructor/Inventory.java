package ClassAndConstructor;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Product> products = new ArrayList<>();

    // Add product
    public void addProduct(Product p) {
        products.add(p);
    }

    // Remove product by name
    public void removeProduct(String name) {
        boolean removed = products.removeIf(p -> p.name.equalsIgnoreCase(name));

        if (!removed) {
            System.out.println(name + " not found in inventory!");
        }
    }

    // Check low inventory (threshold = 5)
    public void checkLowInventory() {
        System.out.println("Low Inventory Products:");
        for (Product p : products) {
            if (p.quantity < 5) {
                System.out.println(p.name + " | Quantity: " + p.quantity);
            }
        }
    }

    // Display all products
    public void displayInventory() {
        System.out.println("Inventory List:");
        for (Product p : products) {
            p.display();
        }
    }

    public static void main(String[] args) {

        Inventory inv = new Inventory();

        // Add products
        inv.addProduct(new Product("Laptop", 10));
        inv.addProduct(new Product("Mouse", 3));
        inv.addProduct(new Product("Keyboard", 2));
        inv.addProduct(new Product("Monitor", 8));

        System.out.println("After Adding Products:");
        inv.displayInventory();

        // Check low inventory
        System.out.println("\nChecking Low Inventory:");
        inv.checkLowInventory();

        // Remove product
        inv.removeProduct("Mouse");

        System.out.println("\nAfter Removing Product:");
        inv.displayInventory();
    }
}