package ro.ase.csie.cts.labs.lab05.sigletonstatic;

public class RESTBackend {
    String url;
    String data;

    public static final RESTBackend theBackend;

    static {
        System.out.println("Is executed when the class is loaded by the JVM");
        //get data from cfg
        theBackend = new RESTBackend();
        theBackend.url = "www.acs.ase.ro/cts";
    }

    {
        System.out.println("Is executed before any constructor call");
    }

    private RESTBackend() {

    }

//    private RESTBackend() {
//        //get data from cfg
//    }
}
