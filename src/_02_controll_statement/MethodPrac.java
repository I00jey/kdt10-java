package _02_controll_statement;

import java.util.Scanner;

public class MethodPrac {


    public static void main(String[] args) {
//        System.out.println("숫자 두 개를 입력하세요");
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println("덧셈 결과 : " + plus(a, b));
//        System.out.println("뺄셈 결과 : " + minus(a, b));
//        System.out.println("곱셈 결과 : " + sub(a, b));
//        System.out.println("나눗셈 결과 : " + div(a, b));


        MethodPrac instance = new MethodPrac();
        System.out.println("반지름이 5인 원의 넓이 : " + instance.overload(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이 : " + instance.overload(4, 7.0)
        );
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : " + instance.overload(6.0, 3));


    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public double overload(int a) {
        return Math.pow(a, 2) * Math.PI;
    }

    public double overload(int a, double b) {
        return a * b;
    }

    public double overload(double a, int b) {
        return a * b / 2;
    }
}
