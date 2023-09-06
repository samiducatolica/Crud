public class Main {
    public static void main(String[] args) {
        CRUDGenerico<Cliente> crudCliente = new CRUDGenerico<>();

        //nuevo cliente
       ClienteContado clienteContado = new ClienteContado();
       ClienteCredito clienteCredito = new ClienteCredito();
       PedidoCredito pedidoCredito ;
      /*clienteCredito.setNombre("Samid Amaury Barrera");
      clienteCredito.setCorreoElectronico("Prueba@hh.com");
      crudCliente.crear(clienteCredito);*/
      clienteCredito.nuevoPedido(1000,clienteCredito.getId());

        /*  //consultar cliente
        ClienteContado clienteContado1 = (ClienteContado) crudCliente.obtenerPorId(1);
        System.out.println("Resultado busqueda 1\n"+clienteContado1);
        //Actualzia cliente
        clienteContado1.setCorreoElectronico("samidamaury@gmail.com");
        crudCliente.actualizar(clienteContado1);
        clienteContado1 = (ClienteContado) crudCliente.obtenerPorId(1);
        System.out.println("Resultado consulta despues de update\n"+clienteContado1);

        //eliminar cliente
        ClienteContado clienteContado1 = (ClienteContado) crudCliente.obtenerPorId(1);
        System.out.println("Resultado busqueda 1\n"+clienteContado1);
        crudCliente.eliminar(clienteContado1);
        */
    }
}