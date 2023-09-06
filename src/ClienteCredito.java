public class ClienteCredito extends Cliente {
    private int id;
    private String nombre;

    @Override
    public String toString() {
        return "ClienteCredito{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ClienteCredito() {
    }

    private String correoElectronico;
    @Override
    protected Pedido creaPedido(double costo) {
        return new PedidoCredito(costo);
    }

}
