import java.sql.Connection;

public class CRUDGenerico<T> {
    private final Connection conexion;

    public CRUDGenerico() {
        conexion = Conexion.obtenerConexion();
    }

    public void crear(T entidad) {
        // Implementa la lógica para crear un registro en la base de datos
    }

    //public T obtenerPorId(int id) {
    // Implementa la lógica para obtener un registro por su ID desde la base de datos
    //}

    public void actualizar(T entidad) {
        // Implementa la lógica para actualizar un registro en la base de datos
    }

    public void eliminar(int id) {
        // Implementa la lógica para eliminar un registro de la base de datos
    }
}
