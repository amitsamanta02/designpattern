package adaptor;

public class LegacyPaymentProcessing {

    public void executePayment(double amount, String currency) {
        System.err.println("Legacy Payment Processing");
        System.out.println("Processing payment of $" + amount + " using legacy system.");
    }
    
}
