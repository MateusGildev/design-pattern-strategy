import Payment.PaymentInterface;

public class OnlineStore {
    private int valor;

    public void checkout(PaymentInterface paymentChoice, int valor){
        int valorComDesconto = paymentChoice.calculaDesconto(valor);
        paymentChoice.processPayment(valorComDesconto);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
