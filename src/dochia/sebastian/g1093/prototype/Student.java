package dochia.sebastian.g1093.prototype;

public class Student extends User {

    public Student() {
        type = "Student";
    }

    @Override
    void connect() {
        System.out.println("Student connected");
    }

    @Override
    void disconnect() {
        System.out.println("Student disconnected");
    }
}
