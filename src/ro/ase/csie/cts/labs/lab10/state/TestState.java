package ro.ase.csie.cts.labs.lab10.state;

public class TestState {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman", 500);
        superman.move();

        superman.takeAHit(350);
        superman.move();

        superman.takeAHit(110);
        superman.move();
    }
}
