package ro.ase.csie.cts.labs.lab07.factory.method;

import ro.ase.csie.cts.labs.lab07.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.labs.lab07.factory.simple.Pistol;
import ro.ase.csie.cts.labs.lab07.factory.simple.WeaponType;

public class TestFactoryMethod {
    public static void main(String[] args) {
        boolean isWaterModeSet = true;
        if(isWaterModeSet) {
            //code game with water
            AbstractWeapon waterPistol= new WaterPistol("Grey", 200, 100);
        } else  {
            AbstractWeapon pistol = new Pistol("Grey", 200);
        }

        AbstractWeaponFactory theFactory = null;
        theFactory = (isWaterModeSet) ? new KidsModeFactory() : new RealModeFactory();

        //generic game coding
        AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");
    }
}
