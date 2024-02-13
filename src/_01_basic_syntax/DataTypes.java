package _01_basic_syntax;

public class DataTypes {
    public static void main(String[] args) {

        // 참조형
        // - java.lang.Object 상속 받음
        // - 기본형이 아니면 모두 참조형
        System.out.println("----참조형----");

        // String 참조형 변수 선언과 초기화
        // - java에서 String 타입은 특별함. 참조형이지만, 기본형처럼 사용 (불변 객체)
        // - 기본 자료형은 "==" 비교하지만, String 객체간 비교는 .equals() 메소드 사용
        String greeting = "hello, world!";

        // 배열 참조형 변수 선언과 초기화
        int[] nums = {1, 2, 3, 4, 5};

        // 클래스 참조형 변수 선언과 초기화
        Person person = new Person("john", 20);
        System.out.println(person.getAge());

        // 출력
        System.out.println("String 변수 : " + greeting);

        // 배열 ver. 일반 for 문
        System.out.println("배열 변수 : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        // ver. for-each 문
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Person 클래스 객체 : " + person.getName() + ", " + person.getAge());

    }
}

// 클래스 (추후 배울 예정)
class Person {
    String name;
    int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 클래스 내부 함수 == 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}