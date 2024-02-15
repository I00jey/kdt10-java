package _03_array;

import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }
        System.out.println("평균은 " + (double) sum / 5);
        scanner.close();
    }
}
