package ro.ase.csie.cts.labs.lab03.stage02;

public enum ProductType {
    NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);

    private final float discount;

    private ProductType(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return this.discount;
    }

}
