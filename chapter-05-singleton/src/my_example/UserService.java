package my_example;

public class UserService {

    private final DataConnectionManager dataConnectionManager;

    public UserService() {
        dataConnectionManager = DataConnectionManager.getInstance();
    }

    public void performUserOperation() {
        if (!dataConnectionManager.isConnected()) {
            dataConnectionManager.connect();
        }
        System.out.println("User operation completed");
    }

    public DataConnectionManager getConnectionManager() {
        return dataConnectionManager;
    }
}
