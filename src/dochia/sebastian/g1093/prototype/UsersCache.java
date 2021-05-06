package dochia.sebastian.g1093.prototype;

import java.util.Hashtable;

public class UsersCache {

    private static Hashtable<String, User> userMap = new Hashtable<String, User>();

    public static User getUser(String UserId) {
        User cachedUser = userMap.get(UserId);
        return (User) cachedUser.clone();
    }

    public static void loadCache() {
        // Load data from a DB
        Student student1 = new Student();
        student1.setId("100");
        userMap.put(student1.getId(), student1);

        Professor professor1 = new Professor();
        professor1.setId("200");
        userMap.put(professor1.getId(), professor1);
    }
}
