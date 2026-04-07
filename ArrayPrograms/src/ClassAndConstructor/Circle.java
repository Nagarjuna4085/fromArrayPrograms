package ClassAndConstructor;

public class Circle {

    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        // Creating object
        Circle c1 = new Circle(5);

        // Calculations
        double area = c1.calculateArea();
        double circumference = c1.calculateCircumference();

        // Output
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
}