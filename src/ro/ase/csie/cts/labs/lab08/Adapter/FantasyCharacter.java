package ro.ase.csie.cts.labs.lab08.Adapter;

public class FantasyCharacter extends ACMECharacter{

    public FantasyCharacter(String name, int lifePoints) {
        super(name, lifePoints);
    }

    @Override
    public void move() {
        System.out.printf("%s is moving \n", name);
    }

    @Override
    public void takeAHit(int points) {
        System.out.printf("%s takes a hit of %d points \n", name, points);
    }

    @Override
    public void heal(int points) {
        System.out.printf("%s heals %d points  \n", name, points);
    }
}
