package ro.ase.csie.cts.labs.lab08.Adapter;

public class DonaldDuck implements DisneyActions{

    String name;
    int powerLevel;

    public DonaldDuck(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPowerLevel() {
        return this.powerLevel;
    }

    @Override
    public void losePower(int power) {
        System.out.printf("Losing %d power \n", power);
        this.powerLevel -= power;
    }

    @Override
    public void recoverPower(int power) {
        System.out.printf("Recovering %d power \n", power);
        this.powerLevel += power;
    }

    @Override
    public void changeLocation(int x, int y) {
        System.out.println("Moving to new coordinates \n");
    }
}
