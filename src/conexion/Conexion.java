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
    // Método estático para establecer una conexión con la base de datos MySQL.
public static Connection conectar() {
    try {
        // Intentamos establecer una conexión con la base de datos.
        // La URL especifica el servidor (localhost), la base de datos (bd_sistema_hotel),
        // y desactiva la opción SSL para evitar problemas de conexión no cifrada.
        Connection cn = DriverManager.getConnection(
            "jdbc:mysql://localhost/bd_sistema_hotel?useSSL=false", // Desactiva SSL
            "root", // Nombre de usuario de la base de datos
            "1234"  // Contraseña de la base de datos
        );
        // Si la conexión es exitosa, la retornamos.
        return cn;
    } catch (SQLException e) {
        // Si ocurre un error de conexión, se captura la excepción y se muestra un mensaje de error.
        System.out.println("No hay conexión local: " + e.getMessage());
    }
    // Si no se pudo establecer la conexión, retornamos null.
    return null;
}

}
