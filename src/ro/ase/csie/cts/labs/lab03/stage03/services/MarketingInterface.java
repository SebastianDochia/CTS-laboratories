package ro.ase.csie.cts.labs.lab03.stage03.services;

public interface MarketingInterface {
    public final static int MAX_ACCOUNT_AGE = 10;
    public final static float MAX_FIDELITY_DISCOUNT = 0.15f;

    public float getFidelityDiscount(int accountAgeInYears);
}
