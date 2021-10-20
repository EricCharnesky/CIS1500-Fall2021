package chapter8inheritance;

public class Rectangle {

    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {
        this(0, 0); // calls the other constructor
    }
    
    public double getArea(){
        double area = length * width;
        return area;
    }
    
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
