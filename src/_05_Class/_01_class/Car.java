package _05_Class._01_class;

public class Car {
    String model;

    int speed;
    boolean start;

    public Car() {
        System.out.println("매개변수 없는 생성자");
    }

    public Car(String model, int speed) {
        System.out.println("매개변수 2개 : " + model + ", " + speed);
    }

    public Car(String model, int speed, boolean start) {
        System.out.println("매개변수 3개 : " + model + ", " + speed + ", " + start);
    }

    Tire tire = new Tire();
}
