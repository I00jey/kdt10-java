package _05_Class._05_inheritance;

public class Cat extends Animal {
    public String type = "고양이";

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("냥!냥!");
    }
}
