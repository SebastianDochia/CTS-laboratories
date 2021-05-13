package ro.ase.csie.cts.labs.lab11.chain;

public class TestChain {
    public static void main(String[] args) {
        GenericMessageHandler filterModule = new FilterModule("English");
        GenericMessageHandler privateModule = new PrivateMessageModule();
        GenericMessageHandler groupModule = new GroupMessageModule();

        filterModule.setNext(privateModule);
        privateModule.setNext(groupModule);

        GenericMessageHandler chatServer = filterModule;

        chatServer.processMessage(new Message("Hello John", "@John", 1));
        chatServer.processMessage(new Message("I hate you", "@John", 1));
        chatServer.processMessage(new Message("Let's join the revolution", "@everyone", 1));
    }
}
