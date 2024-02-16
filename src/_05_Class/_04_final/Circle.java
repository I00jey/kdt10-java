package _05_Class._04_final;

import java.util.Scanner;

public class Circle {
    final double radius;
    private static final double PI = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatorArea() {
        return radius * radius * PI;
    }

}
