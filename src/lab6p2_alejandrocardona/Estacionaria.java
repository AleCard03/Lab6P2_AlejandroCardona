
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
    
    
    
}
