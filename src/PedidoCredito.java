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
        CRUDGenerico<Pedido> crudPedido = new CRUDGenerico<>();
        crudPedido.crear(this );
        System.out.println("El pago del pedido a credito de: "+costo+" se ha realizado.");
    }
}
