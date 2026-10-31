package my_example;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment with bank transfer successful");
    }
}
