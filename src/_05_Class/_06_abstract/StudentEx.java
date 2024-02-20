package _05_Class._06_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim();
        System.out.printf("=== %s 학생의 정보 ===%n", kim.name);
        System.out.println("학교 : " + kim.school);
        System.out.println("나이 : " + kim.age);
        System.out.println("학번 : " + kim.studentNum);
        kim.todo();
        Baek baek = new Baek();
        System.out.printf("=== %s 학생의 정보 ===%n", baek.name);
        System.out.println("학교 : " + baek.school);
        System.out.println("나이 : " + baek.age);
        System.out.println("학번 : " + baek.studentNum);
        baek.todo();
    }
}

