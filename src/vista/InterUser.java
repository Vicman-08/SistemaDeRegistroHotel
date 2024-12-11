package vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.Conexion;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor
 */
public class InterUser extends javax.swing.JInternalFrame {

    public InterUser() {
        initComponents();
        cargarDatos();
        cargarTipoUsuariosEnCombos();
        cargarEstadosEnCombo();
        configurarTabla();
        this.setSize(new Dimension(937, 436));
        this.setTitle("Usuario");
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
        tablaUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ApellidoPaterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ApellidoMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        ComboUsuario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Crear = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Actualizartable = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Usuario", "Nombre", "Apellido Paterno", "Apellido Materno", "Usuario", "Telefono", "Contraseña", "Estado", "Tipo de Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido Paterno:");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Usuario:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Estado:");

        jLabel7.setText("Tipo de Usuario:");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Contraseña:");

        Crear.setText("Crear");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Actualizartable.setText("Actualizar Tabla");
        Actualizartable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizartableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addComponent(Crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actualizartable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear)
                    .addComponent(jButton1)
                    .addComponent(Limpiar)
                    .addComponent(Actualizartable))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.editarUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        try {
            this.crearUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(InterUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        txt_nombre.setText("");
        txt_ApellidoPaterno.setText("");
        txt_ApellidoMaterno.setText("");
        txt_Usuario.setText("");
        txt_Telefono.setText("");
        txt_Contraseña.setText("");
        ComboEstado.setSelectedIndex(-1);
        ComboUsuario.setSelectedIndex(-1);
    }//GEN-LAST:event_LimpiarActionPerformed

    private void ActualizartableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizartableActionPerformed
        this.cargarDatos();
    }//GEN-LAST:event_ActualizartableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizartable;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboUsuario;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txt_ApellidoMaterno;
    private javax.swing.JTextField txt_ApellidoPaterno;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
    private void cargarDatos() {
    // Consulta SQL actualizada para incluir la contraseña y el estado desde la tabla Estado
    String query = "SELECT u.idUsuario, u.nombre, u.apellidoPaterno, u.apellidoMaterno, u.usuario, " +
                   "u.telefono, u.password, e.estado AS estado, tu.tipo AS tipoUsuario " +
                   "FROM Usuario u " +
                   "JOIN Estado e ON u.idEstado = e.idEstado " +
                   "JOIN TipoUsuario tu ON u.idTipoUsuario = tu.idTipoUsuario " +
                   "ORDER BY u.idUsuario";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Crear el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) tablaUsuarios.getModel();

        // Limpiar las filas actuales (en caso de que haya datos previos)
        model.setRowCount(0);

        // Llenar el modelo con los datos del ResultSet
        while (rs.next()) {
            Object[] row = new Object[9];  
            row[0] = rs.getInt("idUsuario");                
            row[1] = rs.getString("nombre");                
            row[2] = rs.getString("apellidoPaterno");       
            row[3] = rs.getString("apellidoMaterno");       
            row[4] = rs.getString("usuario");               
            row[5] = rs.getString("telefono");             
            row[6] = "********";  // Mostrar asteriscos en lugar de la contraseña real
            row[7] = rs.getString("estado");              
            row[8] = rs.getString("tipoUsuario");         

            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos de la base de datos: " + e.getMessage());
    }
}


    private void cargarEstadosEnCombo() {
    String query = "SELECT estado FROM Estado"; // Consulta para obtener los estados desde la tabla Estado

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Limpiar el ComboBox antes de llenarlo
        ComboEstado.removeAllItems();

        // Agregar opciones al ComboBox
        while (rs.next()) {
            String estado = rs.getString("estado"); // Recuperar el estado directamente
            ComboEstado.addItem(estado); // Agregar estado al ComboBox
        }

        // Mostrar mensaje si no se encontró ningún estado
        if (ComboEstado.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron estados en la base de datos.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los estados: " + e.getMessage());
    }
}
    
    private void cargarTipoUsuariosEnCombos() {
        String query = "SELECT tipo FROM TipoUsuario"; // Consulta para obtener los tipos de usuario desde la tabla TipoUsuario

        try (java.sql.Connection conn = Conexion.conectar();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Limpiar los ComboBox antes de llenarlos
            //ComboUsuario1.removeAllItems();
            ComboUsuario.removeAllItems();

            // Agregar opciones a ambos ComboBox
            while (rs.next()) {
                String tipoUsuario = rs.getString("tipo"); // Recuperar el valor de la columna 'tipo'
                //ComboUsuario1.addItem(tipoUsuario); // Agregar tipo al ComboUsuario1
                ComboUsuario.addItem(tipoUsuario);  // Agregar tipo al ComboUsuario
            }

            // Mostrar mensaje si no se encontraron tipos de usuario
            if (ComboUsuario.getItemCount() == 0) {
                JOptionPane.showMessageDialog(this, "No se encontraron tipos de usuario en la base de datos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los tipos de usuario: " + e.getMessage());
        }
    }
    
    private void configurarTabla() {
        tablaUsuarios.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                rellenarCamposDesdeTabla();
            }
        });
    }
    
    private void rellenarCamposDesdeTabla() {
    // Obtener la fila seleccionada en la tabla
    int filaSeleccionada = tablaUsuarios.getSelectedRow();

    if (filaSeleccionada >= 0) {
        // Obtener datos de la fila seleccionada (omitiendo la primera columna: idUsuario)
        String nombre = tablaUsuarios.getValueAt(filaSeleccionada, 1) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 1).toString() : "";
        String apellidoPaterno = tablaUsuarios.getValueAt(filaSeleccionada, 2) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 2).toString() : "";
        String apellidoMaterno = tablaUsuarios.getValueAt(filaSeleccionada, 3) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 3).toString() : "";
        String usuario = tablaUsuarios.getValueAt(filaSeleccionada, 4) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 4).toString() : "";
        String telefono = tablaUsuarios.getValueAt(filaSeleccionada, 5) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 5).toString() : "";
        String estado = tablaUsuarios.getValueAt(filaSeleccionada, 6) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 6).toString() : "";
        String tipoUsuario = tablaUsuarios.getValueAt(filaSeleccionada, 7) != null 
                        ? tablaUsuarios.getValueAt(filaSeleccionada, 7).toString() : "";

        // Rellenar los JTextField
        txt_nombre.setText(nombre);
        txt_ApellidoPaterno.setText(apellidoPaterno);
        txt_ApellidoMaterno.setText(apellidoMaterno);
        txt_Usuario.setText(usuario);
        txt_Telefono.setText(telefono);

        // Seleccionar los valores correspondientes en los ComboBox
        ComboEstado.setSelectedItem(estado);
        ComboUsuario.setSelectedItem(tipoUsuario);

    } 
}

    private void editarUsuario() {
    // Obtener los valores de los campos de texto y ComboBox
    String nombre = txt_nombre.getText().trim();
    String apellidoPaterno = txt_ApellidoPaterno.getText().trim();
    String apellidoMaterno = txt_ApellidoMaterno.getText().trim();
    String usuario = txt_Usuario.getText().trim();
    String telefono = txt_Telefono.getText().trim();
    String estadoSeleccionado = (String) ComboEstado.getSelectedItem();
    String tipoUsuarioSeleccionado = (String) ComboUsuario.getSelectedItem();
    String nuevaPassword = new String(txt_Contraseña.getPassword()).trim();

    // Obtener el ID del usuario seleccionado en la tabla
    int filaSeleccionada = tablaUsuarios.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un usuario en la tabla.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    int idUsuario = (int) tablaUsuarios.getValueAt(filaSeleccionada, 0); // Columna 0 es idUsuario

    // Validar que no haya campos vacíos
    if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() ||
        usuario.isEmpty() || telefono.isEmpty() || estadoSeleccionado == null || tipoUsuarioSeleccionado == null) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener los IDs de las tablas relacionadas (Estado y TipoUsuario)
    int idEstado;
    int idTipoUsuario;
    try {
        idEstado = obtenerIdEstado(estadoSeleccionado);
        idTipoUsuario = obtenerIdTipoUsuario(tipoUsuarioSeleccionado);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al obtener IDs de estado o tipo de usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Consulta SQL para actualizar con o sin contraseña
    String query;
    if (!nuevaPassword.isEmpty()) {
        // Si se proporciona una nueva contraseña
        query = "UPDATE Usuario SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, usuario = ?, telefono = ?, idEstado = ?, idTipoUsuario = ?, password = ? WHERE idUsuario = ?";
    } else {
        // Si no se proporciona una nueva contraseña
        query = "UPDATE Usuario SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, usuario = ?, telefono = ?, idEstado = ?, idTipoUsuario = ? WHERE idUsuario = ?";
    }

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {

        // Configurar los parámetros de la consulta
        pstmt.setString(1, nombre);
        pstmt.setString(2, apellidoPaterno);
        pstmt.setString(3, apellidoMaterno);
        pstmt.setString(4, usuario);
        pstmt.setString(5, telefono);
        pstmt.setInt(6, idEstado);
        pstmt.setInt(7, idTipoUsuario);

        if (!nuevaPassword.isEmpty()) {
            pstmt.setString(8, nuevaPassword); // Nueva contraseña
            pstmt.setInt(9, idUsuario);
        } else {
            pstmt.setInt(8, idUsuario);
        }

        // Ejecutar la consulta
        int filasAfectadas = pstmt.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar el usuario. Por favor, verifica los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    private int obtenerIdEstado(String estadoSeleccionado) throws SQLException {
    String query = "SELECT idEstado FROM Estado WHERE estado = ?";
    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, estadoSeleccionado);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("idEstado");
            }
        }
    }
    throw new SQLException("Estado no encontrado: " + estadoSeleccionado);
}

    private int obtenerIdTipoUsuario(String tipoUsuarioSeleccionado) throws SQLException {
    String query = "SELECT idTipoUsuario FROM TipoUsuario WHERE tipo = ?";
    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, tipoUsuarioSeleccionado);
        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("idTipoUsuario");
            }
        }
    }
    throw new SQLException("Tipo de usuario no encontrado: " + tipoUsuarioSeleccionado);
}
    
    private void crearUsuario() throws SQLException {
    // Obtener los valores de los campos de texto y ComboBox
    String nombre = txt_nombre.getText().trim();
    String apellidoPaterno = txt_ApellidoPaterno.getText().trim();
    String apellidoMaterno = txt_ApellidoMaterno.getText().trim();
    String usuario = txt_Usuario.getText().trim();
    String telefono = txt_Telefono.getText().trim();
    String estadoSeleccionado = (String) ComboEstado.getSelectedItem();
    String tipoUsuarioSeleccionado = (String) ComboUsuario.getSelectedItem();
    
    // Obtener la contraseña desde el JPasswordField
    String password = new String(txt_Contraseña.getPassword()).trim();

    // Validar que no haya campos vacíos
    if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() ||
        usuario.isEmpty() || telefono.isEmpty() || estadoSeleccionado == null || tipoUsuarioSeleccionado == null || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el ID del estado y tipo de usuario
    int idEstado = obtenerIdEstado(estadoSeleccionado);
    int idTipoUsuario = obtenerIdTipoUsuario(tipoUsuarioSeleccionado);

    // Consulta SQL para insertar un nuevo usuario
    String query = "INSERT INTO Usuario (nombre, apellidoPaterno, apellidoMaterno, usuario, password, telefono, idEstado, idTipoUsuario) " +
                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {

        // Configurar los parámetros de la consulta
        pstmt.setString(1, nombre);
        pstmt.setString(2, apellidoPaterno);
        pstmt.setString(3, apellidoMaterno);
        pstmt.setString(4, usuario);
        pstmt.setString(5, password); // Contraseña en texto claro
        pstmt.setString(6, telefono);
        pstmt.setInt(7, idEstado);
        pstmt.setInt(8, idTipoUsuario);

        // Ejecutar la consulta
        int filasAfectadas = pstmt.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Usuario creado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo crear el usuario. Por favor, verifica los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al crear el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}