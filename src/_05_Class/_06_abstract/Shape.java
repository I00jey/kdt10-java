package _05_Class._06_abstract;

public abstract class Shape {
    public String color;
    public String type;

    public abstract double calculateArea();

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }
}
