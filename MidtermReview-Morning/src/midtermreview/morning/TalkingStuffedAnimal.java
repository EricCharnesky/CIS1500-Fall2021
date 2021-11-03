
package midtermreview.morning;

import java.util.Random;

public class TalkingStuffedAnimal {
    private String name;
    private String color;
    private String soundToMake;
    private boolean batteryHasPower;

    public TalkingStuffedAnimal(String name, String color, String soundToMake) {
        this.name = name;
        this.color = color;
        this.soundToMake = soundToMake;
        batteryHasPower = true;
    }
    
    public String squeeze(){
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        
        if ( number == 1){
            batteryHasPower = false;
        }
        
        if ( batteryHasPower ){
            return soundToMake;
        }
        return "";
    }
    
    public void changeBatter(){
        batteryHasPower = true;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isBatteryHasPower() {
        return batteryHasPower;
    }
    
    
    
    
}
