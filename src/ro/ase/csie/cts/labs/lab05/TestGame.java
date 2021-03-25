package ro.ase.csie.cts.labs.lab05;

public class TestGame {
    public static void main(String[] args) {
        //RESTBackend backend = new RESTBackend("acs.ase.ro/acs", "get some data");
        RESTBackend backend = RESTBackend.getRESTBackend();

        UIModule uiModule = new UIModule();
        PlayerModule playerModule = new PlayerModule();

    }
}
