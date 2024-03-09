package Payment;

public class PayPalPayment implements PaymentInterface{
    @Override
    public void processPayment(int valor) {
        System.out.println("Pagamento de valor R$:"+valor);
        System.out.println("Método de pagamento: PayPal");
    }

    @Override
    public int calculaDesconto(int valor) {
        return valor-35;
    }
}
