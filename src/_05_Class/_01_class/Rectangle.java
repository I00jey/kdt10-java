package _05_Class._01_class;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.area());
    }
}
