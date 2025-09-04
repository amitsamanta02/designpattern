package adaptor;

public class PaymentProcessor {


    public void processPayment(double amount, String currency) {
        System.err.println("New Payment Processor");
        System.err.println("Processing payment in " + currency);
        // Payment processing logic goes here
        System.out.println("Processing payment of $" + amount);
    }


}