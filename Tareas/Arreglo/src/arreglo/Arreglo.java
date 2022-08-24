/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import java.lang.ref.Cleaner;

/**
 *
 * @author angel
 */
public class Arreglo {
    private int tamaño;
    private int longitud;
    private int elemento;

    public Arreglo() {
    }

    public Arreglo(int tamaño, int longitud, int elemento) {
        this.tamaño = tamaño;
        this.longitud = longitud;
        this.elemento = elemento;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getLongitud() {
        return tamaño;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
 

    @Override
    public String toString() {
        return "Arreglo{" + "tama\u00f1o=" + tamaño + ", longitud=" + longitud + ", elemento=" + elemento + '}';
    }
    
    
}
