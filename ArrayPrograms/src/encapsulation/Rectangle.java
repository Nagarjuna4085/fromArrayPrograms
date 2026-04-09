package encapsulation;

public class Rectangle {
    // Private variables: Hiding the state
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        setLength(length); // Using setters in constructor to ensure validation
        setWidth(width);
    }

    // GETTERS (Read)
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // SETTERS (Update with Validation)
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive!");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive!");
        }
    }

    // A helper method (Logic bundled with Data)
    public double calculateArea() {
        return length * width;
    }
}