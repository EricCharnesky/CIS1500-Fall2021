
package project3;

import org.junit.Test;
import static org.junit.Assert.*;


public class PlaneTest {
    
    public PlaneTest() {
    }
    
    @Test
    public void testConstructor(){
        // Arrange
        String expectedMake = "Boeing";
        String expectedModel = "777";
        String expectedNumber = "NC777";
        int expectedMaxAltitudeInMeters = 10677;
        int expectedCurrentAltitude = 0;
        boolean expectedLandingGearStatus = true;
        
        // Act
        Plane plane = new Plane(expectedMake, expectedModel, expectedNumber, expectedMaxAltitudeInMeters);
        String actualMake = plane.getMake();
        String actualModel = plane.getModel();
        String actualNumber = plane.getNumber();
        int actualMaxAltitudeInMeters = plane.getMaxAltitudeInMeters();
        int actualCurrentAltitudeInMeters = plane.getCurrentAtltitudeInMeters();
        boolean actualLandingGearStatus = plane.isLandingGearEnabled();
        
        // Assert
        assertEquals(expectedMake, actualMake);
        assertEquals(expectedModel, actualModel);
        assertEquals(expectedNumber, actualNumber);
        assertEquals(expectedMaxAltitudeInMeters, actualMaxAltitudeInMeters);
        assertEquals(expectedCurrentAltitude, actualCurrentAltitudeInMeters);
        assertEquals(expectedLandingGearStatus, actualLandingGearStatus);
    }
    
    @Test
    public void testChangeAltitudeFailOver100MetersWithLandingGearOn(){
        // Arrange
        int expectedAltitude = 100;
        Plane plane = new Plane("","","", 10000);
        
        // Act
        boolean result = plane.changeAltitude(1000);
        int actualCurrentAltitude = plane.getCurrentAtltitudeInMeters();
        
        // Assert
        assertFalse(result);
        assertEquals(expectedAltitude, actualCurrentAltitude);
        
    }
    
    @Test
    public void testChangeAltitudeOver100MetersWithLandingGearOff(){
        // Arrange
        int expectedAltitude = 1000;
        Plane plane = new Plane("","","", 10000);
        
        // Act
        plane.changeAltitude(100);
        plane.changeLandingGear(false);
        boolean result = plane.changeAltitude(900);
        int actualCurrentAltitude = plane.getCurrentAtltitudeInMeters();
        
        // Assert
        assertTrue(result);
        assertEquals(expectedAltitude, actualCurrentAltitude);
        
    }
    
    @Test
    public void testChangeAltitudeOverMaxFails(){
        // Arrange
        int expectedAltitude = 1000;
        Plane plane = new Plane("","","", 1000);
        
        // Act
        plane.changeAltitude(100);
        plane.changeLandingGear(false);
        boolean result = plane.changeAltitude(2000);
        int actualCurrentAltitude = plane.getCurrentAtltitudeInMeters();
        
        // Assert
        assertFalse(result);
        assertEquals(expectedAltitude, actualCurrentAltitude);
        
    }
    
    @Test
    public void testChangeAltitudeBelow0Fails(){
        // Arrange
        int expectedAltitude = 0;
        Plane plane = new Plane("","","", 1000);
        
        // Act
        boolean result = plane.changeAltitude(-100);
        int actualCurrentAltitude = plane.getCurrentAtltitudeInMeters();
        
        // Assert
        assertFalse(result);
        assertEquals(expectedAltitude, actualCurrentAltitude);
        
    }
    
    @Test
    public void testChangeAltitudeBelow100WithoutLandingGearOnFails(){
        // Arrange
        int expectedAltitude = 100;
        Plane plane = new Plane("","","", 1000);
        
        // Act
        plane.changeAltitude(100);
        plane.changeLandingGear(false);
        plane.changeAltitude(100);
        boolean result = plane.changeAltitude(-200);
        int actualCurrentAltitude = plane.getCurrentAtltitudeInMeters();
        
        // Assert
        assertFalse(result);
        assertEquals(expectedAltitude, actualCurrentAltitude);
        
    }
    
    @Test
    public void testChangeAltitudeGoesDown(){
        // Arrange
        int expectedAltitude = 500;
        Plane plane = new Plane("","","", 10000);
        
        // Act
        plane.changeAltitude(100);
        plane.changeLandingGear(false);
        plane.changeAltitude(1000);
        boolean result = plane.changeAltitude(-600);
        int actualCurrentAltitude = plane.getCurrentAtltitudeInMeters();
        
        // Assert
        assertTrue(result);
        assertEquals(expectedAltitude, actualCurrentAltitude);
        
    }
    
    @Test
    public void testEnableLandingGearAbove100MetersDoesNothing(){
        // Arrange
        Plane plane = new Plane("","","", 10000);
        
        // Act
        plane.changeAltitude(100);
        plane.changeLandingGear(false);
        plane.changeAltitude(1000);
        plane.changeLandingGear(true);
        boolean landingGearStatus = plane.isLandingGearEnabled();
        
        // Assert
        assertFalse(landingGearStatus);
       
        
    }
    
    @Test
    public void testDisableLandingGearBelow100MetersDoesNothing(){
        // Arrange
        Plane plane = new Plane("","","", 10000);
        
        // Act
        plane.changeLandingGear(false);
        boolean landingGearStatus = plane.isLandingGearEnabled();
        
        // Assert
        assertTrue(landingGearStatus);
       
        
    }
    
    @Test
    public void testDisableLandingGearAt100MetersWorks(){
        // Arrange
        Plane plane = new Plane("","","", 10000);
        
        // Act
        plane.changeAltitude(100);
        plane.changeLandingGear(false);
        boolean landingGearStatus = plane.isLandingGearEnabled();
        
        // Assert
        assertFalse(landingGearStatus);
       
        
    }
    
}
