public abstract class Pedido {
    public  double costo;
    public int idCliente;
    public Pedido(double costo) {
        this.costo = costo;
    }

    public abstract boolean valida() ;

    public abstract void paga();

    public double getCosto() {
        return costo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
