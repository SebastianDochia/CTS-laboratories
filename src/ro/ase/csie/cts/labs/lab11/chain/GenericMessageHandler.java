package ro.ase.csie.cts.labs.lab11.chain;

public abstract class GenericMessageHandler {

    GenericMessageHandler next = null;

    public abstract void processMessage(Message message);

    public void setNext(GenericMessageHandler next) {
        this.next = next;
    }
}
