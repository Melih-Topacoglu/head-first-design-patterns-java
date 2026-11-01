package my_example;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("RTX 5070");
        Product product2 = new Product("Iphone 18");
        Customer cus1 = new Customer("Ali");
        Customer cus2 = new Customer("Zeynep");
        Customer cus3 = new Customer("Veli");
        product1.registerObserver(cus1);
        product1.registerObserver(cus3);
        product2.registerObserver(cus2);
        product2.registerObserver(cus3);
        product1.setStock(5);
        product1.removeStock(5);
        product1.setStock(3);

        product1.removeObserver(cus3);

        product1.removeStock(3);
        product1.setStock(10);

    }

}
