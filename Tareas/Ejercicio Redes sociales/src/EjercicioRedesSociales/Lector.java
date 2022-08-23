/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRedesSociales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Lector {
    private BufferedReader lector;
    private String fila; 
    private String [] celda;
    
    
    
    public void leerArchivo(String presenciaRedes) {
        try {
            lector = new BufferedReader(new FileReader(presenciaRedes));
            while ((fila = lector.readLine()) != null) {
               celda = fila.split(",");
              
                imprimir();
                
                      
                
                
            }
            lector.close();
            fila = null;
            celda = null;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void imprimir() {
        for (int i = 0; i < celda.length; i++) {
            System.out.print(celda[i]+"|");
        }
    }
   
}
    

