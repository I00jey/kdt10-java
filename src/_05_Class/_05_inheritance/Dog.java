package _05_Class._05_inheritance;

public class Dog extends Animal {
    public String type = "강아지";

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("멍!멍!");
    }
}
