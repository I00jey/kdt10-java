package _05_Class._04_final;

public class Student {
    // final 필드
    final String name = "코딩온"; // 1. 필드 선언 시 초기화
    final String sid; // 2. 생성자에서 초기화

    public Student(String sid) {
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student st1 = new Student("s001");
        System.out.println(st1.name);
        System.out.println(st1.sid);
        // final 필드 값 변경 불가능
        // sid1.name = "홍길동"; // 에러
    }
}
