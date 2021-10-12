
package inheritance.evening;

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
        String expectedName = "Book";
        String expectedSize = "Large";
        double expectedCost = 1.5;
        double expectedSalesPrice = 2.75;
        
        // Act
        Product product = new Product(expectedSalesPrice, expectedName, expectedSize, expectedCost);
        String actualName = product.getName();
        String actualSize = product.getSize();
        double actualCost = product.getCost();
        double actualSalesPrice = product.getSalesPrice();
        
        // Assert
        assertEquals(expectedName, actualName);
        assertEquals(expectedSize, actualSize);
        assertEquals(expectedCost, actualCost, .000001);
        assertEquals(expectedSalesPrice, actualSalesPrice, .000001);
    }

    @Test
    public void testSetSalesPrice() {
        // Arrange
        double expectedSalesPrice = 1.25;
        Product product = new Product(0, "", "", 0);
        
        // Act
        product.setSalesPrice(expectedSalesPrice);
        double actualSalesPrice = product.getSalesPrice();
        
        // Assert
        assertEquals(expectedSalesPrice, actualSalesPrice, .000001);
    }

   
    
}
