public abstract class Pedido {
    public  double costo;

    public Pedido(double costo) {
        this.costo = costo;
    }

    public abstract boolean valida() ;

    public abstract void paga();
}
