package _02_controll_statement;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String result = switch (age) {
            case 1, 2, 3, 4, 5, 6, 7 -> "유아";
            case 8, 9, 10, 11, 12, 13 -> "초등학생";
            case 14, 15, 16 -> "중학생";
            case 17, 18, 19 -> "고등학생";
            default -> "성인";
        };
        System.out.println(result);
    }
}
