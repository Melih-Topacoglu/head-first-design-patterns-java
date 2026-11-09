package my_example;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProductService productService = new ProductService();

        System.out.println(
                userService.getConnectionManager() == productService.getConnectionManager());
    }
}
