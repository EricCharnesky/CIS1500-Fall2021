
package project3;

public class Plane {
    private String make;
    private String model;
    private String number;
    private int maxAltitudeInMeters;
    private int currentAtltitudeInMeters;
    private boolean landingGearEnabled;

    public Plane(String make, String model, String number, int maxAltitudeInMeters) {
        this.make = make;
        this.model = model;
        this.number = number;
        this.maxAltitudeInMeters = maxAltitudeInMeters;
        currentAtltitudeInMeters = 0;
        landingGearEnabled = true;
        
    }
    
    public boolean changeAltitude(int metersToChange){
        if ( metersToChange > 0 ){
            int newAltitude = currentAtltitudeInMeters + metersToChange;
            if ( newAltitude > 100 && landingGearEnabled ){
                currentAtltitudeInMeters = 100;
                return false;
            } else if ( newAltitude > maxAltitudeInMeters ){
                currentAtltitudeInMeters = maxAltitudeInMeters;
                return false;
            } else{
                currentAtltitudeInMeters = newAltitude;
                return true;
            }
        } else {
            int newAltitude = currentAtltitudeInMeters + metersToChange;
            if ( newAltitude < 100 && !landingGearEnabled){
                currentAtltitudeInMeters = 100;
                return false;
            } else if ( newAltitude < 0 ){
                currentAtltitudeInMeters = 0;
                return false;
            } else {
                currentAtltitudeInMeters = newAltitude;
                return true;
            }
        }
    }
    
    public void changeLandingGear(boolean status){
        if ( status && currentAtltitudeInMeters <= 100 ){
            landingGearEnabled = true;
        }
        else if ( !status && currentAtltitudeInMeters >= 100 ){
            landingGearEnabled = false;
        }
    }
    

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getMaxAltitudeInMeters() {
        return maxAltitudeInMeters;
    }

    public int getCurrentAtltitudeInMeters() {
        return currentAtltitudeInMeters;
    }

    public boolean isLandingGearEnabled() {
        return landingGearEnabled;
    }
    
    
}
