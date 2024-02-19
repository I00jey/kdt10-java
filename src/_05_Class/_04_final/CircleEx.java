package _05_Class._04_final;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요 : ");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("원의 반지름 : " + circle.radius);
        System.out.println("원의 넓이 : " + circle.calculatorArea());
    }

}
