package abstraction;

public abstract class Shape {

	// calculateArea
	public abstract double calculateArea();

//	 calculatePerimeter
	public abstract double calculatePerimeter();
	public static void main(String[] args) {
		Circle c = new Circle(4.0);
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
	}

}

// circle

class Circle extends Shape {
	double radius;

	Circle(double r) {
		this.radius = r;
	}

	// impleemnt calculateArea
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	// implement calculatePerimeter
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

}
