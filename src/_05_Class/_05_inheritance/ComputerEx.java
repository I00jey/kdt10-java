package _05_Class._05_inheritance;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면접 : " + computer.areaCircle(r));
        System.out.println();
    }
}
