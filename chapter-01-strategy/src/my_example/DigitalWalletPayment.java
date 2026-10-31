package my_example;

public class DigitalWalletPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment with digital wallet successful");
    }
}
