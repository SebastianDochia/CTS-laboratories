package dochia.sebastian.g1093.singleton;

public class ServerConnection {
    private static ServerConnection singleInstance = null;

    public String URL;

    private ServerConnection() {
        this.URL = "someurl";
    }

    public static synchronized ServerConnection getInstance() {
        if (singleInstance == null) {
            singleInstance = new ServerConnection();
        }

        return singleInstance;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
