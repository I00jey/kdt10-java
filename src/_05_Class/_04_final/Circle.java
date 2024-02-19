package _05_Class._04_final;

import java.util.Scanner;

public class Circle {
    final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    static final double PI = 3.141592;

    public double calculatorArea() {
        return radius * radius * PI;
    }
}
