package _05_Class._05_inheritance;

public class SmartPhone extends Phone {
    public boolean wifi;


    public SmartPhone(String model, String color) {
        // 부모 생성자 호출
        // super(); // 기본
        super(model, color);
        // phone 으로부터 상속받은 필드
        this.model = model;
        this.color = color;
        System.out.println("자식 SmartPhone 생성자 호출");
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다");
    }

}
