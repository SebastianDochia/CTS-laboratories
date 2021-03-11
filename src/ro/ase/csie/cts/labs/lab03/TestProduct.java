package ro.ase.csie.cts.labs.lab03;

import ro.ase.csie.cts.labs.lab03.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.labs.lab03.exceptions.InvalidPriceException;
import ro.ase.csie.cts.labs.lab03.stage01.Product;
import ro.ase.csie.cts.labs.lab03.stage01.ProductType;

public class TestProduct {
    public static void main(String[] args) throws InvalidPriceException, InvalidAccountAgeException {
        Product product = new Product();

        product.getFinalPrice(ProductType.NEW, 0, 0);
    }
}
