package ro.ase.csie.cts.labs.lab10.proxy;

public interface LoginInterface {
    public boolean login(String username, String pass);
    public boolean checkServerStatus();
}
