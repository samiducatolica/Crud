public class ClienteContado extends Cliente {
    private int id;
    private String nombre;
    private String correoElectronico;

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

    public ClienteContado(String nombre, String correoElectronico) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public ClienteContado() {
    }

    @Override
    public String toString() {
        return "ClienteContado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    @Override
    protected Pedido creaPedido(double costo) {
        return new PedidoContado(costo);
    }
}
