package adaptor;

// Legacy payment processing class (existing system)
class PaymentAdaptor extends LegacyPaymentProcessing {
   
    private LegacyPaymentProcessing paymentProcessor;

    public PaymentAdaptor(LegacyPaymentProcessing paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(double amount, String currency) {
        // Adapting the legacy method to the new method
        super.executePayment(amount, currency);
        paymentProcessor.executePayment(amount, currency);
    }
    
}