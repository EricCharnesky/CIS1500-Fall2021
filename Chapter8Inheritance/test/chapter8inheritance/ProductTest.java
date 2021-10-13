
package chapter8inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EricC
 */
public class ProductTest {
    
    public ProductTest() {
    }

    @Test
    public void testConstructor(){
        // Arrange
        String expectedName = "Coffee";
        int expectedQuantity = 10;
        double expectedCost = .25;
        double expectedSalesPrice = 1.5;
        double expectedProfit = expectedSalesPrice - expectedCost;
        
        // Act
        Product product = new Product(expectedName, expectedQuantity, expectedCost, expectedSalesPrice);
        String actualName = product.getName();
        int actualQuanity = product.getQuantityOnHand();
        double actualCost = product.getCostToBuy();
        double actualSalesPrice = product.getSalesPrice();
        double actualProfit = product.getProfit();
        
        // Assert
        assertEquals(expectedName, actualName);
        assertEquals(expectedQuantity, actualQuanity);
        assertEquals(expectedCost, actualCost, .000001);
        assertEquals(expectedSalesPrice, actualSalesPrice, .000001);
        assertEquals(expectedProfit, actualProfit, .000001);
    }

    @Test
    public void testSetSalesPrice() {
        // Arrange
        double expectedSalesPrice = 1.5;
        Product product = new Product("", 0, 0, 0);
        
        // Act
        product.setSalesPrice(expectedSalesPrice);
        double actualSalesPrice = product.getSalesPrice();
        
        // Assert
        assertEquals(expectedSalesPrice, actualSalesPrice, .000001);
    }
    
    @Test
    public void testSetSalesPriceNegativeStays0() {
        // Arrange
        double expectedSalesPrice = 0;
        Product product = new Product("", 0, 0, 0);
        
        // Act
        product.setSalesPrice(-1);
        double actualSalesPrice = product.getSalesPrice();
        
        // Assert
        assertEquals(expectedSalesPrice, actualSalesPrice, .000001);
    }

    @Test
    public void testSetQuantityOnHand() {
        // Arrange
        int expectedQuantity = 10;
        Product product = new Product("", 0, 0, 0);
        
        // Act
        product.setQuantityOnHand(expectedQuantity);
        int actualQuanity = product.getQuantityOnHand();
        
        // Assert
        assertEquals(expectedQuantity, actualQuanity);

    }
    
    @Test
    public void testSetQuantityOnHandNegativeStays0() {
        // Arrange
        int expectedQuantity = 0;
        Product product = new Product("", 0, 0, 0);
        
        // Act
        product.setQuantityOnHand(-1);
        int actualQuanity = product.getQuantityOnHand();
        
        // Assert
        assertEquals(expectedQuantity, actualQuanity);

    }

    
    
}
