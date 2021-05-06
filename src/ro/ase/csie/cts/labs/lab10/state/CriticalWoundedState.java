package ro.ase.csie.cts.labs.lab10.state;

public class CriticalWoundedState implements MoveStateInterface{
    @Override
    public void move() {
        System.out.println("Can't move");
    }
}
