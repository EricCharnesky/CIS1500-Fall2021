
package midtermreview.morning;


public class Flower {
    private String name;
    private String color;
    private String smell;
    private int numberOfPetals;

    public Flower(String name, String color, String smell, int numberOfPetals) {
        this.name = name;
        this.color = color;
        this.smell = smell;
        this.numberOfPetals = numberOfPetals;
    }

    public void pickAPetal(){
        if ( numberOfPetals > 0 ){
            numberOfPetals--;
        }
    }
    
    
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSmell() {
        return smell;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }
    
    
    
    
}
