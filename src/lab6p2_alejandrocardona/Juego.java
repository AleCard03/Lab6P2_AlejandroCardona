
package lab6p2_alejandrocardona;

import java.util.Date;

public class Juego {
    
    private String nombre, descripcion;
    private Date fechaLan;
    private double precio;
    private String estado;
    private boolean rentable;
    private boolean agregado;

    public Juego(String nombre, String descripcion, Date fechaLan, double precio, String estado, boolean rentable, boolean agregado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaLan = fechaLan;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLan() {
        return fechaLan;
    }

    public void setFechaLan(Date fechaLan) {
        this.fechaLan = fechaLan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }
    
    
    
}
