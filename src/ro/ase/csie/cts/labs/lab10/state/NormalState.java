package ro.ase.csie.cts.labs.lab10.state;

public class NormalState implements MoveStateInterface{
    @Override
    public void move() {
        System.out.println("The hero is running");
    }
}
