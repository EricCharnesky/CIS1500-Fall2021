
package chapter8inheritance;

public class Square extends Rectangle {
    
    public Square(int length){
        super(length, length); // superclass constructor
    }
    
    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }
    
    @Override
    public void setWidth(double width){
        super.setLength(width);
        super.setWidth(width);
    }
}
