package _05_Class._04_final;

// final 변수
// - final 키워드가 지정된 변수는 한번 초기화하면 값 변경할 수 없음
public class FinalVariableEx {
    public static void main(String[] args) {
        // final 변수 선언 및 초기화
        final int finalNumber = 10;

        // 초기화가 된 값을 변경하려고 하면 컴파일 오류 발생
        // finalNumber = 20;

        // 읽기 전용
        System.out.println("final number : " + finalNumber);
    }
}
