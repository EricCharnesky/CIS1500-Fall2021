package fileioexamples;

import java.util.Random;

public class TalkingStuffedAnimal {

    private String name;
    private String color;
    private String soundToMake;
    private boolean batteryHasPower;

    public TalkingStuffedAnimal(String name, String color, String soundToMake) {
        this.name = name;
        this.color = color;
        setSoundToMake(soundToMake);
        batteryHasPower = true;
    }

    public void setSoundToMake(String soundToMake) {
        if (soundToMake == null || soundToMake.equalsIgnoreCase("")) {
            throw new IllegalArgumentException("sound can not be empty");
        }
        this.soundToMake = soundToMake;
    }

    public String squeeze() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        if (number == 1) {
            batteryHasPower = false;
        }
        if (batteryHasPower) {
            return soundToMake;
        }
        return "";
    }

    public void changeBattery() {
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

    // there are better ways, but we won't worry about that for now
    public String getStringForFile() {
        return name + "~" + color + "~" + soundToMake + "~" + batteryHasPower;
    }

}
