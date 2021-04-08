package ro.ase.csie.cts.labs.lab07.factory.facade;

public class Login {
    String username;
    String pass;

    public Login(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public void login() {

    }

    public UserProfile getUserProfile() {
        return new UserProfile();
    }
}
