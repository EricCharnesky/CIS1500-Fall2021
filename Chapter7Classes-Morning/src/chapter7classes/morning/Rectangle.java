
package chapter7classes.morning;

public class Rectangle {
    private int length;
    private int width;
    private String color;
    
    // constructor method - it's job is to construct the class in memory
    // give all the attributes values
    public Rectangle(){
        length = 0;
        width = 0;
        color = "";
    }
    
    public void setLength(int length){
        if ( length > 0 ){
            this.length = length;
        } else{
            this.length = 0;
        }
    }
    
    public void setWidth(int width){
        if ( width > 0 ){
            this.width = width;
        } else{
            this.width = 0;
        }
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getArea(){
        int area = length * width;
        return area;
    }
    
    public int getPerimeter(){
        int perimeter = length * 2 + width * 2;
        return perimeter;
    }
}
