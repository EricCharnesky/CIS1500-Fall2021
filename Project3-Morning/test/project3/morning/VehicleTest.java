package project3.morning;

import org.junit.Test;
import static org.junit.Assert.*;

public class VehicleTest {

    public VehicleTest() {
    }

    @Test
    public void testConstructor() {
        // Arrange
        String expectedMake = "Chevy";
        String expectedModel = "Volt";
        String expectedColor = "Grey";
        double expectedGasTankCapacityInLiters = 10;
        double expectedGasInTankInLiters = 0;
        double expectedKilometersPerLiterAverage = 10;

        // Act
        Vehicle vehicle = new Vehicle(expectedMake, expectedModel, expectedColor,
                expectedGasTankCapacityInLiters, expectedKilometersPerLiterAverage);
        String actualMake = vehicle.getMake();
        String actualModel = vehicle.getModel();
        String actualColor = vehicle.getColor();
        double actualGasTankCapacityInLiters = vehicle.getGasTankCapacityInLiters();
        double actualGasInTankInLiters = vehicle.getGasCurrentlyInTankInLiters();
        double actualKilometersPerLiterAverage = vehicle.getKilometersPerLiterAverage();

        // Assert
        assertEquals(expectedMake, actualMake);
        assertEquals(expectedModel, actualModel);
        assertEquals(expectedColor, actualColor);
        assertEquals(expectedGasTankCapacityInLiters, actualGasTankCapacityInLiters, .00001);
        assertEquals(expectedGasInTankInLiters, actualGasInTankInLiters, .00001);
        assertEquals(expectedKilometersPerLiterAverage, actualKilometersPerLiterAverage, .00001);

    }

    @Test
    public void addGasReturnsTrue() {
        // Arrange

        double expectedGasTankCapacityInLiters = 10;
        double expectedGasInTankInLiters = 5;
        Vehicle vehicle = new Vehicle("", "", "",
                expectedGasTankCapacityInLiters, 5);

        // Act
        boolean result = vehicle.addGas(expectedGasInTankInLiters);
        double actualGasInTankInLiters = vehicle.getGasCurrentlyInTankInLiters();

        // Assert
        assertTrue(result);
        assertEquals(expectedGasInTankInLiters, actualGasInTankInLiters, .00001);

    }

    @Test
    public void addGasReturnsFalse() {
        // Arrange

        double expectedGasTankCapacityInLiters = 10;
        double expectedGasInTankInLiters = 10;
        Vehicle vehicle = new Vehicle("", "", "",
                expectedGasTankCapacityInLiters, 5);

        // Act
        boolean result = vehicle.addGas(expectedGasInTankInLiters * 2);
        double actualGasInTankInLiters = vehicle.getGasCurrentlyInTankInLiters();

        // Assert
        assertFalse(result);
        assertEquals(expectedGasInTankInLiters, actualGasInTankInLiters, .00001);

    }

    @Test
    public void driveReturnsTrue() {
        // Arrange

        double expectedGasTankCapacityInLiters = 10;
        double amountOfGasToAdd = 5;
        double kilometersToDrive = 5;
        double expectedKilometersPerLiterAverage = 5;
        double expectedGasInTankInLiters = amountOfGasToAdd
                - (kilometersToDrive / expectedKilometersPerLiterAverage);

        Vehicle vehicle = new Vehicle("", "", "",
                expectedGasTankCapacityInLiters, expectedKilometersPerLiterAverage);
        vehicle.addGas(amountOfGasToAdd);

        // Act
        boolean result = vehicle.drive(kilometersToDrive);
        double actualGasInTankInLiters = vehicle.getGasCurrentlyInTankInLiters();

        // Assert
        assertTrue(result);
        assertEquals(expectedGasInTankInLiters, actualGasInTankInLiters, .00001);

    }
    
    @Test
    public void driveReturnsFalse() {
        // Arrange

        double expectedGasTankCapacityInLiters = 10;
        double amountOfGasToAdd = 1;
        double kilometersToDrive = 10;
        double expectedKilometersPerLiterAverage = 5;
        double expectedGasInTankInLiters = 0;

        Vehicle vehicle = new Vehicle("", "", "",
                expectedGasTankCapacityInLiters, expectedKilometersPerLiterAverage);
        vehicle.addGas(amountOfGasToAdd);

        // Act
        boolean result = vehicle.drive(kilometersToDrive);
        double actualGasInTankInLiters = vehicle.getGasCurrentlyInTankInLiters();

        // Assert
        assertFalse(result);
        assertEquals(expectedGasInTankInLiters, actualGasInTankInLiters, .00001);

    }

}
