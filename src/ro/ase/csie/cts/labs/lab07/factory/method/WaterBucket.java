package ro.ase.csie.cts.labs.lab07.factory.method;

import ro.ase.csie.cts.labs.lab07.factory.simple.AbstractWeapon;

public class WaterBucket extends AbstractWeapon {

    public WaterBucket(String color, int power, int distance) {
        super(color, power, distance);
    }

    @Override
    public void pewPew() {

    }
}
