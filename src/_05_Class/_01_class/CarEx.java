package _05_Class._01_class;


public class CarEx {
    public static void main(String[] args) {
        // 클래스 변수 = new 클래스();
        Car mycar0 = new Car();
        Car mycar2 = new Car("소나타", 80);
        Car mycar = new Car("그랜저", 100, true);


        System.out.println(mycar0);
        System.out.println(mycar2);
        System.out.println(mycar.model);
        System.out.println(mycar.start);
        System.out.println(mycar.tire.product);

        System.out.println(mycar.speed); // 100
        mycar.speed = 300;

        System.out.println(mycar.speed); // 300
    }
}
