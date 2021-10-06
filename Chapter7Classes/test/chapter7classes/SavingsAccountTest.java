
package chapter7classes;

import org.junit.Test;
import static org.junit.Assert.*;


public class SavingsAccountTest {
    
    public SavingsAccountTest() {
    }

    @Test
    public void testSetOwner() {
        // AAA
        // Arrange - setup all the variables we need to test
        String expectedOwner = "Eric";
        
        // Act - call the code we are testing - and gets the actual value
        SavingsAccount account = new SavingsAccount(expectedOwner);
        String actualOwner = account.getOwner();
        
        // Assert - did we get what we expect
        assertEquals(expectedOwner, actualOwner);
        
    }

    @Test
    public void testDeposit_String() {
        // AAA
        // Arrange
        String deposit = "50";
        double expectedBalance = 50;
        SavingsAccount account = new SavingsAccount("");
        
        // Act
        account.deposit(deposit);
        double actualBalance = account.getBalance();
        
        // Assert - when comparing doubles, use a delta that says how close is close enough
        assertEquals(expectedBalance, actualBalance, .000001);
    }

    @Test
    public void testDeposit_double() {
        // AAA
        // Arrange
        double expectedBalance = 50;
        SavingsAccount account = new SavingsAccount("");
        
        // Act
        account.deposit(expectedBalance);
        double actualBalance = account.getBalance();
        
        // Assert - when comparing doubles, use a delta that says how close is close enough
        assertEquals(expectedBalance, actualBalance, .000001);
    }

    @Test
    public void testWithdrawReturnsTrue() {
        // AAA
        // Arrange
        double expectedBalance = 25;
        SavingsAccount account = new SavingsAccount("");
        account.deposit(50);
        
        // Act
        boolean result = account.withdraw(25);
        double actualBalance = account.getBalance();
        
        // Assert - when comparing doubles, use a delta that says how close is close enough
        assertEquals(expectedBalance, actualBalance, .000001);
        assertTrue(result);
    }
    
    @Test
    public void testWithdrawReturnsFalse() {
        // AAA
        // Arrange
        double expectedBalance = 50;
        SavingsAccount account = new SavingsAccount("");
        account.deposit(50);
        
        // Act
        boolean result = account.withdraw(250);
        double actualBalance = account.getBalance();
        
        // Assert - when comparing doubles, use a delta that says how close is close enough
        assertEquals(expectedBalance, actualBalance, .000001);
        assertFalse(result);
        
    }

    @Test
    public void testEarnInterest() {
        // AAA
        // Arrange
        double expectedBalance = 101;
        SavingsAccount account = new SavingsAccount("");
        account.deposit(100);
        
        // Act
        SavingsAccount.setInterestRate(.01);
        account.earnInterest();
        double actualBalance = account.getBalance();
        
        // Assert - when comparing doubles, use a delta that says how close is close enough
        assertEquals(expectedBalance, actualBalance, .000001);
    }

    
}
