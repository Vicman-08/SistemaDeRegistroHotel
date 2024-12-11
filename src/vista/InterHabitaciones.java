package vista;

import com.mysql.jdbc.Connection;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import conexion.Conexion;

/**
 *
 * @author minparis.gomez
 */
public class InterHabitaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterHabitaciones
     */
    public InterHabitaciones() {
        initComponents();
        cargarDatos();
        cargarTiposHabitacionEnCombo();
        cargarEstadosHabitacionEnCombo();
        configurarEventos();
        this.setSize(new Dimension(767, 470));
        this.setTitle("Habitaciones");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHabitaciones = new javax.swing.JTable();
        Editar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ComboTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ComboEstadoHabitacion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Descripcion = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Habitacion", "ID Tipo de Habitacion", "ID Estado de habitacion", "Precio", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(tablaHabitaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 250));

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel5.setText("Tipo de Habitacion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        ComboTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoHabitacionActionPerformed(evt);
            }
        });
        getContentPane().add(ComboTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, -1));

        jLabel6.setText("Estado de Habitacion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        ComboEstadoHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboEstadoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 130, 20));

        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        txt_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 100, -1));

        jLabel8.setText("Descripcion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        txt_Descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 170, 50));

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        getContentPane().add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        Actualizar.setText("Actualizar Tabla");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoHabitacionActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        this.crearHabitacion();
    }//GEN-LAST:event_CrearActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        this.editarHabitacion();
    }//GEN-LAST:event_EditarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        txt_precio.setText("");
        txt_Descripcion.setText("");
        ComboTipoHabitacion.setSelectedIndex(-1);
        ComboEstadoHabitacion.setSelectedIndex(-1);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        cargarDatos();
    }//GEN-LAST:event_ActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JComboBox<String> ComboEstadoHabitacion;
    private javax.swing.JComboBox<String> ComboTipoHabitacion;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHabitaciones;
    private javax.swing.JTextField txt_Descripcion;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
    
    private void cargarDatos() {
    // Consulta SQL actualizada para incluir el estado desde la tabla Estado
    String query = "SELECT \n" +
        "    h.idHabitacion,\n" +
        "    th.tipo AS TipoHabitacion,\n" +
        "    eh.estado AS EstadoHabitacion,\n" +
        "    h.precio,\n" +
        "    h.descripcion AS DescripcionHabitacion\n" +
        "FROM \n" +
        "    Habitacion h\n" +
        "JOIN \n" +
        "    TipoHabitacion th ON h.idTipoHabitacion = th.idTipoHabitacion\n" +
        "JOIN \n" +
        "    EstadoHabitacion eh ON h.idEstadoHabitacion = eh.idEstadoHabitacion\n" +
        "ORDER BY \n" +
        "    h.idHabitacion;";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Crear el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tablaHabitaciones.getModel();

        // Limpiar las filas actuales (en caso de que haya datos previos)
        model.setRowCount(0);

        // Llenar el modelo con los datos del ResultSet
        while (rs.next()) {
            Object[] row = new Object[5];  // Número de columnas en la tabla
            row[0] = rs.getInt("idHabitacion");  // idHabitacion
            row[1] = rs.getString("TipoHabitacion");  // Tipo de habitación
            row[2] = rs.getString("EstadoHabitacion");  // Estado de la habitación
            row[3] = rs.getDouble("precio");  // Precio de la habitación
            row[4] = rs.getString("DescripcionHabitacion");  // Descripción de la habitación
            model.addRow(row);  // Agregar la fila al modelo
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos de la base de datos: " + e.getMessage());
    }
}
    
    private void cargarTiposHabitacionEnCombo() {
    String query = "SELECT tipo FROM TipoHabitacion"; // Consulta para obtener los tipos de habitación

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Limpiar los ComboBox antes de llenarlos
        ComboTipoHabitacion.removeAllItems();

        // Agregar opciones a los ComboBox
        while (rs.next()) {
            String tipo = rs.getString("tipo"); // Recuperar el tipo directamente
            ComboTipoHabitacion.addItem(tipo);
        }

        // Mostrar mensaje si no se encontró ningún tipo de habitación
        if (ComboTipoHabitacion.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron tipos de habitación en la base de datos.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los tipos de habitación: " + e.getMessage());
    }
}

    private void cargarEstadosHabitacionEnCombo() {
    String query = "SELECT estado FROM EstadoHabitacion"; // Consulta para obtener los estados de habitación

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Limpiar los ComboBox antes de llenarlos
        ComboEstadoHabitacion.removeAllItems();

        // Agregar opciones a los ComboBox
        while (rs.next()) {
            String estado = rs.getString("estado"); // Recuperar el estado directamente
            ComboEstadoHabitacion.addItem(estado);
        }

        // Mostrar mensaje si no se encontró ningún estado
        if (ComboEstadoHabitacion.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron estados de habitación en la base de datos.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los estados de habitación: " + e.getMessage());
    }
}

    private void crearHabitacion() {
    // Obtener valores de los componentes de la interfaz para crear
    String tipoHabitacion = ComboTipoHabitacion.getSelectedItem().toString();
    String estadoHabitacion = ComboEstadoHabitacion.getSelectedItem().toString();
    String precioStr = txt_precio.getText();
    String descripcion = txt_Descripcion.getText();

    // Validar que los campos no estén vacíos
    if (tipoHabitacion.isEmpty() || estadoHabitacion.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.");
        return;
    }

    try {
        double precio = Double.parseDouble(precioStr);

        // Insertar en la base de datos
        String query = "INSERT INTO Habitacion (idTipoHabitacion, idEstadoHabitacion, precio, descripcion) " +
                       "VALUES ((SELECT idTipoHabitacion FROM TipoHabitacion WHERE tipo = ?), " +
                               "(SELECT idEstadoHabitacion FROM EstadoHabitacion WHERE estado = ?), ?, ?)";

        try (java.sql.Connection conn = Conexion.conectar();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, tipoHabitacion);
            pst.setString(2, estadoHabitacion);
            pst.setDouble(3, precio);
            pst.setString(4, descripcion);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Habitación creada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo crear la habitación.");
            }
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al crear la habitación: " + e.getMessage());
    }
}

    private void editarHabitacion() {
    // Obtener la fila seleccionada en la tabla
    int filaSeleccionada = tablaHabitaciones.getSelectedRow();

    if (filaSeleccionada < 0) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una habitación para editar.");
        return;
    }

    // Obtener el idHabitacion de la tabla (suponiendo que está en la primera columna)
    int idHabitacion = Integer.parseInt(tablaHabitaciones.getValueAt(filaSeleccionada, 0).toString());

    // Obtener valores de los componentes de la interfaz para editar
    String tipoHabitacion = ComboTipoHabitacion.getSelectedItem() != null ? ComboTipoHabitacion.getSelectedItem().toString() : "";
    String estadoHabitacion = ComboEstadoHabitacion.getSelectedItem() != null ? ComboEstadoHabitacion.getSelectedItem().toString() : "";
    String precioStr = txt_precio.getText().trim();
    String descripcion = txt_Descripcion.getText().trim();

    // Validar que los campos no estén vacíos
    if (tipoHabitacion.isEmpty() || estadoHabitacion.isEmpty() || precioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.");
        return;
    }

    try {
        double precio = Double.parseDouble(precioStr);

        // Consulta para actualizar en la base de datos
        String query = "UPDATE Habitacion SET " +
                       "idTipoHabitacion = (SELECT idTipoHabitacion FROM TipoHabitacion WHERE tipo = ?), " +
                       "idEstadoHabitacion = (SELECT idEstadoHabitacion FROM EstadoHabitacion WHERE estado = ?), " +
                       "precio = ?, descripcion = ? WHERE idHabitacion = ?";

        try (java.sql.Connection conn = Conexion.conectar();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, tipoHabitacion);
            pst.setString(2, estadoHabitacion);
            pst.setDouble(3, precio);
            pst.setString(4, descripcion);
            pst.setInt(5, idHabitacion);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Habitación actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar la habitación.");
            }
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar la habitación: " + e.getMessage());
    }
}

    private void cargarDatosHabitacionDesdeTabla() {
    // Obtener la fila seleccionada en la tabla
    int filaSeleccionada = tablaHabitaciones.getSelectedRow();

    if (filaSeleccionada >= 0) {
        // Obtener datos de la fila seleccionada
        String tipoHabitacion = tablaHabitaciones.getValueAt(filaSeleccionada, 1).toString();
        String estadoHabitacion = tablaHabitaciones.getValueAt(filaSeleccionada, 2).toString();
        String precio = tablaHabitaciones.getValueAt(filaSeleccionada, 3).toString();
        String descripcion = tablaHabitaciones.getValueAt(filaSeleccionada, 4).toString();

        // Cargar los datos en los componentes correspondientes
        ComboTipoHabitacion.setSelectedItem(tipoHabitacion);
        ComboEstadoHabitacion.setSelectedItem(estadoHabitacion);
        txt_precio.setText(precio);
        txt_Descripcion.setText(descripcion);
    } 
}

    private void configurarEventos() {
        tablaHabitaciones.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                cargarDatosHabitacionDesdeTabla();
            }
        });
    }
    
    
}