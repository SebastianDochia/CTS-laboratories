package dochia.sebastian.g1093;

import dochia.sebastian.g1093.builder.UserProfile;
import dochia.sebastian.g1093.factory.User;
import dochia.sebastian.g1093.factory.UserFactory;
import dochia.sebastian.g1093.prototype.UsersCache;
import dochia.sebastian.g1093.singleton.ServerConnection;

public class TestAssignment {
    public static void main(String[] args) {
        // Testing singleton
        ServerConnection theConnection = ServerConnection.getInstance();

        System.out.println(theConnection.getURL());

        ServerConnection theSecondConnection = ServerConnection.getInstance();

        theSecondConnection.setURL("someotherurl");

        System.out.println(theConnection.getURL());
        System.out.println(theSecondConnection.getURL());

        // Testing factory
        UserFactory userFactory = new UserFactory();

        User user1 = userFactory.getUser("student");
        User user2 = userFactory.getUser("professor");

        user1.connect();
        user2.connect();

        // Builder
        UserProfile profile = new UserProfile.Builder(12345).addUserName("Dorian").addAttendancesCount(3).build();

        // Prototype
        UsersCache.loadCache();

        dochia.sebastian.g1093.prototype.User clonedUser = (dochia.sebastian.g1093.prototype.User) UsersCache.getUser("100");
        System.out.println(clonedUser.getType());

    }
}
