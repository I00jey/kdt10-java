package _05_Class._03_static;

public class CalculatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        double circleArea = num1 * num1 * Calculator.pi;

        int plusResult = Calculator.plus(num1, num2);
        int minusResult = Calculator.minus(num1, num2);

        System.out.println("원 너비 : " + circleArea);
        System.out.println("더하기 : " + plusResult);
        System.out.println("빼기 : " + minusResult);

    }
}
