package ro.ase.csie.cts.labs.lab03;

import ro.ase.csie.cts.labs.lab03.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.labs.lab03.exceptions.InvalidPriceException;
import ro.ase.csie.cts.labs.lab03.stage03.Product;
import ro.ase.csie.cts.labs.lab03.stage03.ProductType;
import ro.ase.csie.cts.labs.lab03.stage03.services.MkStrategyString2021;
import ro.ase.csie.cts.labs.lab03.stage03.services.ValidatorInterface;
import ro.ase.csie.cts.labs.lab03.stage03.services.ValidatorService;

import java.util.ArrayList;

public class TestProduct {

    public static ArrayList<Object> services = new ArrayList<>();

    public static void startup() {
        services.add(new MkStrategyString2021());
        services.add(new ValidatorService());
    }

    public static void main(String[] args) throws InvalidPriceException, InvalidAccountAgeException {
        Product product = new Product(new MkStrategyString2021(), new ValidatorInterface() {
            @Override
            public void validatePrice(float price) throws InvalidPriceException {

            }

            @Override
            public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {

            }
        });

        float finalPrice = 0;
        try{
            finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
        } catch (InvalidPriceException | InvalidAccountAgeException e) {
            e.printStackTrace();
        }


        System.out.println(finalPrice);
    }
}
