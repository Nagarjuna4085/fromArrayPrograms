package polymorphism;

// Abstract class: It's a "Blueprint," not a real object
abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) { 
        this.width = width; 
        this.height = height; 
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}