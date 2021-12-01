package guifun;

public class Drink {

    public static final double SALES_TAX = .06;

    private String name;
    private double cost;
    private String milk;

    public Drink(String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.milk = "";
    }

    public String getReceipt() {
        String receipt = name;
        receipt += " $" + cost;
        if (!milk.equals("")) {
            receipt += "\n  with " + milk;
        }

        double salesTax = cost * SALES_TAX;
        receipt += String.format("\nSales Tax: $%.2f", salesTax);
        receipt += String.format("\nTotal Cost: $%.2f", (cost + salesTax));

        return receipt;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void addCost(double cost) {
        this.cost += cost;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

}
