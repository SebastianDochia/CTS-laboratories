package ro.ase.csie.cts.labs.lab04;

public class UIModule {
    public UIModule() {
        //RESTBackend backend = new RESTBackend("acs.ase.ro/acs", "get some data");
        RESTBackend backend = RESTBackend.getRESTBackend();
    }
}
