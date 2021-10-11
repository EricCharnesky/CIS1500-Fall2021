
package chapter7classes.morning;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @Test
    public void testConstructor(){
        // AAA
        
        // Arrange - setting up the variables I need to test with
        String owner = "Eric";
        String type = "Checking";
        double expectedBalance = 0;
        // int expectedNumber = ;
        
        // Act - calling the code we we're testing
        BankAccount account = new BankAccount(owner, type);
        String actualOwner = account.getOwner();
        String actualType = account.getType();
        double actualBalance = account.getBalance();
        //int actualNunber = account.getNumber();

        // Assert - did we get what we expected
        assertEquals(owner, actualOwner);
        assertEquals(type, actualType);
        // when checking doubles, you have to give a delta, how close is close enough
        assertEquals(expectedBalance, actualBalance, .00001);
        //assertEquals(expectedNumber, actualNunber);
        // this doesn't work well because we have no order guarantee with tests
    }

    @Test
    public void testSetOwner() {
        // Arrange
        String expectedOwner = "Eric";
        BankAccount account = new BankAccount("", "");
        
        // Act
        account.setOwner(expectedOwner);
        String actualOwner = account.getOwner();
        
        // Assert
        assertEquals(expectedOwner, actualOwner);
        
    }

    @Test
    public void testDeposit() {
        // Arrange
        double expectedBalance = 1000;
        BankAccount account = new BankAccount("", "");
        
        // Act
        account.deposit(expectedBalance);
        double actualBalance = account.getBalance();
        
        // Assert
        assertEquals(expectedBalance, actualBalance, .0001);
        
    }
    
    @Test
    public void testDepositNegative() {
        // Arrange
        double expectedBalance = 0;
        BankAccount account = new BankAccount("", "");
        
        // Act
        account.deposit(-1000);
        double actualBalance = account.getBalance();
        
        // Assert
        assertEquals(expectedBalance, actualBalance, .0001);
        
    }

    @Test
    public void testWithdraw() {
        // arrange
        double expectedBalance = 500;
        BankAccount account = new BankAccount("", "");
        account.deposit(1000);
        
        // act
        boolean result = account.withdraw(500);
        double actualBalance = account.getBalance();
        
        // Assert
        assertTrue(result);
        assertEquals(expectedBalance, actualBalance, .0001);
        
    }
    
    @Test
    public void testWithdrawTooMuch() {
        // arrange
        double expectedBalance = 1000;
        BankAccount account = new BankAccount("", "");
        account.deposit(1000);
        
        // act
        boolean result = account.withdraw(1500);
        double actualBalance = account.getBalance();
        
        // Assert
        assertFalse(result);
        assertEquals(expectedBalance, actualBalance, .0001);
        
    }
    
}
