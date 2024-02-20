package _05_Class._06_abstract;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Blue", "Circle");
        Rectangle rectangle = new Rectangle(10, 4, "Red", "Rectangle");
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);

        for (Shape shape : shapeList) {
            System.out.println("===" + shape.type + " 도형의 정보===");
            System.out.println("도형의 색상 : " + shape.getColor());
            System.out.println("도형의 넓이 : " + shape.calculateArea());
            System.out.println("-----------------------------------");
        }
    }
}
