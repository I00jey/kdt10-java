package _05_Class._07_interface;

// [public | default] interface 인터페이스명 {...}
public interface RemoteControl {
    // public 추상 메소드
    // {} 중괄호는 생략
    // [ public abstract ] 리턴타입 메소드명(매개변수, ...)
    public abstract void turnOn();

    void turnOff();

    void setVolume(int volume);

    // 상수 필드
    // [ public static final ] 타입 상수명 = 값
    public static final int MAX_VOLUME = 10;
    // public static final 생략 가능
    int MIN_VOLUME = 0;

    // 디폴트 메서드
    // [public] default 리턴타입 메소드명(매개변수, ...) {...}
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            // 추상 메소드 호출 + 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드
    // [public | private] static 리턴타입 메소드명(매개변수, ...) {...}
    public static void changeBattery() {
        System.out.println("리모콘 건전지를 교체합니다.");
    }

}
