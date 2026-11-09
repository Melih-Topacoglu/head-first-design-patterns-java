package my_example;

public class ProductService {
    private final DataConnectionManager dataConnectionManager;

    public ProductService() {
        dataConnectionManager = DataConnectionManager.getInstance();
    }

    public void performProductOperation() {
        if (!dataConnectionManager.isConnected()) {
            dataConnectionManager.connect();
        }
        System.out.println("Product operation completed");
    }

    public DataConnectionManager getConnectionManager() {
        return dataConnectionManager;
    }
}
