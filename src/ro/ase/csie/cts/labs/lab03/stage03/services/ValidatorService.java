package ro.ase.csie.cts.labs.lab03.stage03.services;

import ro.ase.csie.cts.labs.lab03.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.labs.lab03.exceptions.InvalidPriceException;

public class ValidatorService implements ValidatorInterface {

    @Override
    public void validatePrice(float price) throws InvalidPriceException {
        if(price <= 0) {
            throw new InvalidPriceException();
        }
    }

    @Override
    public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {
        if(accountAgeInYears < 0) {
            throw  new InvalidAccountAgeException();
        }
    }
}
