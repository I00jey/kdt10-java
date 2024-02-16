package _05_Class._02_access_modifier;

import java.util.ArrayList;
import java.util.Scanner;

public class RectMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Rectangle 객체를 담은 ArrayList 생성
        ArrayList<Rectangle> list = new ArrayList<>();

        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 입력해주세요");
            int ip1 = scanner.nextInt();
            int ip2 = scanner.nextInt();

            // 0이 입력되면 종료
            if (ip1 == 0 && ip2 == 0) {
                System.out.println("-------------------------------------------");
                break;
            }

            Rectangle rect = new Rectangle(ip1, ip2);
            //ArrayList 에 Rectangles 객체 추가
            list.add(rect);
        }

        // 입력된 Rectangle 객체들의 정보 출력
        for (Rectangle r : list) {
//            System.out.println(r.cal(r.getWidth(), r.getHeight()));
            System.out.println("가로 길이는 : " + r.getWidth());
            System.out.println("세로 길이는 : " + r.getHeight());
            System.out.println("넓이는 : " + r.getArea());
            System.out.println("-------------------------------------------");

        }
        System.out.print("Rectangle 인스턴스의 개수는  : " + list.size());
        scanner.close();
    }

}
