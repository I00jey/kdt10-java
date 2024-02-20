package _05_Class._05_inheritance;

public class Motorcycle extends Vehicle {
    public char licenseType;

    public Motorcycle(String brand, String model, int year, char licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    public void Func() {
        System.out.println("울림통을 합니다.");
    }
}
