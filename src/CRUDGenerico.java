import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDGenerico<T> {
    private final Connection conexion;

    public CRUDGenerico() {
        conexion = Conexion.obtenerConexion();
    }

    public void crear(T entidad) {
        if (entidad instanceof ClienteContado){
            String sql = "Insert Into parciales.cliente(nombre,correo) VALUES(?,?)";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setString(1,((ClienteContado) entidad).getNombre());
                preparedStatement.setString(2,((ClienteContado) entidad).getCorreoElectronico());
                preparedStatement.executeUpdate();
                System.out.println("Cliente creado con éxito");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if (entidad instanceof ClienteCredito){
            String sql = "Insert Into parciales.cliente(nombre,correo) VALUES(?,?)";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setString(1,((ClienteCredito) entidad).getNombre());
                preparedStatement.setString(2,((ClienteCredito) entidad).getCorreoElectronico());
                preparedStatement.executeUpdate();
                System.out.println("Cliente creado con éxito");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else if (entidad instanceof PedidoCredito) {
            String sql = "Insert Into parciales.pedido(idcliente,costo) VALUES(?,?)";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setInt(1,((PedidoCredito) entidad).idCliente);
                preparedStatement.setDouble(2,((PedidoCredito) entidad).costo);
                preparedStatement.executeUpdate();
                System.out.println("Cliente creado con éxito");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Otra entidad");
        }
    }

    public T obtenerPorId(int id) {
        String sql ="SELECT * FROM parciales.cliente where ID = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
            preparedStatement.setInt(1,id);
            ResultSet resultSet =preparedStatement.executeQuery();
        if(resultSet.next()){
            ClienteContado cliente = new ClienteContado();
            cliente.setId(resultSet.getInt("id"));
            cliente.setNombre(resultSet.getString("nombre"));
            cliente.setCorreoElectronico(resultSet.getString("correo"));
            return (T) cliente;
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void actualizar(T entidad) {
        if (entidad instanceof ClienteContado){
            String sql = "UPDATE parciales.cliente SET nombre =?,correo=? WHERE id=?";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setString(1,((ClienteContado) entidad).getNombre());
                preparedStatement.setString(2,((ClienteContado) entidad).getCorreoElectronico());
                preparedStatement.setInt(3,((ClienteContado) entidad).getId());
                int filas = preparedStatement.executeUpdate();
                if (filas >0){
                    System.out.println("Cliente actualziado con éxito");
                }else{
                    System.out.println("Cliente no encontrado o no se realizo ninguna actualziacion");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (entidad instanceof ClienteCredito) {
            String sql = "UPDATE parciales.cliente SET nombre =?,correo=? WHERE id=?";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setString(1,((ClienteCredito) entidad).getNombre());
                preparedStatement.setString(2,((ClienteCredito) entidad).getCorreoElectronico());
                preparedStatement.setInt(3,((ClienteCredito) entidad).getId());
                int filas = preparedStatement.executeUpdate();
                if (filas >0){
                    System.out.println("Cliente actualziado con éxito");
                }else{
                    System.out.println("Cliente no encontrado o no se realizo ninguna actualziacion");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (entidad instanceof PedidoCredito) {

        } else {
            System.out.println("Otra entidad");
        }
    }

    public void eliminar(T entidad) {
        if (entidad instanceof ClienteContado){
            String sql = "DELETE FROM parciales.cliente WHERE id=?";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setInt(1,((ClienteContado) entidad).getId());
                int filas = preparedStatement.executeUpdate();
                if (filas >0){
                    System.out.println("Cliente eliminado con éxito");
                }else{
                    System.out.println("Cliente no encontrado o no se realizó ninguna eliminación");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (entidad instanceof ClienteCredito) {
            String sql = "DELETE FROM parciales.cliente WHERE id=?";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)){
                preparedStatement.setInt(1,((ClienteCredito) entidad).getId());
                int filas = preparedStatement.executeUpdate();
                if (filas >0){
                    System.out.println("Cliente eliminado con éxito");
                }else{
                    System.out.println("Cliente no encontrado o no se realizó ninguna eliminación");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Otra entidad");
        }
    }
}
