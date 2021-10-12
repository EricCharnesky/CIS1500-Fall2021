package inheritance.evening;

public class Product {

    protected double salesPrice; // gives direct access to subclasses
    private String name;
    private String size;
    private double cost;

    public Product(double salesPrice, String name, String size, double cost) {
        setSalesPrice(salesPrice);
        this.name = name;
        this.size = size;
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    
    public double getProfit(){
        double profit = salesPrice - cost;
        return profit;
    }

    public void setSalesPrice(double salesPrice) {
        if (salesPrice < 0) {
            this.salesPrice = 0;
        } else {
            this.salesPrice = salesPrice;
        }
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

}
