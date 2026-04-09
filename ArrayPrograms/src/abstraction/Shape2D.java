package abstraction;

abstract class Shape2D {
    // No variables here! Just defining the "What"
    public abstract void draw();
    public abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    private double width, height;

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: " + width + "x" + height);
    }

    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
        System.out.println("Rectangle resized by factor " + factor);
    }
}

class Circle01 extends Shape2D {
    private double radius;

    Circle01(double r) {
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
        System.out.println("Circle resized by factor " + factor);
    }
}