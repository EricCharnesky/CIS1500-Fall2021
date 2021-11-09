
package fileioexamples;

import java.util.ArrayList;


public class ClawMachine {
    private ArrayList<TalkingStuffedAnimal> animals;
    
    public ClawMachine(){
        animals = new ArrayList<>();
    }
    
    public void addStuffedAnimal(TalkingStuffedAnimal animal){
        if ( animal == null ){
            throw new IllegalArgumentException("Animal can not be null");
        }
        
        animals.add(animal);
       
    }
}
