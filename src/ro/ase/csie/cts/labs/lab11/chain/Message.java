package ro.ase.csie.cts.labs.lab11.chain;

public class Message {

    String text;
    String destination;
    int priority;

    public Message(String text, String destination, int priority) {
        this.text = text;
        this.destination = destination;
        this.priority = priority;
    }
}
