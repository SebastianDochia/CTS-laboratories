package ro.ase.csie.cts.labs.lab12.memento;

public class SuperHero {
    String name;
    int lifePoints;
    private String magic;

    public SuperHero(String name, int lifePoints, String magic) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.magic = magic;
    }

    public void attack() {
        System.out.println("Is attacking");
    }

    public void heal() {
        System.out.println("Is healing");
    }

    public void move() {
        System.out.println("Is moving");
    }

    public HeroRestorePoint saveData() {
        return new HeroRestorePoint(name, lifePoints, magic);
    }

    public void restoreData(HeroRestorePoint memento) {
        this.name = memento.name;
        this.lifePoints = memento.lifePoints;
        this.magic = memento.getMagic();
    }

    public String getMagic() {
        return magic;
    }
}
