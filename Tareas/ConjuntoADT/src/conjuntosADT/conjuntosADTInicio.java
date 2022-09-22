/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntosADT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 *
 * @author angel
 */
public class conjuntosADTInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConjuntoADT<Integer> A = new ConjuntoADT();
        
        A.add(71);
        A.add(10);
        A.add(72);
        A.add(6);
        A.add(0);
        A.add(12);
        A.add(4);
        A.add(42);
        A.add(11);
        
        ConjuntoADT<Integer> B= new ConjuntoADT();
        
        B.add(12);
        B.add(1);
        B.add(7);
        B.add(2);
        B.add(3);
        B.add(2);
        
        System.out.println("La longitud de A es igual a:\t" + A.longitud());
        System.out.println("La longitud de B es igual a:\t" + B.longitud());      
        System.out.println("Conjunto A:\t"+A);
        System.out.println("Conjunto B:\t"+B);            
        System.out.println("A contiene 1 \t" + A.contiene(1));
        System.out.println("A contiene 71 \t" + A.contiene(71));
        System.out.println("A contiene 13 \t" + A.contiene(13));
        System.out.println("B contiene 6 \t" + B.contiene(6));
        System.out.println("B contiene 11 \t" + B.contiene(11));
        System.out.println("B contiene 19 \t" + B.contiene(19));            
        A.eliminar(7); // ---> Elimina el elemento 
        System.out.println("¿A es igual a B ?:\t" + A.equals(B));//--> Compara los conjuntos y regresa true si son iguales
        System.out.println("¿B es subconjunto de A?:\t" + B.esSubconjunto(A));//---> Subconjunto
        ConjuntoADT<Integer> conjunto_intersection = A.intersection(B);//---> Intersección
        System.out.println(" La interseccion entre A y B es igual a:\t" + conjunto_intersection);        
        ConjuntoADT<Integer> conjunto_difference = A.diferencia(B);// ---> Diferencia entre conjuntos
        System.out.println("La diferencia entre A y B es:\t" + conjunto_difference);              
        A.union(B);// ---> Union de A y B
        System.out.println("La union de A y B es igual a:\t " + A); 
        
    }
    
}
