
package lab6p2_alejandrocardona;

import java.util.ArrayList;

public class Portatil extends Consola {
    
    private String size;
    private int bateria;
    private boolean estuche;

    public Portatil(String size, int bateria, boolean estuche, String ID, String fabricante, int years, double precio, String modelo) {
        super(ID, fabricante, years, precio, modelo);
        this.size = size;
        this.bateria = bateria;
        this.estuche = estuche;
    }
    
    
    
}
