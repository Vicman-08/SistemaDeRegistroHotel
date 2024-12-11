package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import conexion.Conexion;

/**
 *
 * @author Victor
 */
public class Ctrl_Usuario {
    
    // Método para iniciar sesión
    public boolean loginUser(Usuario objeto) {
        
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        // Consulta SQL optimizada, sin necesidad de idTipoUsuario en el PreparedStatement
        String sql = "SELECT usuario, password, idTipoUsuario FROM Usuario WHERE usuario = ? AND password = ? AND idTipoUsuario IN (1, 2)"; 
        
        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            // Establecer los parámetros en la consulta
            pst.setString(1, objeto.getUsuario());
            pst.setString(2, objeto.getPassword());  // En producción, debes usar un hash para la contraseña
            
            // Ejecutar la consulta
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) { // Si hay un registro, el usuario y la contraseña son correctos
                    respuesta = true;
                    // Aquí puedes guardar el tipo de usuario si es necesario
                    objeto.setTipo(rs.getInt("idTipoUsuario"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close(); // Asegúrate de cerrar la conexión
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
        
        return respuesta;
    }   
}
