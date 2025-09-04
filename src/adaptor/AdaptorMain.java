package adaptor;

public class AdaptorMain {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(100.0, "USD");
        LegacyPaymentProcessing legacyProcessor = new LegacyPaymentProcessing();

        // Using the adaptor , legacyProcessor is passed using composition and new Paymentprocessor.

        
        PaymentAdaptor adaptor = new PaymentAdaptor(legacyProcessor);  
        adaptor.processPayment(200.0, "EUR");   

    }
    
}
