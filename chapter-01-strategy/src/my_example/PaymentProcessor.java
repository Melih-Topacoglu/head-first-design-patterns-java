package my_example;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;

    public PaymentProcessor() {
    }

    public void performPayment() {
        paymentStrategy.processPayment();
    }

    public void setPaymentStrategy(PaymentStrategy ps) {
        paymentStrategy = ps;
    }
}
