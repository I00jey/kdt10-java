package _02_controll_statement;

import java.util.Scanner;

public class LoopPrac {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
