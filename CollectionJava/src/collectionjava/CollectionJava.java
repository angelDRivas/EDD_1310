/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author angel
 */
public class CollectionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, String> mapc = new HashMap<>();
        Map<Integer, String> mapb = new TreeMap<>();
        Map<String, String> mapa = new LinkedHashMap<String, String>();
        
        
        System.out.println("/****HashMap****/");
        
     
        System.out.println("Esta vacia?: " + mapc.isEmpty());
        
       
        mapc.put(1, "Angel");
        mapc.put(2, "Jesus");
        mapc.put(3, "Rivas");
        mapc.put(4, "Rodriguez");
                
        System.out.println("Cual es el conjutno de llaves del map?: " + mapc.keySet());
       
        
        
        for(String valor: mapc.values()) {
            System.out.println("-->  "+ valor + " ");
        
        }
        System.out.println("Contiene la clave 3?: " + mapc.containsKey(3));
        System.out.println("Contiene la clave 1?: " + mapc.containsKey(1)); 
       
        System.out.println("Contiene el valor Ecuaciones Diferenciales?: " + mapc.containsValue("Ecuaciones Diferenciales"));
        System.out.println("Contiene el valor Algebra Lineal?: " + mapc.containsValue("Algebra Lineal"));
         
        System.out.println("Cual es el numero de elementos?: " + mapc.size());
        
        
       
        
        
        mapc.remove(1, "Angel");
        
        
        for(String valor: mapc.values()) {
            System.out.println("-->  "+ valor + " ");
        }
        
       
        System.out.println("Esta vacia?: " + mapc.isEmpty());
        
        
        System.out.println("Dame el valor de la clave 1: " + mapc.get(1));
        System.out.println("Dame el valor de la clave 3: " + mapc.get(3));
        System.out.println("Dame el valor de la clave 5: " + mapc.get(5));
        
        
        System.out.println("Cual es el numero de elementos?: " + mapc.size());
        
        
        System.out.println("Cuales son los valores de entrada del mapa?: " + mapc.entrySet());
        
        mapc.clear();
        System.out.println("-----clear-----");
        
      
        System.out.println("Esta vacia?: " + mapc.isEmpty());
        System.out.println();
        System.out.println();  
                                             
        System.out.println("Esta vacia?: " + mapb.isEmpty());        
        mapb.put(1, "A");
        mapb.put(2, "B");
        mapb.put(3, "C");
        mapb.put(4, "D");
        mapb.put(5, "F");
               
        System.out.println("Cual es el conjutno de claves del mapa?: " + mapb.keySet());
                
        for(String valor: mapb.values()) {
            System.out.print("| "+ valor + " ");
        }
        System.out.println();
             
        System.out.println("Contiene la clave 5?: " + mapb.containsKey(5));
        System.out.println("Contiene la clave 11?: " + mapb.containsKey(11));
        
        
        System.out.println("Contiene el valor E?: " + mapb.containsValue("E"));
        System.out.println("Contiene el valor A?: " + mapb.containsValue("A"));
        
       
        System.out.println("Cual es el numero de elementos?: " + mapb.size());
        
       
        mapb.remove(1, "A");
        mapb.remove(5, "F");
              
        for(String valor: mapb.values()) {
            System.out.print("| "+ valor + " ");
        }
        System.out.println();
        
      
        System.out.println("Esta vacia?: " + mapb.isEmpty());
        
    
        System.out.println("Dame el valor de la clave 3: " + mapb.get(3));
        System.out.println("Dame el valor de la clave 4: " + mapb.get(5));
              
        System.out.println("Cuales son los valores de entrada del mapa?: " + mapb.entrySet());
               
        System.out.println("-----Reemplazar valores-----");
        mapb.replace(1, "F");
        mapb.replace(2, "G");
        mapb.replace(3, "H");
        mapb.replace(4, "I");
        mapb.replace(5, "J");
                
        
        for(String valor: mapb.values()) {
            System.out.print("| "+ valor + " ");
        }
        System.out.println();
        
        
        mapb.clear();
        System.out.println("-----Limpiar valores-----");
        
       
        System.out.println("Esta vacia?: " + mapb.isEmpty());
        System.out.println();
        System.out.println();  
               
        System.out.println("/****LinkedHashMap****/");
               
        System.out.println("Esta vacia?: " + mapa.isEmpty());
               
        mapa.put("biblioteca", "libro");
        mapa.put("escuela", "alumno");
        mapa.put("trabajo", "Empleado");
                     
        System.out.println("Cual es el conjutno de claves del mapa?: " + mapa.keySet());
        
        
       
        for(String valor: mapa.values()) {
            System.out.println("-->  "+ valor + " ");
        }
                              
        System.out.println("Cual es el numero de elementos?: " + mapa.size());
        
       
        mapa.remove("biblioteca", "libro");
                    
        for(String valor: mapa.values()) {
            System.out.println("-->  "+ valor + " ");
        }
        
       
        System.out.println("Esta vacia?: " + mapa.isEmpty());
                
       
        System.out.println("Cuales son los valores de entrada del mapa?: " + mapa.entrySet());
        
     
        mapa.clear();
        System.out.println("-----Limpiar valores-----");
        
       
        mapa.put("A", "B");
        mapa.put("AB", "BA");
        mapa.put("Ba", "Ab");
                               
        for(String valor: mapa.values()) {
            System.out.println("-->  "+ valor + " ");
        }
        
      
        System.out.println("Esta vacia?: " + mapa.isEmpty());
        
       
        
    }
    
}
        
    
            
    

