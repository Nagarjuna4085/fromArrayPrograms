package ClassAndConstructor;

public class Rectangle01 extends Shape {
    double length;
    double width;

    Rectangle01(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }


}
