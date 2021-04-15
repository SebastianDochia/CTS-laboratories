package ro.ase.csie.cts.labs.lab07.factory.simple;

public abstract class AbstractWeapon {
    String color;
    int power;
    int distance;

    public AbstractWeapon(String color, int power) {
    }

    public abstract void pewPew();

    public AbstractWeapon(String color, int power, int distance) {
        this.color = color;
        this.power = power;
        this.distance = distance;
    }
}
