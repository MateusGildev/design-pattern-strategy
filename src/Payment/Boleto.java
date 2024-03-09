package Payment;

public class Boleto implements PaymentInterface{
    @Override
    public void processPayment(int valor) {
        System.out.println("Pagamento de valor R$:"+valor);
        System.out.println("Método de pagamento: Boleto Bancario");
    }

    @Override
    public int calculaDesconto(int valor) {
        return valor;
    }
}
