package ro.ase.csie.cts.labs.lab10.proxy;

public class LoginWith2FactorAuth implements LoginInterface{

    LoginInterface loginModule = null;

    public LoginWith2FactorAuth(LoginInterface loginModule) {
        this.loginModule = loginModule;
    }

    public boolean checkGeneratedCode(int code) {
        if(code == 12345) {
            return true;
        } else
            return false;
    }

    @Override
    public boolean login(String username, String pass) {
        if (this.loginModule.login(username, pass)) {
            System.out.println("please input the generated code");
            System.out.println("Check code");

            if(checkGeneratedCode(12345)) {
                System.out.println("Hello" + username);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean checkServerStatus() {
        return false;
    }
}
