package ro.ase.csie.cts.labs.lab03.stage03.services;

import ro.ase.csie.cts.labs.lab03.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.labs.lab03.exceptions.InvalidPriceException;

public interface ValidatorInterface {
    public void validatePrice(float price) throws InvalidPriceException;
    public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
}
