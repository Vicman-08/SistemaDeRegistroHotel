package modelo;

/**
 *
 * @author Victor
 */
public class Habitacion {
    
    private int idHabitacion;
    private int idTipoHabitacion;
    private int idEstadoHabitacion;
    private double precio;
    private String descripcion;
    private double descuento;

    public Habitacion() {
        this.idHabitacion = 0;
        this.idTipoHabitacion = 0;
        this.idEstadoHabitacion = 0;
        this.precio = 0.0;
        this.descripcion = "";
        this.descuento = 0.0;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getIdEstadoHabitacion() {
        return idEstadoHabitacion;
    }

    public void setIdEstadoHabitacion(int idEstadoHabitacion) {
        this.idEstadoHabitacion = idEstadoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}
