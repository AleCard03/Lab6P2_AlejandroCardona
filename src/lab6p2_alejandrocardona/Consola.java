
package lab6p2_alejandrocardona;

import java.util.ArrayList;

public class Consola {
    
    private String ID, fabricante;
    private int years;
    private ArrayList<Juego> juegos;
    private double precio;
    private String modelo;

    public Consola(String ID, String fabricante, int years, ArrayList<Juego> juegos, double precio, String modelo) {
        this.ID = ID;
        this.fabricante = fabricante;
        this.years = years;
        this.juegos = juegos;
        this.precio = precio;
        this.modelo = modelo;
    }

    public Consola(String ID, String fabricante, int years, double precio, String modelo) {
        this.ID = ID;
        this.fabricante = fabricante;
        this.years = years;
        this.precio = precio;
        this.modelo = modelo;
    }
    
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
