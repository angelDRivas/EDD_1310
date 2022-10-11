/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.ligada;

/**
 *
 * @author angel
 */
public class index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaLigada<Integer> lista = new ListaLigada<>();
        System.out.println(lista);
        System.out.println("______________________________________________________________________________________________________");
        System.out.println("¿La lista esta vacia?:   "+ lista.nada());
        System.out.println("______________________________________________________________________________________________________");
        System.out.println("El tamaño de la lista es igual a:\t "+ lista.size);
        System.out.println("_____________________________________INSERTAR_AL_INICIO_______________________________________________");
        System.out.println("Insertar en el inicio el valor 1");
        lista.insertarPrincipio(1);
        System.out.println(lista);
        System.out.println("Insertar en el inicio el valor 2");
        lista.insertarPrincipio(2);
        System.out.println(lista);
        System.out.println("Insertar en el inicio el valor 3");
        lista.insertarPrincipio(3);
        System.out.println(lista); 
        
        System.out.println("_____________________________________INSERTAR_AL_FINAL________________________________________________");        
        
        System.out.println("Insertar en el final el valor 4");
        lista.insertarFinal(4);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 5");
        lista.insertarFinal(5);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 6");
        lista.insertarFinal(6);
        System.out.println(lista);
        
        System.out.println("_____________________________________INSERTAR_DESPUES_DE_UN_VALOR_____________________________________");  
        System.out.println("Insertar en el final el valor 10 despues de 1");
        lista.insertarSiguiente(1, 10);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 20 despues de 2");
        lista.insertarSiguiente(2, 20);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 30 despues de 3");
        lista.insertarSiguiente(3, 30);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 40 despues de 4");
        lista.insertarSiguiente(4, 40);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 50 despues de 5");
        lista.insertarSiguiente(5, 50);
        System.out.println(lista);
        System.out.println("Insertar en el final el valor 60 despues de 6");
        lista.insertarSiguiente(6, 60);
        System.out.println(lista);
        System.out.println("______________________________________________________________________________________________________"); 
        System.out.println("Eliminar el valor de la posicion numero 4");
        lista.eliminarPosicion(4);
        System.out.println(lista);
        System.out.println("Eliminar al principio");
        lista.EliminarPrincipio();
        System.out.println(lista);
        System.out.println("Elimiaremos al final");
        lista.EliminarUltimo();
        System.out.println(lista);
        System.out.println("______________________________________________________________________________________________________"); 
        System.out.println("Buscar el valor 30");
        System.out.println("Esta en la posición: "+ lista.buscar(50));
        System.out.println("______________________________________________________________________________________________________"); 
        System.out.println("Actualizar el valor 20 por el 2000");
        lista.Actualizar(20, 2000);
        System.out.println(lista);
        
        
        
        
        
        
        
    }
    
}