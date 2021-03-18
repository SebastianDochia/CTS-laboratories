package ro.ase.csie.cts.labs.lab03.stage03;

        import ro.ase.csie.cts.labs.lab03.TestProduct;
        import ro.ase.csie.cts.labs.lab03.exceptions.InvalidAccountAgeException;
        import ro.ase.csie.cts.labs.lab03.exceptions.InvalidPriceException;
        import ro.ase.csie.cts.labs.lab03.stage03.services.MarketingInterface;
        import ro.ase.csie.cts.labs.lab03.stage03.services.MkStrategyString2021;
        import ro.ase.csie.cts.labs.lab03.stage03.services.ValidatorInterface;
        import ro.ase.csie.cts.labs.lab03.stage03.services.ValidatorService;
        import ro.ase.csie.cts.labs.lab03.stage03.ProductType;

public class Product {

    //not like this
    //MarketingInterface mkService = new MkStrategyString2021();
    //ValidatorInterface validatorInterface = new ValidatorService();

    MarketingInterface mkService = null;
    ValidatorInterface validatorInterface = null;

    public Product(MarketingInterface mkService, ValidatorInterface validatorInterface) {
        if(mkService == null){
            throw new NullPointerException();
        }
        if(validatorInterface == null){
            throw  new NullPointerException();
        }
        this.mkService = mkService;
        this.validatorInterface = validatorInterface;
    }

    public Product() {
        for(Object service: TestProduct.services) {
            if(service instanceof MarketingInterface) {
                this.mkService = (MarketingInterface) service;
            }
        }
        if(this.mkService == null) {
            throw new UnsupportedOperationException();
        }
    }

    public void setMarketingStrategy(MarketingInterface mkService){
        if(mkService == null) {
            throw new NullPointerException();
        }
        this.mkService =mkService;
    }

    public static float getPriceWithDiscount(float initialPrice, float discountValue) {
        return initialPrice - (discountValue * initialPrice);
    }

    public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException {

        validatorInterface.validatePrice(initialPrice);
        validatorInterface.validateAccountAge(accountAgeInYears);

        float fidelityDiscount = (productType == ProductType.NEW) ? 0 : mkService.getFidelityDiscount(accountAgeInYears);

        float discountValue = productType.getDiscount();
        float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
        float finalPrice = priceWithDiscount*(1 - fidelityDiscount);

        return finalPrice;
    }
}