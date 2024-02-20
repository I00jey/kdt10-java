package _05_Class._06_abstract;

public class Kim extends Student {
    String name = "김철수";
    String school = "ABC 고등학교";
    int age = 17;
    int studentNum = 174949;

    public Kim() {
        super("김철수", "ABC 고등학교", 17, 174949);

    }

    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}
