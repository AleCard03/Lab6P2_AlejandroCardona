
package lab6p2_alejandrocardona;

public class Estacionaria extends Consola {
    
    private int controles;
    private double almacenamieneto;
    private String conexion;

    public Estacionaria(int controles, double almacenamieneto, String conexion, String ID, String fabricante, int years, double precio, String modelo) {
        super(ID, fabricante, years, precio, modelo);
        this.controles = controles;
        this.almacenamieneto = almacenamieneto;
        this.conexion = conexion;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public double getAlmacenamieneto() {
        return almacenamieneto;
    }

    public void setAlmacenamieneto(double almacenamieneto) {
        this.almacenamieneto = almacenamieneto;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    
    
    
}
