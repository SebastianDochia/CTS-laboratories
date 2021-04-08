package ro.ase.csie.cts.labs.lab07.factory.method;

import ro.ase.csie.cts.labs.lab07.factory.simple.*;

public class KidsModeFactory extends AbstractWeaponFactory {
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String color) {
        AbstractWeapon weapon = null;
        switch (type) {
            case PISTOL:
                weapon = new WaterPistol(color, 100, 100);
                break;
            case MACHINE_GUN:
                weapon = new WaterBaloon(color, 200, 500);
                break;
            case BAZOOKA:
                weapon = new WaterBucket(color, 1000, 500);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return weapon;
    }
}
