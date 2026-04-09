package abstraction;

abstract class GeometricShape {
    // Every shape must be able to tell us its size
    public abstract double area();
    public abstract double perimeter();
}

class Square extends GeometricShape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

class Triangle extends GeometricShape {
    private double a, b, c; // three sides

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Using Heron's Formula
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}