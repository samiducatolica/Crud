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
        CRUDGenerico<Pedido> crudPedido = new CRUDGenerico<>();
        crudPedido.crear(this );
        System.out.println("El pago del pedido de contado de: "+costo+" se ha realizado.");
    }


}
