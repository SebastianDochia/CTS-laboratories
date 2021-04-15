package ro.ase.csie.cts.labs.lab08.Adapter;

public abstract class ACMECharacter {
    protected String name;
    protected int lifePoints;

    public ACMECharacter(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public abstract void move();
    public abstract void takeAHit(int points);
    public abstract void heal(int points);
}
