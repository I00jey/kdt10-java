package _01_basic_syntax;

public class Random {
    public static void main(String[] args) {
        // 0.0 <= Math.random() < 1.0
        // 0.0 <= Math.random()*6 < 6.0
        // 1.0 <= (Math.random()*6) +1 < 7.0
        // 1 <= (int)(Math.random()*6) +1 < 7
        // 1 ~ 6까지의 난수 생성
        int randomNum = (int) (Math.random() * 6 + 1);
        System.out.println(randomNum);
    }
}
