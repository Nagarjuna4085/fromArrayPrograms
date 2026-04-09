package interfaces;

interface Drawable {
    // Every class must provide its own "rendering" logic
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle: Calculating points around a center...");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle: Connecting four vertices with 90-degree angles...");
    }
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle: Connecting three vertices...");
    }
}