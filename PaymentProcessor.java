public class PaymentProcessor {

    public double processPayment(double amount, int quantity) {

        // BUG: division by zero
        double total = amount / 0;

        return total;
    }

    public static void main(String[] args) {

        PaymentProcessor payment = new PaymentProcessor();

        double result = payment.processPayment(5000, 2);

        System.out.println("Total Payment: " + result);
    }
}