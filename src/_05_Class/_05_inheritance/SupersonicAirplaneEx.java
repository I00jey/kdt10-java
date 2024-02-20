package _05_Class._05_inheritance;

public class SupersonicAirplaneEx {
    public static void main(String[] args) {
        SupersonicAirplane myAirplane = new SupersonicAirplane();
        myAirplane.takeOff();
        myAirplane.fly();
        myAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
        myAirplane.fly();
        myAirplane.flyMode = SupersonicAirplane.NORMAL;
        myAirplane.fly();
        myAirplane.land();
    }
}
