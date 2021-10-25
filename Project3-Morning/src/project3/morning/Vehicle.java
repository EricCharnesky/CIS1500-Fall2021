
package project3.morning;

public class Vehicle {
    private String make;
    private String model;
    private String color;
    private double gasTankCapacityInLiters;
    private double gasCurrentlyInTankInLiters;
    private double kilometersPerLiterAverage;

    public Vehicle(String make, String model, String color, double gasTankCapacityInLiters, double kilometersPerLiterAverage) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.gasTankCapacityInLiters = gasTankCapacityInLiters;
        this.kilometersPerLiterAverage = kilometersPerLiterAverage;
        gasCurrentlyInTankInLiters = 0;
    }

    public boolean addGas(double gasInLitersToAdd){
        gasCurrentlyInTankInLiters += gasInLitersToAdd;
        
        if ( gasCurrentlyInTankInLiters > gasTankCapacityInLiters){
            gasCurrentlyInTankInLiters = gasTankCapacityInLiters;
            return false;
        }
        
        return true;
    }
    
    public boolean drive(double kilometersToDrive){
        double litersRequiredToDrive = kilometersToDrive / kilometersPerLiterAverage;
        
        gasCurrentlyInTankInLiters -= litersRequiredToDrive;
        
        if ( gasCurrentlyInTankInLiters < 0 ){
            gasCurrentlyInTankInLiters = 0;
            return false;
        }
        
        return true;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getGasTankCapacityInLiters() {
        return gasTankCapacityInLiters;
    }

    public double getGasCurrentlyInTankInLiters() {
        return gasCurrentlyInTankInLiters;
    }

    public double getKilometersPerLiterAverage() {
        return kilometersPerLiterAverage;
    }
    
    
}
