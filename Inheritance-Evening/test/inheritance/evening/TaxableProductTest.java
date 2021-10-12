/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.evening;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EricC
 */
public class TaxableProductTest {

    public TaxableProductTest() {
    }

    @Test
    public void testConstructor() {
        // Arrange
        String expectedName = "Book";
        String expectedSize = "Large";
        double expectedCost = 1.5;
        double salesPrice = 2.75;
        double expectedTaxRate = .06;
        double expectedSalesPriceWithTax = salesPrice * (1 + expectedTaxRate);
        double expectedTax = salesPrice * expectedTaxRate;

        // Act
        TaxableProduct product = new TaxableProduct(
                expectedName, expectedSize, expectedCost, salesPrice, expectedTaxRate);
        String actualName = product.getName();
        String actualSize = product.getSize();
        double actualCost = product.getCost();
        double actualSalesPrice = product.getSalesPrice();
        double actualTaxRate = product.getTaxRate();
        double actualTax = product.getTax();

        // Assert
        assertEquals(expectedName, actualName);
        assertEquals(expectedSize, actualSize);
        assertEquals(expectedCost, actualCost, .000001);
        assertEquals(expectedSalesPriceWithTax, actualSalesPrice, .000001);
        assertEquals(expectedTaxRate, actualTaxRate, .000001);
        assertEquals(expectedTax, actualTax, .000001);

    }

    @Test
    public void testSetTaxRate() {
        // Arrange

        double expectedTaxRate = .06;
        TaxableProduct product = new TaxableProduct(
                "", "", 0, 0, 0);

        // Act
        product.setTaxRate(expectedTaxRate);
        double actualTaxRate = product.getTaxRate();

        // Assert
        assertEquals(expectedTaxRate, actualTaxRate, .000001);

    }

}
