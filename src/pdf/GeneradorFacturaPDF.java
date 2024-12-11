package pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import conexion.Conexion;
import java.io.FileOutputStream;
import java.sql.*;

public class GeneradorFacturaPDF {

    public void generarFacturaPDF(int idFactura) {
        String fileName = "Factura_" + idFactura + ".pdf";

        String query = "SELECT f.idFactura, f.fecha_emision, f.total_habitacion, f.total_servicios, f.descuento, f.total, " +
                       "c.nombre, c.apellidoPaterno, c.apellidoMaterno, " +
                       "GROUP_CONCAT(h.idHabitacion SEPARATOR ', ') AS habitaciones " +
                       "FROM Factura f " +
                       "JOIN HabitacionReserva hr ON f.idHabitacionReserva = hr.idHabitacionReserva " +
                       "JOIN Reserva r ON hr.idReserva = r.idReserva " +
                       "JOIN Cliente c ON r.idCliente = c.idCliente " +
                       "JOIN Habitacion h ON hr.idHabitacion = h.idHabitacion " +
                       "WHERE f.idFactura = ? " +
                       "GROUP BY f.idFactura";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setInt(1, idFactura);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(fileName));
                document.open();

                // Título
                Paragraph title = new Paragraph("Factura #" + idFactura, FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18));
                title.setAlignment(Element.ALIGN_CENTER);
                document.add(title);
                document.add(new Paragraph(" "));

                // Información del cliente
                document.add(new Paragraph("Cliente: " + rs.getString("nombre") + " " +
                                           rs.getString("apellidoPaterno") + " " +
                                           rs.getString("apellidoMaterno")));
                document.add(new Paragraph("Fecha de emisión: " + rs.getTimestamp("fecha_emision").toString()));
                document.add(new Paragraph("Habitaciones: " + rs.getString("habitaciones")));
                document.add(new Paragraph(" "));

                // Detalles de la factura
                PdfPTable table = new PdfPTable(2);
                table.setWidthPercentage(100);
                table.addCell("Total Habitación:");
                table.addCell("$" + rs.getDouble("total_habitacion"));

                table.addCell("Total Servicios:");
                table.addCell("$" + rs.getDouble("total_servicios"));

                table.addCell("Descuento:");
                table.addCell("$" + rs.getDouble("descuento"));

                table.addCell("Total a Pagar:");
                table.addCell("$" + rs.getDouble("total"));

                document.add(table);

                document.close();
                System.out.println("Factura generada correctamente: " + fileName);
            } else {
                System.out.println("No se encontró una factura con el ID proporcionado.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar la factura: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        GeneradorFacturaPDF generador = new GeneradorFacturaPDF();
        generador.generarFacturaPDF(1); // Cambia el ID de factura según sea necesario
    }
}
