package ClassAndConstructor;

public class Rectangle {

    int width;
    int height;

    // Constructor
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public int calculateArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        // Creating object
        Rectangle r1 = new Rectangle(10, 5);

        // Calculations
        int area = r1.calculateArea();
        int perimeter = r1.calculatePerimeter();

        // Output
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}