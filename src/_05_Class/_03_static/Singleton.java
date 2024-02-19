package _05_Class._03_static;

public class Singleton {

    // private 접근 권한을 갖는 정적 필드 선언과 초기화
    // -> 미리 객체를 생성하여 초기화
    // private 를 붙여 외부에서 정적 필드값 변경 불가능
    private static Singleton singleton = new Singleton();

    // private 접근 권한을 갖는 생성자 선언
    private Singleton() {
    }

    // public 접근 권환을 갖는 정적 메소드 서언
    // 정적 필드값을 리턴하는 getInstance 정적 페소드를 public 으로 선언
    public static Singleton getInstance() {
        return singleton;
    }


}
