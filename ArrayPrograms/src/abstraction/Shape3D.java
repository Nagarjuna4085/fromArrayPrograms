package abstraction;

abstract class Shape3D {
    // Every 3D shape MUST have these two things
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        // Formula: (4/3) * PI * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        // Formula: 4 * PI * r^2
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        // Formula: side^3
        return Math.pow(side, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        // Formula: 6 * side^2
        return 6 * Math.pow(side, 2);
    }
}