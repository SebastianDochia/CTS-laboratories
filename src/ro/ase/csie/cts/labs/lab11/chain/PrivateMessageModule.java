package ro.ase.csie.cts.labs.lab11.chain;

public class PrivateMessageModule extends GenericMessageHandler {

    @Override
    public void processMessage(Message message) {

        if(!message.destination.toLowerCase().equals("@everyone")) {
            System.out.println("Private message for " + message.destination + " : " + message.text);
        } else {
            if (this.next != null) {
                this.next.processMessage(message);
            }
        }
    }
}
