package ro.ase.csie.cts.labs.lab07.factory.facade;

public class TestFacade {
    public static void main(String[] args) {
        //1. Create a game server instance and connect
        GameServer server = new GameServer();
        server.connect();

        //. Create a login
        Login login = new Login("player1", "1234");
        login.login();

        //3. Create and get the profile
        UserProfile userProfile = login.getUserProfile();

        String profile = userProfile.getProfile();

        //using facade
        String profile2 = UserAPIFacade.getUserProfile("player2", "1234567");
    }
}
