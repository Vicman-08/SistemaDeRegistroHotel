package modelo;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class Reservacion {
    private int idReserva;
    private int idCliente;
    private Date fechaInicio;
    private Date fechaFin;
    private Timestamp fechaReserva;
    private int idEstadoReserva;
    private double descuento;
    
    public Reservacion() {
        this.idReserva = 0;
        this.idCliente = 0;
        this.fechaInicio = null; 
        this.fechaFin = null; 
        this.fechaReserva = null; 
        this.idEstadoReserva = 0;
        this.descuento = 0.0; 
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Timestamp getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Timestamp fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(int idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    

}
