package _05_Class._05_inheritance;

public class SmartPhoneEx {
    public static void main(String[] args) {
        // smartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "핑크");

        // Phone 으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        // SmartPhone 의 필드 읽기
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        // Phone 으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 문의드리려고 전화했습니다.");
        myPhone.sendVoice("아 네! 그렇군요.");
        myPhone.hangUp();

        // SmartPhone 의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();

    }
}
