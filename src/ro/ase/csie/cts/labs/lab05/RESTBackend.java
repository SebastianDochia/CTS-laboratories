package ro.ase.csie.cts.labs.lab05;

public class RESTBackend {
    String url;
    String data;

    private static RESTBackend theBackend = null;

    //eager-instantiation
    //private static  RESTBackend restBackend = new RESTBackend();

    private RESTBackend(String url, String data) {
        System.out.println("Opening a connection to the backend service");
        this.url = url;
        this.data = data;
    }

    public void sendGET() {
        System.out.println("Send GET command to " + this.url);
    }

    //lazy-instantiation
    public static synchronized RESTBackend getRESTBackend() {
        if(theBackend == null) {
            //get the backend from a config file
            String url = "www.acs.ase.ro/game";
            String data = "get backend connection";
            theBackend = new RESTBackend(url, data);
        }

        return theBackend;
    }
}
