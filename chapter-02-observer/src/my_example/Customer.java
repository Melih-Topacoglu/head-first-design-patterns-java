package my_example;

public class Customer implements Observer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String productName, int stock) {
        System.out.println("Hi " + customerName + " " + productName + " is back in stock! Available: " + stock);
    }

}
