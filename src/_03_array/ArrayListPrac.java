package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();
        while (true) {
            System.out.println("문자를 입력해주세요");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            stringArray.add(input);
        }
        for (String s : stringArray) {
            System.out.println(s);
        }

    }
}
