package encapsulation;

public class Circle {
    // Private variable: The only piece of state we need to track
    private double radius;

    public Circle(double radius) {
        setRadius(radius); // Use setter for validation
    }

    // Getter (Read)
    public double getRadius() {
        return radius;
    }

    // Setter (Update with validation)
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive!");
        }
    }

    // Calculated Method: Area (PI * r^2)
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Calculated Method: Perimeter/Circumference (2 * PI * r)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}