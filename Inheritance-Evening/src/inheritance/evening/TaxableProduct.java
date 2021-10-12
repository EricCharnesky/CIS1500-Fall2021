package inheritance.evening;

public class TaxableProduct extends Product {

    private double taxRate;

    public TaxableProduct(String name, String size, double cost, double salesPrice, double taxRate) {
        super(salesPrice, name, size, cost); // go to the class I extend, and run the constructor
        setTaxRate(taxRate);
    }

    @Override
    public double getSalesPrice(){
        // salesPrice = we can set directly if it's declared as protected
        return super.getSalesPrice() * ( 1 + taxRate );
    }
    
    public double getTax(){
        return super.getSalesPrice() * taxRate;
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
