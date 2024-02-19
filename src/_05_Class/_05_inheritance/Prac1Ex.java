package _05_Class._05_inheritance;


public class Prac1Ex {
    public static void main(String[] args) {
        Cat cat = new Cat("시루", 4);
        System.out.println(cat.name + ", " + cat.type + ", " + cat.age);
        cat.makeSound();
        Dog dog = new Dog("낑깡", 7);
        System.out.println(dog.name + ", " + dog.type + ", " + dog.age);
        dog.makeSound();
    }
}
