package _05_Class._02_access_modifier;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();

        // 올바른 속도 변경
        myCar.setSpeed(80);
        System.out.println("현재 차의 속도 : " + myCar.getSpeed());
        System.out.println("멈춤 여부 : " + myCar.isStop());

        // 잘못된 속도 변경
        myCar.setSpeed(-30);
        System.out.println("현재 차의 속도 : " + myCar.getSpeed());
        System.out.println("멈춤 여부 : " + myCar.isStop());

        if (myCar.isStop()) {
            System.out.println("현재 차가 멈췄습니다");
        } else {
            System.out.println("현재 차가 운행 중입니다");
            System.out.println("현재 차의 속도 : " + myCar.getSpeed());
        }

    }
}
