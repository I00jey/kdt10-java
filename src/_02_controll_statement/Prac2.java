package _02_controll_statement;

import java.util.Scanner;

public class Prac2 {

    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
//        String result = switch (name) {
//            case "홍길동" -> "남자";
//            case "성춘향" -> "여자";
//            default -> "모르겠어요.";
//        };

        String result;
        if (name.equals("홍길동")) {
            result = "남자";
        } else if (name.equals("성춘향")) {
            result = "여자";
        } else {
            result = "모르겠어요";
        }
        System.out.println(result);
    }
}
