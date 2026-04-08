package polymorphism;

// Base Class
abstract class ShapeD {
    // Abstract because every shape MUST be drawn and have an area
    public abstract void draw();
    public abstract double calculateArea();
}

// Subclass 1: Circle
class Circle extends ShapeD {
    private double radius;

    Circle(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2: Square
class Square extends ShapeD {
    private double side;

    Square(double side) { this.side = side; }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side: " + side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Subclass 3: Triangle
class Triangle extends ShapeD {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with base " + base + " and height " + height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}