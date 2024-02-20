package _05_Class._06_abstract;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int height, int width, String color, String type) {
        super(color, type);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
