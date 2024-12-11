package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Victor
 */
public class Conexion {
    // Conexión local sin SSL
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost/bd_sistema_hotel?useSSL=false", // Se deshabilita SSL
                "root",
                "1234"
            );
            return cn;
        } catch (SQLException e) {
            System.out.println("No hay conexión local: " + e.getMessage());
        }
        return null;
    } 
}
