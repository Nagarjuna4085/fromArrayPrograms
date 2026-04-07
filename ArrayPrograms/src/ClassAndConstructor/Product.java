package ClassAndConstructor;

public class Product {

    String name;
    int quantity;

    // Constructor
    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Display product
    public void display() {
        System.out.println(name + " | Quantity: " + quantity);
    }
}
