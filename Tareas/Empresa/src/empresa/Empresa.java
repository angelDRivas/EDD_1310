/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;
import Arreglo.arreglo;

import java.io.IOException;

/**
 *
 * @author angel
 */
public class Empresa {

    
    

    public static void main(String[] args) throws IOException {
        nomina nomina = new nomina("C:\\Users\\angel\\Documents\\EDD_1310\\Tareas\\junio.dat", "Estructura de datos S.A. de C.V.");
        nomina.calcularSueldo();
        System.out.println("-----------------------------------------------------");
        nomina.obtenerMaxMin();
    }
}
    

