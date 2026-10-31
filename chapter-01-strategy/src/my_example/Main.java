package my_example;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentStrategy(new CreditCardPayment());
        paymentProcessor.performPayment();
        paymentProcessor.setPaymentStrategy(new BankTransferPayment());
        paymentProcessor.performPayment();
    }
}
