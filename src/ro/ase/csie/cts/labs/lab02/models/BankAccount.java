package ro.ase.csie.cts.labs.lab02.models;

import ro.ase.csie.cts.labs.lab02.exceptions.IllegalTransferException;
import ro.ase.csie.cts.labs.lab02.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.labs.lab02.interfaces.Profitable;

public class BankAccount extends Account implements Profitable {
    protected String _iban;
    protected double _balance;


    public BankAccount(String iban, double balance) {
        _balance = balance;
        _iban = iban;
    }

    @Override
    public double getBalance() {
        return _balance;
    }

    @Override
    public void deposit(Double amount) {

    }

    @Override
    public void withdraw(Double amount) throws InsufficientFundsException {

    }

    @Override
    public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
        if(this == destination){
            throw  new IllegalTransferException();
        }
        this.withdraw(amount);
        destination.deposit(amount);
    }

    @Override
    public void addInterest(double interestPercentRate) {
        _balance *= (1 + interestPercentRate/100);
    }
}
