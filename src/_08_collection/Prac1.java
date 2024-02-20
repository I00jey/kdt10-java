package _08_collection;

import java.util.HashSet;
import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        while (true) {
            System.out.print("정수 입력 : ");
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            hashSet.add(input);
        }
        System.out.print("중복 제거된 정수 목록 : " + hashSet);
    }
}
