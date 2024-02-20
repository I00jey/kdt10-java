package _05_Class._05_inheritance;

public class VehicleEx {
    public static void main(String[] args) {
        Bus bus = new Bus("현대", "city bus", 2022, 30);
        System.out.println("=== Bus 정보 ===");
        System.out.print(" brand : " + bus.brand);
        System.out.print(", model : " + bus.model);
        System.out.print(", year : " + bus.year);
        System.out.println(", passengerCapacity : " + bus.passengerCapacity);
        bus.turnOn();
        bus.Func();
        bus.turnOff();
        Car car = new Car("toyota", "camry", 2024, true);
        System.out.println("=== Car 정보 ===");
        System.out.print(" brand : " + car.brand);
        System.out.print(", model : " + car.model);
        System.out.print(", year : " + car.year);
        System.out.println(", convertible : " + car.convertible);
        car.turnOn();
        car.Func();
        car.turnOff();
        Motorcycle motorcycle = new Motorcycle("harley", "sporter", 2021, 'A');
        System.out.println("=== Motorcycle 정보 ===");
        System.out.print(" brand : " + motorcycle.brand);
        System.out.print(", model : " + motorcycle.model);
        System.out.print(", year : " + motorcycle.year);
        System.out.println(", licenseType : " + motorcycle.licenseType);
        motorcycle.turnOn();
        motorcycle.Func();
        motorcycle.turnOff();
    }
}
