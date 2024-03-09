import Payment.Boleto;
import Payment.CreditCardPayment;
import Payment.PayPalPayment;
import Payment.PaymentInterface;

public class Main {
    public static void main(String[] args) {

        OnlineStore onlineStore = new OnlineStore();
        onlineStore.setValor(100);

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        Boleto boleto = new Boleto();

        onlineStore.checkout(creditCardPayment, 100);
        onlineStore.checkout(payPalPayment, 50);
        onlineStore.checkout(boleto, 20);

    }
}