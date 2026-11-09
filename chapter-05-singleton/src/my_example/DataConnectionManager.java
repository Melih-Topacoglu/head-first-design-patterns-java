package my_example;

public class DataConnectionManager {

    private static volatile DataConnectionManager instance;
    private boolean connected;

    private DataConnectionManager() {
        connected = false;
    }

    public static DataConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DataConnectionManager.class) {
                if (instance == null) {
                    instance = new DataConnectionManager();
                }
            }
        }
        return instance;
    }

    public void connect() {
        connected = true;
    }

    public void disconnect() {
        connected = false;
    }

    public boolean isConnected() {
        return connected;
    }
}
