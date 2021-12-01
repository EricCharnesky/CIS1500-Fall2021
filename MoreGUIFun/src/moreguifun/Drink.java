package moreguifun;

public class Drink {

    public static final double SALES_TAX = .06;

    private String name;
    private double cost;
    private String milk;
    private double milkCost;
    private String sugar;

    public Drink(String name, double cost) {
        this.name = name;
        this.cost = cost;
        milk = null;
        milkCost = 0;
        sugar = null;

    }

    public String getReceipt() {
        String receipt = name + " $" + cost;
        if (milk != null) {
            receipt += "\n  with " + milk + " $" + milkCost;
        }
        if (sugar != null) {
            receipt += "\n  with " + sugar;
        }

        double salesTax = .06 * (cost + milkCost);
        receipt += String.format("\nSales Tax: $%.2f", salesTax);
        receipt += String.format("\nTotal: $%.2f", (salesTax + cost + milkCost));

        return receipt;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public double getMilkCost() {
        return milkCost;
    }

    public void setMilkCost(double milkCost) {
        this.milkCost = milkCost;
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

}
