package project3.morning;

public class Vehicle {

    private String make;
    private String model;
    private String color;
    private double gasTankCapacityInLiters;
    private double gasCurrentlyInTankInLiters;
    private double kilometersPerLiterAverage;

    public Vehicle(String make, String model, String color, double gasTankCapacityInLiters, double kilometersPerLiterAverage) {
        if (make == null) {
            throw new IllegalArgumentException("make can not be null");
        }
        if (model == null) {
            throw new IllegalArgumentException("model can not be null");
        }

        if (gasTankCapacityInLiters <= 0) {
            throw new IllegalArgumentException("gas tank capacity must be greater than 0");
        }
        if (kilometersPerLiterAverage <= 0) {
            throw new IllegalArgumentException("kilometers per liter average must be greater than 0");
        }

        this.make = make;
        this.model = model;
        setColor(color);
        this.gasTankCapacityInLiters = gasTankCapacityInLiters;
        this.kilometersPerLiterAverage = kilometersPerLiterAverage;
        gasCurrentlyInTankInLiters = 0;
    }

    public boolean addGas(double gasInLitersToAdd) {
        gasCurrentlyInTankInLiters += gasInLitersToAdd;

        if (gasCurrentlyInTankInLiters > gasTankCapacityInLiters) {
            gasCurrentlyInTankInLiters = gasTankCapacityInLiters;
            throw new IllegalArgumentException("You added too much gas and spilled it");
        }

        return true;
    }

    public boolean drive(double kilometersToDrive) {
        double litersRequiredToDrive = kilometersToDrive / kilometersPerLiterAverage;

        gasCurrentlyInTankInLiters -= litersRequiredToDrive;

        if (gasCurrentlyInTankInLiters < 0) {
            gasCurrentlyInTankInLiters = 0;
            throw new IllegalArgumentException("You ran out of gas and didn't make it to your desitination");
        }

        return true;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("color can not be null");
        }
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
