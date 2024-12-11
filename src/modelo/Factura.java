package modelo;

import java.sql.Timestamp;

public class Factura {
    private int idFactura;
    private int idHabitacionReserva;
    private Timestamp fechaEmision;
    private double totalHabitacion;
    private double totalServicios;
    private double descuento;
    private double total;
    private String nombreCliente;
    private String habitaciones;

    // Constructor
    public Factura(int idFactura, int idHabitacionReserva, Timestamp fechaEmision,
                   double totalHabitacion, double totalServicios, double descuento,
                   double total, String nombreCliente, String habitaciones) {
        this.idFactura = idFactura;
        this.idHabitacionReserva = idHabitacionReserva;
        this.fechaEmision = fechaEmision;
        this.totalHabitacion = totalHabitacion;
        this.totalServicios = totalServicios;
        this.descuento = descuento;
        this.total = total;
        this.nombreCliente = nombreCliente;
        this.habitaciones = habitaciones;
    }

    // Getters y Setters (puedes generarlos automáticamente con tu IDE)
}
