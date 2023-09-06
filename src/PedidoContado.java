public class PedidoContado extends Pedido{
    public PedidoContado(double costo) {
        super(costo);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.println("El pago del pedido de contado de: "+costo+" se ha realizado.");
    }


}
