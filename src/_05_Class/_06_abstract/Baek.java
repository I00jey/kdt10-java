package _05_Class._06_abstract;

public class Baek extends Student {
    String name = "백영희";
    String school = "XYZ 고등학교";
    int age = 19;
    int studentNum = 193349;

    public Baek() {
        super("백영희", "XYZ 고등학교", 19, 193349);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
