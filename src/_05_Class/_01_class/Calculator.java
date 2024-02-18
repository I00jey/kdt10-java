package _05_Class._01_class;

public class Calculator {
    void powerOn() {
        System.out.println("시스템이 켜집니다");
    }

    public Calculator() {
        powerOn(); // 생성자 내부 호출
    }

    int plus(int x, int y) {
        powerOn(); // 다른 메소드 내부 호출
        return x + y;
    }

    double divide(int x, int y) {
        return (double) x / y;
    }

}
