package Inheritance;

public abstract class Shape {
    // Abstract method: No body { }, just a semicolon ;
    public abstract double getArea();
    public static void main(String[] args) {
		Rectangle r = new Rectangle(3.0,6.8);
		System.out.println(r.getArea());
	}
}

 class Rectangle extends Shape {
    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }
    
    
}