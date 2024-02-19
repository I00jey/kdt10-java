package _05_Class._02_access_modifier;

import java.util.ArrayList;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        ArrayList<Rectangle> rect = new ArrayList<>();
        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            Scanner scanner = new Scanner(System.in);
            int weight = scanner.nextInt();
            int height = scanner.nextInt();
            if (weight == 0 && height == 0) {
                break;
            }
            Rectangle rec = new Rectangle(weight);
            rec.setHeight(height);
            rect.add(rec);
        }
        for (Rectangle rectangle : rect) {
            System.out.println("-----------------------------------------");
            System.out.println("세로 길이는 : " + rectangle.getWidth());
            System.out.println("가로 길이는 : " + rectangle.getHeight());
            System.out.println("넓이는 : " + rectangle.getArea());
        }
        System.out.println("------------------------------------");
        System.out.println("Rectangle 인스턴스의 개수는 : " + rect.size());
    }
}
