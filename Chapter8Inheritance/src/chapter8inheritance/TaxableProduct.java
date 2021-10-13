package chapter8inheritance;

public class TaxableProduct extends Product {

    private double taxRate;

    public TaxableProduct(String name, int quantity, double cost, double purchasePrice, double taxRate) {
        super(name, quantity, cost, purchasePrice); // calls the Product constructor
        setTaxRate(taxRate);
    }
    
    @Override
    public double getSalesPrice(){
        return super.getSalesPrice() + super.getSalesPrice() * taxRate;
        
        //return salesPrice + salesPrice * taxRate;
    }

    public void setTaxRate(double taxRate) {
        if (taxRate < 0) {
            this.taxRate = 0;
        } else {
            this.taxRate = taxRate;
        }
    }

    public double getTaxRate() {
        return taxRate;
    }

}
