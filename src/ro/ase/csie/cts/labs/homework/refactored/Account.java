package ro.ase.csie.cts.labs.homework.refactored;


import ro.ase.csie.cts.labs.homework.refactored.exceptions.InvalidValueException;
import ro.ase.csie.cts.labs.homework.refactored.interfaces.Configurable;
import ro.ase.csie.cts.labs.homework.refactored.interfaces.MonthlyRateInterface;

public class Account implements Configurable, MonthlyRateInterface {
    private double loanValue;
    private final double rate;
    private int daysActive = 0;

    private final AccountType accountType;

    public Account(double value, double rate, AccountType accountType) throws InvalidValueException {
        if(value < 0) {
            throw new InvalidValueException();
        }

        this.loanValue = value;
        this.rate = rate;
        this.accountType = accountType;
    }

    public void printIdentity() {
        System.out.println("This is an account");
    }

    public static double computeTotalFee(Account[] accounts) {
        double totalFee=0.0;

        for (Account accountToCompute : accounts) {
            if (accountToCompute.isPremiumOrSuperPremium()){
                totalFee += computeFee(accountToCompute);
            }
        }

        return totalFee;
    }

    private boolean isPremiumOrSuperPremium() {
        return this.accountType == AccountType.PREMIUM || this.accountType == AccountType.SUPER_PREMIUM;
    }

    private static double computeFee(Account account) {
        return brokerFee * (account.loanValue * Math.pow(account.rate, ((double)account.daysActive / timePeriod)) - account.loanValue);
    }

    public double getLoan() {
        return this.loanValue;
    }

    public double getRate() {
        return this.rate;
    }

    public void setLoanValue(double value) throws InvalidValueException {
        if(value < 0) {
            throw new InvalidValueException();
        }

        this.loanValue = value;
    }

    public void increaseDaysActive() {
        this.daysActive++;
    }

    public String toString() {
        return "Loan: " + this.loanValue + "; rate: " + this.rate + "; days active:" + this.daysActive + "; Type: " + this.accountType + ";";
    }

    @Override
    public double getMonthlyRate() {
        return this.loanValue * this.rate;
    }
}
