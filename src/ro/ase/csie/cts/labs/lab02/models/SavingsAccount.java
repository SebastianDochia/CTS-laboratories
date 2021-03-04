package ro.ase.csie.cts.labs.lab02.models;

import ro.ase.csie.cts.labs.lab02.exceptions.IllegalTransferException;
import ro.ase.csie.cts.labs.lab02.exceptions.InsufficientFundsException;

public class SavingsAccount extends BankAccount{

    public static final double MIN_BALANCE = 100;

    public SavingsAccount(String iban) {
        super(iban, MIN_BALANCE);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void deposit(Double amount) {
        _balance += amount;
    }

    @Override
    public void withdraw(Double amount) throws InsufficientFundsException {
        if(amount > _balance) {
            throw new InsufficientFundsException("You are poor boy!");
        }
        else {
            _balance -= amount;
        }
    }

    @Override
    public void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException {
        super.transfer(destination, amount);
    }
}
