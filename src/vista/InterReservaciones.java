package vista;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.Conexion;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author minparis.gomez
 */
public class InterReservaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterReservaciones
     */
    public InterReservaciones() {
        initComponents();
        cargarDatos();
        cargarClientesEnTabla();  
        cargarReservaciones();
        cargarEstadosReserva();
        configurarEventosReservaciones();    // Para cargar datos de reservaciones
        configurarEventosClientes();          // Para cargar ID del cliente desde la tabla de clientes
        configurarEventosReservasYHabitaciones(); 
        this.setSize(new Dimension(1124, 699));
        this.setTitle("Reservaciones");
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
        TablaHabitacionReservacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboEstadoReserva = new javax.swing.JComboBox<>();
        txt_inicioFecha = new javax.swing.JTextField();
        txt_finFecha = new javax.swing.JTextField();
        txt_IdCliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableHabitacionesDisponibles = new javax.swing.JTable();
        crearReserva = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_FechaInicioBuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_FechaFinBuscar = new javax.swing.JTextField();
        BuscarHabitaciones = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_IdReserva2 = new javax.swing.JTextField();
        txt_IdHabitacion2 = new javax.swing.JTextField();
        Asignar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaReservaciones = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaHabitacionReservacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Reserva", "Cliente", "Habitacion", "Fecha Inicio", "Fecha Fin", "Fecha Reserva", "Estado"
            }
        ));
        jScrollPane1.setViewportView(TablaHabitacionReservacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 160));

        jLabel1.setText("Fecha de Inicio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel2.setText("Fecha de Fin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel3.setText("ID Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setText("Estado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        ComboEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ComboEstadoReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 80, -1));

        txt_inicioFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inicioFechaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_inicioFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, -1));
        getContentPane().add(txt_finFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 80, -1));
        getContentPane().add(txt_IdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(TableClientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 460, 160));

        TableHabitacionesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Habitacion", "Tipo", "Estado", "Precio", "Descripcion"
            }
        ));
        jScrollPane3.setViewportView(TableHabitacionesDisponibles);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 460, 160));

        crearReserva.setText("Crear");
        crearReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearReservaActionPerformed(evt);
            }
        });
        getContentPane().add(crearReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));
        getContentPane().add(txt_FechaInicioBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 110, -1));

        jLabel9.setText("Fecha Inicio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jLabel10.setText("Fecha Fin:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));
        getContentPane().add(txt_FechaFinBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 100, -1));

        BuscarHabitaciones.setText("Buscar");
        BuscarHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarHabitacionesActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, -1, -1));

        jLabel11.setText("Asignar Habitacion:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        getContentPane().add(txt_IdReserva2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, -1));
        getContentPane().add(txt_IdHabitacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 80, -1));

        Asignar.setText("Asignar");
        Asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarActionPerformed(evt);
            }
        });
        getContentPane().add(Asignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        TablaReservaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Fecha Inicio", "Fecha Fin", "Fecha Reserva", "Habitaciones"
            }
        ));
        jScrollPane4.setViewportView(TablaReservaciones);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 140));

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_inicioFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inicioFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inicioFechaActionPerformed

    private void BuscarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarHabitacionesActionPerformed
        buscarHabitacionesDisponibles();
    }//GEN-LAST:event_BuscarHabitacionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.editarReservacion();
        cargarDatos();
        cargarClientesEnTabla();  
        cargarReservaciones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void crearReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearReservaActionPerformed
        this.crearReservacion();
        cargarDatos();
        cargarClientesEnTabla();  
        cargarReservaciones();
    }//GEN-LAST:event_crearReservaActionPerformed

    private void AsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarActionPerformed
        this.agregarHabitacionAReserva();
        cargarDatos();
        cargarClientesEnTabla();  
        cargarReservaciones();
    }//GEN-LAST:event_AsignarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txt_IdCliente.setText("");
        txt_inicioFecha.setText("");
        txt_finFecha.setText("");
        ComboEstadoReserva.setSelectedIndex(-1);
    }//GEN-LAST:event_jButton4ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asignar;
    private javax.swing.JButton BuscarHabitaciones;
    private javax.swing.JComboBox<String> ComboEstadoReserva;
    private javax.swing.JTable TablaHabitacionReservacion;
    private javax.swing.JTable TablaReservaciones;
    private javax.swing.JTable TableClientes;
    private javax.swing.JTable TableHabitacionesDisponibles;
    private javax.swing.JButton crearReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txt_FechaFinBuscar;
    private javax.swing.JTextField txt_FechaInicioBuscar;
    private javax.swing.JTextField txt_IdCliente;
    private javax.swing.JTextField txt_IdHabitacion2;
    private javax.swing.JTextField txt_IdReserva2;
    private javax.swing.JTextField txt_finFecha;
    private javax.swing.JTextField txt_inicioFecha;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
    String query = "SELECT r.idReserva, c.nombre, c.apellidoPaterno, c.apellidoMaterno, " +
                   "r.fecha_inicio, r.fecha_fin, r.fecha_reserva, er.estado AS estadoReserva " +
                   "FROM Reserva r " +
                   "JOIN Cliente c ON r.idCliente = c.idCliente " +
                   "JOIN EstadoReserva er ON r.idEstadoReserva = er.idEstadoReserva " +
                   "ORDER BY r.idReserva";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Crear un modelo con las columnas correctas (sin la columna de Habitación)
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{
            "ID Reserva", "Cliente", "Fecha Inicio", "Fecha Fin", "Fecha Reserva", "Estado"
        });

        // Recorrer el ResultSet y llenar el modelo
        while (rs.next()) {
            Object[] row = new Object[6];
            row[0] = rs.getInt("idReserva");
            row[1] = rs.getString("nombre") + " " + rs.getString("apellidoPaterno") + " " + rs.getString("apellidoMaterno");
            row[2] = rs.getDate("fecha_inicio");
            row[3] = rs.getDate("fecha_fin");
            row[4] = rs.getTimestamp("fecha_reserva");
            row[5] = rs.getString("estadoReserva");
            model.addRow(row);
        }

        // Asignar el modelo a la tabla
        TablaHabitacionReservacion.setModel(model);

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos de la base de datos: " + e.getMessage());
    }
}

    private void cargarClientesEnTabla() {
        String query = "SELECT idCliente, nombre, apellidoPaterno, apellidoMaterno, telefono, direccion FROM Cliente";

        try (java.sql.Connection conn = Conexion.conectar();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Teléfono", "Dirección"
            });

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("idCliente"),
                    rs.getString("nombre"),
                    rs.getString("apellidoPaterno"),
                    rs.getString("apellidoMaterno"),
                    rs.getString("telefono"),
                    rs.getString("direccion")
                });
            }

            TableClientes.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los clientes: " + e.getMessage());
        }
    }
    
    private void cargarEstadosReserva() {
    String query = "SELECT estado FROM EstadoReserva";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pst = conn.prepareStatement(query);
         ResultSet rs = pst.executeQuery()) {

        // Limpiar ambos ComboBox antes de llenarlos
        ComboEstadoReserva.removeAllItems();

        // Agregar cada estado a ambos ComboBox
        while (rs.next()) {
            String estado = rs.getString("estado");
            ComboEstadoReserva.addItem(estado);
        }

        // Mostrar un mensaje si no se encontraron estados
        if (ComboEstadoReserva.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron estados en la base de datos.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los estados: " + e.getMessage());
    }
}


    private void buscarHabitacionesDisponibles() {
    // Obtener las fechas desde los JTextField
    String fechaInicioStr = txt_FechaInicioBuscar.getText().trim();
    String fechaFinStr = txt_FechaFinBuscar.getText().trim();

    // Validar que las fechas no estén vacías
    if (fechaInicioStr.isEmpty() || fechaFinStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese ambas fechas para la búsqueda.");
        return;
    }

    try {
        // Convertir las fechas a java.sql.Date
        Date fechaInicio = Date.valueOf(fechaInicioStr);
        Date fechaFin = Date.valueOf(fechaFinStr);

        // Consulta SQL para obtener habitaciones disponibles que no estén en mantenimiento
        String query = "SELECT h.idHabitacion, th.tipo, eh.estado, h.precio, h.descripcion " +
                       "FROM Habitacion h " +
                       "JOIN TipoHabitacion th ON h.idTipoHabitacion = th.idTipoHabitacion " +
                       "JOIN EstadoHabitacion eh ON h.idEstadoHabitacion = eh.idEstadoHabitacion " +
                       "WHERE eh.estado != 'mantenimiento' AND h.idHabitacion NOT IN (" +
                       "    SELECT hr.idHabitacion " +
                       "    FROM HabitacionReserva hr " +
                       "    JOIN Reserva r ON hr.idReserva = r.idReserva " +
                       "    WHERE (r.fecha_inicio <= ? AND r.fecha_fin >= ?)" +
                       ")";

        try (java.sql.Connection conn = Conexion.conectar();
             java.sql.PreparedStatement pst = conn.prepareStatement(query)) {

            // Asignar parámetros a la consulta
            pst.setDate(1, fechaFin);
            pst.setDate(2, fechaInicio);

            // Ejecutar la consulta
            ResultSet rs = pst.executeQuery();

            // Crear el modelo para la tabla y establecer los nombres de las columnas
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{
                "No. Habitación", "Tipo", "Estado", "Precio", "Descripción"
            });

            // Llenar el modelo con los resultados de la consulta
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("idHabitacion"),
                    rs.getString("tipo"),
                    rs.getString("estado"),
                    rs.getDouble("precio"),
                    rs.getString("descripcion")
                });
            }

            // Establecer el modelo en la tabla
            TableHabitacionesDisponibles.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar habitaciones disponibles: " + e.getMessage());
        }

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Use el formato YYYY-MM-DD.");
    }
}

    private void cargarDatosReservaDesdeTabla() {
    int filaSeleccionada = TablaHabitacionReservacion.getSelectedRow();

    if (filaSeleccionada >= 0) {
        txt_IdCliente.setText(TablaHabitacionReservacion.getValueAt(filaSeleccionada, 0).toString());
        txt_inicioFecha.setText(TablaHabitacionReservacion.getValueAt(filaSeleccionada, 2).toString());
        txt_finFecha.setText(TablaHabitacionReservacion.getValueAt(filaSeleccionada, 3).toString());
        ComboEstadoReserva.setSelectedItem(TablaHabitacionReservacion.getValueAt(filaSeleccionada, 5).toString());
    } 
}

    private void configurarEventosReservaciones() {
    TablaHabitacionReservacion.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            cargarDatosReservaDesdeTabla();
        }
    });
}

    
    private void editarReservacion() {
    int filaSeleccionada = TablaHabitacionReservacion.getSelectedRow();

    if (filaSeleccionada < 0) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una reservación para editar.");
        return;
    }

    int idReserva = Integer.parseInt(TablaHabitacionReservacion.getValueAt(filaSeleccionada, 0).toString());
    String idCliente = txt_IdCliente.getText().trim();
    String fechaInicio = txt_inicioFecha.getText().trim();
    String fechaFin = txt_finFecha.getText().trim();
    String estadoReserva = ComboEstadoReserva.getSelectedItem().toString();

    String query = "UPDATE Reserva SET idCliente = ?, fecha_inicio = ?, fecha_fin = ?, idEstadoReserva = " +
                   "(SELECT idEstadoReserva FROM EstadoReserva WHERE estado = ?) WHERE idReserva = ?";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pst = conn.prepareStatement(query)) {

        pst.setInt(1, Integer.parseInt(idCliente));
        pst.setDate(2, java.sql.Date.valueOf(fechaInicio));
        pst.setDate(3, java.sql.Date.valueOf(fechaFin));
        pst.setString(4, estadoReserva);
        pst.setInt(5, idReserva);

        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Reservación actualizada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la reservación.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al actualizar la reservación: " + e.getMessage());
    }
}

    private void crearReservacion() {
    String idCliente = txt_IdCliente.getText().trim();
    String fechaInicio = txt_inicioFecha.getText().trim();
    String fechaFin = txt_finFecha.getText().trim();
    String estadoReserva = ComboEstadoReserva.getSelectedItem().toString();

    if (idCliente.isEmpty() || fechaInicio.isEmpty() || fechaFin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.");
        return;
    }

    String query = "INSERT INTO Reserva (idCliente, fecha_inicio, fecha_fin, idEstadoReserva) " +
                   "VALUES (?, ?, ?, (SELECT idEstadoReserva FROM EstadoReserva WHERE estado = ?))";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pst = conn.prepareStatement(query)) {

        pst.setInt(1, Integer.parseInt(idCliente));
        pst.setDate(2, java.sql.Date.valueOf(fechaInicio));
        pst.setDate(3, java.sql.Date.valueOf(fechaFin));
        pst.setString(4, estadoReserva);

        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Reservación creada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo crear la reservación.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al crear la reservación: " + e.getMessage());
    }
}

    private void cargarIdClienteDesdeTabla() {
    int filaSeleccionada = TableClientes.getSelectedRow();

    if (filaSeleccionada >= 0) {
        txt_IdCliente.setText(TableClientes.getValueAt(filaSeleccionada, 0).toString());
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un cliente de la tabla.");
    }
}

    private void configurarEventosClientes() {
    TableClientes.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            cargarIdClienteDesdeTabla();
        }
    });
}

    private void cargarIdsReservaYHabitacionDesdeTablas() {
    int filaReservacion = TablaHabitacionReservacion.getSelectedRow();
    int filaHabitacion = TableHabitacionesDisponibles.getSelectedRow();

    if (filaReservacion >= 0 && filaHabitacion >= 0) {
        txt_IdReserva2.setText(TablaHabitacionReservacion.getValueAt(filaReservacion, 0).toString());
        txt_IdHabitacion2.setText(TableHabitacionesDisponibles.getValueAt(filaHabitacion, 0).toString());
    }
}

    private void configurarEventosReservasYHabitaciones() {
    TablaHabitacionReservacion.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            cargarIdsReservaYHabitacionDesdeTablas();
        }
    });

    TableHabitacionesDisponibles.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            cargarIdsReservaYHabitacionDesdeTablas();
        }
    });
}

    private void actualizarTablaReservaciones() {
    cargarDatos();
}
    private void cargarReservaciones() {
    // Consulta SQL para obtener los datos de las reservas con sus habitaciones
    String query = "SELECT r.idReserva, c.nombre, c.apellidoPaterno, c.apellidoMaterno, " +
                   "r.fecha_inicio, r.fecha_fin, GROUP_CONCAT(h.idHabitacion SEPARATOR ', ') AS habitaciones " +
                   "FROM Reserva r " +
                   "JOIN Cliente c ON r.idCliente = c.idCliente " +
                   "JOIN HabitacionReserva hr ON r.idReserva = hr.idReserva " +
                   "JOIN Habitacion h ON hr.idHabitacion = h.idHabitacion " +
                   "GROUP BY r.idReserva, c.nombre, c.apellidoPaterno, c.apellidoMaterno, r.fecha_inicio, r.fecha_fin";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        // Crear el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) TablaReservaciones.getModel();

        // Limpiar las filas actuales (en caso de que haya datos previos)
        model.setRowCount(0);

        // Llenar el modelo con los datos del ResultSet
        while (rs.next()) {
            Object[] row = new Object[6];
            row[0] = rs.getInt("idReserva");
            row[1] = rs.getString("nombre") + " " + rs.getString("apellidoPaterno") + " " + rs.getString("apellidoMaterno");
            row[2] = rs.getDate("fecha_inicio");
            row[3] = rs.getDate("fecha_fin");
            row[4] = rs.getString("habitaciones"); // Lista de habitaciones asociadas

            model.addRow(row);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al cargar las reservaciones: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void agregarHabitacionAReserva() {
    // Obtener la fila seleccionada en TablaHabitacionReservacion
    int filaReserva = TablaHabitacionReservacion.getSelectedRow();
    if (filaReserva == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una reserva.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Obtener la fila seleccionada en TableHabitacionesDisponibles
    int filaHabitacion = TableHabitacionesDisponibles.getSelectedRow();
    if (filaHabitacion == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona una habitación disponible.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Obtener el idReserva de la fila seleccionada en TablaHabitacionReservacion (asumiendo que está en la primera columna)
    int idReserva = (int) TablaHabitacionReservacion.getValueAt(filaReserva, 0);

    // Obtener el idHabitacion de la fila seleccionada en TableHabitacionesDisponibles (asumiendo que está en la primera columna)
    int idHabitacion = (int) TableHabitacionesDisponibles.getValueAt(filaHabitacion, 0);

    // Consulta SQL para insertar en la tabla HabitacionReserva
    String query = "INSERT INTO HabitacionReserva (idReserva, idHabitacion) VALUES (?, ?)";

    try (java.sql.Connection conn = Conexion.conectar();
         java.sql.PreparedStatement pstmt = conn.prepareStatement(query)) {

        // Configurar los parámetros de la consulta
        pstmt.setInt(1, idReserva);
        pstmt.setInt(2, idHabitacion);

        // Ejecutar la consulta
        int filasAfectadas = pstmt.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Habitación agregada a la reserva correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la habitación a la reserva.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al agregar la habitación a la reserva: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

}
