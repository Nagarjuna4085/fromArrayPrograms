package polymorphism;

public class AreaCalculator {
    public static void main(String[] args) {
        // UPCASTING: An array of different shapes
        Shape[] shapes = {
            new Circle(5), 
            new Rectangle(4, 5), 
            new Triangle(3, 4)
        };

        for (Shape s : shapes) {
            // Polymorphism in action:
            // s.calculateArea() calls the CORRECT math for each shape
            System.out.println("Area: " + s.calculateArea());
        }
    }
}