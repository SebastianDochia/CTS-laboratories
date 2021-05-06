package ro.ase.csie.cts.labs.lab10.state;

public class WoundedState implements MoveStateInterface{
    @Override
    public void move() {
        System.out.println("Moving slowly");
    }
}
