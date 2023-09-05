import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:postgresql://dpg-cjddeeqvvtos73am5ibg-a.ohio-postgres.render.com:5432/taskmanager_tyxa";
    private static final String USUARIO = "sabarrera21";
    private static final String CONTRASENA = "yCBtRRws6WxEA8P9eGbJb1VKHK01FWIw";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }
}
//PGPASSWORD=yCBtRRws6WxEA8P9eGbJb1VKHK01FWIw
// psql -h dpg-cjddeeqvvtos73am5ibg-a.ohio-postgres.render.com
// -U sabarrera21
// taskmanager_tyxa