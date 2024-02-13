package _01_basic_syntax;

import java.util.Scanner;

public class BasicPrac {
    public static void main(String[] args) {

        System.out.println("이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();
        System.out.printf("안녕하세요! %s님 (%d세)", name, age);
    }
}
