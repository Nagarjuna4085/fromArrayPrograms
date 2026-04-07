package ClassAndConstructor;

public class ShapeTest {
	public static void main(String[] args) {

		Shape r = new Rectangle01(10, 5);
		Shape c = new Circle01(7);
		Shape t = new Triangle(3, 4, 5);

		System.out.println("Rectangle Area: " + r.calculateArea());
		System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());

		System.out.println("\nCircle Area: " + c.calculateArea());
		System.out.println("Circle Perimeter: " + c.calculatePerimeter());

		System.out.println("\nTriangle Area: " + t.calculateArea());
		System.out.println("Triangle Perimeter: " + t.calculatePerimeter());
	}

}
