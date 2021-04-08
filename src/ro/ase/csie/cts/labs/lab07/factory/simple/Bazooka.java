package ro.ase.csie.cts.labs.lab07.factory.simple;

public class Bazooka extends AbstractWeapon{
    public Bazooka(String color, int power, int distance) {
        super(color, power);
    }

    @Override
    public void pewPew() {
        System.out.println("------> (******)");
    }
}
