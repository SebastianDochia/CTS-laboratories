package ro.ase.csie.cts.labs.lab07.factory.method;

import ro.ase.csie.cts.labs.lab07.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.labs.lab07.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {
    public abstract AbstractWeapon getWeapon(WeaponType type, String color);
}
