abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

interface Refundable {
    void processRefund();
}

class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Verifying credit card details...");
        System.out.println("Charging the credit card...");
        System.out.println("Credit card payment successful!");
    }
}

class PayPalPayment extends Payment implements Refundable {

    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Verifying PayPal account...");
        System.out.println("Transferring funds through PayPal...");
        System.out.println("PayPal payment successful!");
    }

    @Override
    public void processRefund() {
        System.out.println("Processing PayPal refund for $" + amount);
        System.out.println("Returning funds to customer's PayPal account...");
        System.out.println("Refund completed successfully!");
    }
}

public class PaymentSystemDemo {
    public static void main(String[] args) {
        Payment creditPayment = new CreditCardPayment(150.0);
        creditPayment.processPayment();

        System.out.println();

        PayPalPayment paypalPayment = new PayPalPayment(200.0);
        paypalPayment.processPayment();
        paypalPayment.processRefund();
    }
}
