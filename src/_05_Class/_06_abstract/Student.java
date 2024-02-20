package _05_Class._06_abstract;

// 추상 클래스 선언
public abstract class Student {
    String name;
    String school;
    int age;
    int studentNum;

    public Student(String name, String school, int age, int studentNum) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentNum = studentNum;
    }

    // 추상 메소드 선언
    public abstract void todo();

}
