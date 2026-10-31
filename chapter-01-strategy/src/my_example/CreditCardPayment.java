package my_example;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment with credit card successful");
    }
}
