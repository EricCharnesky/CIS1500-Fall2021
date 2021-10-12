
package inheritance.evening;

public class TransparentColor extends Color {
    private int alpha;

    public TransparentColor() {
        super(0,0,0);
        alpha = 0;
    }
    
    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    
    
}
