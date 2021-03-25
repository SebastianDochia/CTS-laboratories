package ro.ase.csie.cts.labs.lab05.singletonregistry;

public class TestSingletonREgistry {
    public static void main(String[] args) {
        RESTBackend backend1 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
        RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.1", "profile");

        if(backend1 == backend2) {
            System.out.println("THE SAME");
        } else {
            System.out.println("NOT THE SAME");
        }

        RESTBackend backend3 = RESTBackend.getRESTBackend("127.0.0.1", "profile");

        if(backend1 == backend3) {
            System.out.println("THE SAME");
        } else {
            System.out.println("NOT THE SAME");
        }
    }
}
