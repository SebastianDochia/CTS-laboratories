package ro.ase.csie.cts.labs.lab02.models;

import ro.ase.csie.cts.labs.lab02.exceptions.IllegalTransferException;
import ro.ase.csie.cts.labs.lab02.exceptions.InsufficientFundsException;

public abstract class Account {
    public abstract double getBalance();
    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount) throws InsufficientFundsException;
    public abstract void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException;
}
