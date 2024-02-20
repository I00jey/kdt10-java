package _05_Class._05_inheritance;

public class Vehicle {
    public String brand;
    public String model;
    public int year;

    public Vehicle(String brand, String model, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public void turnOn() {
        System.out.println("차량 시동을 걸었습니다.");
    }

    public void turnOff() {
        System.out.println("차량을 정지했습니다.");
    }
}
