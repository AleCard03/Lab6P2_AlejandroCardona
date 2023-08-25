
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }
    
    
    
}
