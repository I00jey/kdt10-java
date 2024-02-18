package _05_Class._01_class;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.powerOn();   // 외부 객체 호출 (도트 연산자 사용)
        System.out.println(calculator.plus(1, 3));
        System.out.println(calculator.divide(1, 8));
    }
}
