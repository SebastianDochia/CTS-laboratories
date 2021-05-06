package dochia.sebastian.g1093.factory;

public class UserFactory {

    public User getUser(String userRole) {
        if (userRole == null) {
            return null;
        }

        if (userRole.equalsIgnoreCase("student")) {
            return new Student();
        }

        if (userRole.equalsIgnoreCase("professor")) {
            return new Professor();
        }

        return null;
    }
}
