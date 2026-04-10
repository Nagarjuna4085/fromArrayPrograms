package interfaces;

// The Contract: Any object implementing this can change its dimensions
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the contract
    @Override
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width resized to: " + width);
        } else {
            System.out.println("Invalid width!");
        }
    }

    @Override
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height resized to: " + height);
        } else {
            System.out.println("Invalid height!");
        }
    }

    public void display() {
        System.out.println("Rectangle Dimensions: " + width + "x" + height);
    }
}