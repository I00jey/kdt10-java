package _05_Class._07_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        // 인터페이스도 하나의 타입 (참조 타입)
        RemoteControl rc;

        // Television 객체를 생성, 번지를 대입
        rc = new Television();
        // 재정의된 Television 의 메소드
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        System.out.println();

        // rc 변수에는 인터페이스를 구현한 어떠한 객체든 대입 가능
        // rc 변수에 Audio 객체를 대입 (교체시킴)
        rc = new Audio();
        // Audio 에서 재정의된 메소드
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
        System.out.println();

        // 인터페이스 상수필드 호출
        System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
        System.out.println();

        // 디폴트 메소드 호출
        rc.setMute(true);
        rc.setMute(false);
        System.out.println();

        // 정적 메소드 호출
        RemoteControl.changeBattery();
        System.out.println();

    }
}
