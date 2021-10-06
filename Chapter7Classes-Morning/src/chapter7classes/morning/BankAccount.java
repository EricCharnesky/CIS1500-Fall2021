package chapter7classes.morning;

public class BankAccount {

    private double balance;
    private String owner;
    private String type;
    private int number;

    public BankAccount(String owner, String type, int number) {
        this.owner = owner;
        this.type = type;
        this.number = number;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public boolean withdraw(double amount){
        if (amount < 0 || amount > balance ) {
           return false;
        }
        balance -= amount;
        return true;
    }
}
