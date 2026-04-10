package interfaces;

public interface Shape {
	double PI_VALUE = Math.PI;
	// Methods are implicitly: public abstract
    double getArea();

}
class Circle implements Shape {
    private double radius;

    // Constructor (Note: Class name starts with Uppercase)
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI_VALUE * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
