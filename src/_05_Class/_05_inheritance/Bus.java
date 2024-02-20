package _05_Class._05_inheritance;

public class Bus extends Vehicle {

    public int passengerCapacity;

    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    public void Func() {
        System.out.println("승객을 운송합니다.");
    }

}
