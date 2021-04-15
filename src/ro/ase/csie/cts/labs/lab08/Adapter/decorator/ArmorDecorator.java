package ro.ase.csie.cts.labs.lab08.Adapter.decorator;

import ro.ase.csie.cts.labs.lab08.Adapter.ACMECharacter;

public class ArmorDecorator extends  ACMEDecorator {

    int armorLevel;

    public ArmorDecorator(ACMECharacter hero, int armorLevel) {
        super(hero);
        this.armorLevel = armorLevel;
    }

    @Override
    public void takeAHit(int points) {
        int lostPoints = points - armorLevel;
        if(lostPoints < 0) {
            this.character.takeAHit(lostPoints);
        }
        super.takeAHit(points);
    }
}
