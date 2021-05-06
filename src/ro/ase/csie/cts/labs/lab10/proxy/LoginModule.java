package ro.ase.csie.cts.labs.lab10.proxy;


public class LoginModule implements LoginInterface{

    String serverIP;
    String dbConnection;

    public LoginModule(String serverIP, String dbConnection) {
        super();
        this.serverIP = serverIP;
        this.dbConnection = dbConnection;
    }

    @Override
    public boolean login(String username, String pass) {
        System.out.println("connecting to db" + dbConnection);
        if(username.toLowerCase().equals("admin") && pass.equals("1234admin")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkServerStatus() {
        return true;
    }
}
