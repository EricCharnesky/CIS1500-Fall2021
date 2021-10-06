
package chapter7classes;

public class Phone {
    private String make;
    private String model;
    private int numberOfCameras;
    private double weight;
    private double screenHeight;
    private double screenWidth;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfCameras() {
        return numberOfCameras;
    }

    public double getWeight() {
        return weight;
    }

    public double getScreenHeight() {
        return screenHeight;
    }

    public double getScreenWidth() {
        return screenWidth;
    }

    public Phone(String make, String model, int numberOfCameras, double weight, double screenHeight, double screenWidth) {
        this.make = make;
        this.model = model;
        this.numberOfCameras = numberOfCameras;
        this.weight = weight;
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
    }
    
    public String takePicture(){
        return "You took a picture";
    }
    
    public String takePicture(String mode){
        if ( mode.equalsIgnoreCase("pro")){
            return "You took a pro picture";
        }
        else {
            return takePicture();
        }
    }
    
}
