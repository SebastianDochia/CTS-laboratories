package dochia.sebastian.g1093.prototype;

public class Professor extends User {

    public Professor() {
        type = "Professor";
    }

    @Override
    void connect() {
        System.out.println("Professor connected");
    }

    @Override
    void disconnect() {
        System.out.println("Professor disconnected");
    }
}
