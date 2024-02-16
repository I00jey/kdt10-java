package _05_Class._02_access_modifier;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getHeight() {
        return height;
    }

    public int getArea() {
        return height * width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int cal(int width, int height) {
        return width * height;
    }

}
