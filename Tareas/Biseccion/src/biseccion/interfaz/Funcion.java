/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biseccion.interfaz;

import javax.swing.JTextField;
import org.nfunk.jep.JEP;

/**
 *
 * @author angel
 */
class Funcion {
    private String expresion = "";
    
    
    public Funcion(String expresion){
        this.expresion = expresion;
    }

    Funcion(JTextField funcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double evaluar(double x){  
       JEP j = new JEP(); 
       j.addStandardFunctions();
       j.addStandardConstants();
       j.addVariable("x", x);
       j.parseExpression(this.expresion);
       
        if (!j.hasError()) {
            return j.getValue();
        } else {
            return Double.NaN;
        }           
    }
}
