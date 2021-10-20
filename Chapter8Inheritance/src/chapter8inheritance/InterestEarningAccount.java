package chapter8inheritance;

public class InterestEarningAccount extends BankAccount {

    private double interestRate;

    public InterestEarningAccount(String owner, String type, double interestRate) {
        super(owner, type);
        setInterestRate(interestRate);
    }
    
    public void earnMonthlyInterest(){
        double interestEarned = interestRate / 12 * getBalance();
        deposit(interestEarned);
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            this.interestRate = 0;
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

}
