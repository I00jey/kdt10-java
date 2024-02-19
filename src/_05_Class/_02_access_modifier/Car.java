package _05_Class._02_access_modifier;

public class Car {
    private boolean stop;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            setStop(true);
        } else {
            this.speed = speed;
        }
    }
    
    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) setSpeed(0);
    }
}
