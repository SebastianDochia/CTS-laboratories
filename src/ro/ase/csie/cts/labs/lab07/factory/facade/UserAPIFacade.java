package ro.ase.csie.cts.labs.lab07.factory.facade;

public class UserAPIFacade {
    //the facade method
    public static String getUserProfile(String user, String pass) {
        //1. Create a game server instance and connect
        GameServer server = new GameServer();
        server.connect();

        //. Create a login
        Login login = new Login("player1", "1234");
        login.login();

        //3. Create and get the profile
        UserProfile userProfile = login.getUserProfile();

        String profile = userProfile.getProfile();

        return profile;
    }
}
