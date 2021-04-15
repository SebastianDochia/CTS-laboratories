package ro.ase.csie.cts.labs.lab08.Adapter.decorator;

import ro.ase.csie.cts.labs.lab08.Adapter.ACMECharacter;

public class WoundedDecorator extends ACMEDecorator {

    public final static int MIN_POINTS = 200;

    public WoundedDecorator(ACMECharacter hero) {
        super(hero);
    }

    @Override
    public void move() {
        if(this.character.getLifePoints() < MIN_POINTS) {
            System.out.println("You can't move, teapa.");
        } else {
            this.character.move();
        }
    }
}
