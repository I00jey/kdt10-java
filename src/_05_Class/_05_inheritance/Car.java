package _05_Class._05_inheritance;

public class Car extends Vehicle {
    public boolean convertible;

    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    public void Func() {
        System.out.println("주차했습니다.");
    }

}
