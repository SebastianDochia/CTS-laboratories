package ro.ase.csie.cts.labs.lab03.stage03.services;

public class MkStrategyString2021 implements MarketingInterface{
    @Override
    public float getFidelityDiscount(int accountAgeInYears) {
        return (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float) accountAgeInYears / 100;
    }
}
