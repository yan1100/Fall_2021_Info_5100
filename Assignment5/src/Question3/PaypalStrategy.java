package Question3;

public class PaypalStrategy implements PaymentStrategy {
    private String email;

    public PaypalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int total) {
        System.out.println("Paypal : $" + total);
    }
}
