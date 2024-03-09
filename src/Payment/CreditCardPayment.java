package Payment;

public class CreditCardPayment implements PaymentInterface{

    @Override
    public void processPayment(int valor) {
        System.out.println("Pagamento de valor R$:"+valor);
        System.out.println("Método de pagamento: Cartão de crédito");
    }

    @Override
    public int calculaDesconto(int valor) {
        return valor-10;
    }
}
