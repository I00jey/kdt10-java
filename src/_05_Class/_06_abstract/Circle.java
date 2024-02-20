package _05_Class._06_abstract;

public class Circle extends Shape {

    public int radius;

    public Circle(int radius, String color, String type) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
