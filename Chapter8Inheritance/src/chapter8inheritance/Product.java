package chapter8inheritance;

public class Product {

    protected double salesPrice;
    private int quantityOnHand;
    private String name;
    private double costToBuy;

    public Product(String name, int quantityOnHand, double costToBuy, double salesPrice) {
        setSalesPrice(salesPrice);
        setQuantityOnHand(quantityOnHand);
        this.name = name;
        this.costToBuy = costToBuy;
    }
    
    public double getProfit(){
        return salesPrice - costToBuy;
    }

    public void setSalesPrice(double salesPrice) {
        if (salesPrice < 0) {
            this.salesPrice = 0;
        } else {
            this.salesPrice = salesPrice;
        }
    }

    public void setQuantityOnHand(int quantityOnHand) {
        if (quantityOnHand < 0) {
            this.quantityOnHand = 0;
        } else {
            this.quantityOnHand = quantityOnHand;
        }
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public String getName() {
        return name;
    }

    public double getCostToBuy() {
        return costToBuy;
    }

}
