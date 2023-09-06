public class PedidoCredito extends Pedido{

    public PedidoCredito(double costo) {
        super(costo);
    }

    @Override
    public boolean valida() {
        return (costo >= 1000.0)&&(costo<=5000.0);
    }

    @Override
    public void paga() {
        System.out.println("El pago del pedido a gredito de: "+costo+" se ha realizado.");
    }
}
