package ro.ase.csie.cts.labs.lab10.state;

public class SuperHero {

    public static final int CRITICAL_VALUE = 50;
    public static final int WOUNDED_VALUE = 200;

    String name;
    int HP;

    MoveStateInterface moveState = null;

    public SuperHero(String name, int HP) {
        this.name = name;
        this.HP = HP;
        this.moveState = new NormalState();
    }

    public void move() {
        if(this.moveState != null) {
            this.moveState.move();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void takeAHit(int points) {
        this.HP -= points;
        if (this.HP <= CRITICAL_VALUE) {
            this.moveState = new CriticalWoundedState();
        } else {
            if (this.HP <= WOUNDED_VALUE) {
                this.moveState = new WoundedState();
            }
        }
    }

}
