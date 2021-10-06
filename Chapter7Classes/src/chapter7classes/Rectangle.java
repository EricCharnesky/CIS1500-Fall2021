package chapter7classes;

public class Rectangle {

    private int length;
    private int width;
    private String color;
    
    // constructor method - name must match the class, no return type
    public Rectangle(){
        length = 0;
        width = 0;
        color = ""; // this avoid the string being null
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        int area = length * width;
        return area;
    }
}
