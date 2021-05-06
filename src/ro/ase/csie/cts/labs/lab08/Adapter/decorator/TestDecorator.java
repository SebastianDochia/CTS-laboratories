package ro.ase.csie.cts.labs.lab08.Adapter.decorator;

import ro.ase.csie.cts.labs.lab08.Adapter.ACMECharacter;
import ro.ase.csie.cts.labs.lab08.Adapter.FantasyCharacter;

public class TestDecorator {
    public static void main(String[] args) {

        //THIS IS BROKEN PLS FIX\\

        ACMECharacter dragon = new FantasyCharacter("Blue Eyes White Dragon", 1000);
        dragon.move();
        dragon.takeAHit(700);
        dragon.heal(100);

        //ACMECharacter dragonWithArmor = new ArmorDecorator(dragon, 200);
        //dragonWithArmor.takeAHit(300);

        dragon = new ArmorDecorator(dragon, 200);
        dragon.takeAHit(300);

        dragon = new WoundedDecorator(dragon);
        dragon.takeAHit(1000);
        dragon.move();

        ACMECharacter dragon2 = new FantasyCharacter("Green Dragon", 1000);
        dragon2.move();
        dragon2.takeAHit(200);
        dragon2.heal(100);
    }
}
