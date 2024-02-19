package _05_Class._05_inheritance;

public class Computer extends Calculator {

    // 메소드 오버라이딩
    @Override   // 컴파일 시 정확히 오버라이딩이 되었는지 체크 (생략 가능)
    public double areaCircle(double r) {
        System.out.println("Computer 클래스의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
