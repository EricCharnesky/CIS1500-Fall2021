package chapter7classes;

public class SavingsAccount {

    // exist only 1 time, defined once for the entire class and ALL instances share it
    private static double interestRate = .02;

    // please don't give instance attributes values when you delcare them
    //private String owner = "";
    //private double balance = 0;
    //private double interestRate = 0;
    private String owner;
    private double balance;

    // when you write a constructor, it removes the default one
    public SavingsAccount(String owner) {
        setOwner(owner);
        balance = 0;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    // method overloading - methods with the same name, different parameters
    public void deposit(String amount){
        double value = Double.parseDouble(amount);
        deposit(value);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance || amount < 0) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void earnInterest() {
        balance += balance * interestRate;
    }

    // with static methods, there is no THIS current instance
    public static void setInterestRate(double interestRate) {
        if (interestRate < 0 || interestRate >= 1) {
            // there is no test currently that makes sure this works
            SavingsAccount.interestRate = .02;
        } else {
            SavingsAccount.interestRate = interestRate;
        }
    }

    public static double getInterestRate() {
        return interestRate;
    }
}
