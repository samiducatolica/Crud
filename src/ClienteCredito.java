public class ClienteCredito extends Cliente {
    private int id;
    private String nombre;
    private String correoElectronico;
    @Override
    protected Pedido creaPedido(double costo) {
        return new PedidoCredito(costo);
    }
}
