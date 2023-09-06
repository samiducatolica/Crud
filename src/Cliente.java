import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

   protected List<Pedido>  pedidos = new ArrayList<Pedido>();
   protected abstract  Pedido creaPedido(double costo);
   public void nuevoPedido(double costo,int a){
      Pedido pedido = this.creaPedido(costo);
      if (pedido.valida()){
         pedido.paga();
         pedidos.add(pedido);
      }
   }

}

