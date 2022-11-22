/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template=
 */

package colas;


/**
 *
 * @author angel
 */

public class Colas {
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        
        // TODO code application logic here
        
        QueueNodo<Integer> nodoQueue = new QueueNodo<>();
        
        System.out.println("QueueNode");
        System.out.println("¿Esta vacia?: " + nodoQueue.isEmpty());
        
        System.out.println("enqueue(1)");
        nodoQueue.enqueue(1);
        System.out.println("enqueue(2)");
        nodoQueue.enqueue(2);
        System.out.println("enqueue(3)");
        nodoQueue.enqueue(3);
        
        System.out.println(nodoQueue);
        
        System.out.println("length: " + nodoQueue.length());
        System.out.println("¿Esta vacia?: " + nodoQueue.isEmpty());
        System.out.println("front: " + nodoQueue.front());
        System.out.println("dequeue: " + nodoQueue.dequeue());
        System.out.println("dequeue: " + nodoQueue.dequeue());
        System.out.println("dequeue: " + nodoQueue.dequeue());
        System.out.println("¿Esta vacia?: " + nodoQueue.isEmpty());

        Queue<Integer> aQueue = new Queue<>(5);
        
        System.out.println("QueueArreglo");
        System.out.println("¿Esta vacia?: " + aQueue.isEmpty());
        System.out.println("enqueue(1)");
        aQueue.enqueue(1);
        System.out.println("enqueue(2)");
        aQueue.enqueue(2);
        System.out.println("enqueue(3)");
        aQueue.enqueue(3);
        
        System.out.println(aQueue);
        
        System.out.println("¿Esta vacia?: " + aQueue.isEmpty());
        System.out.println("longitud: " + aQueue.length());
        System.out.println("front: " + aQueue.frente());
        System.out.println("dequeue: " + aQueue.dequeue());
        System.out.println("dequeue: " + aQueue.dequeue());
        System.out.println("dequeue: " + aQueue.dequeue());
        System.out.println("¿esta vacia?: " + aQueue.isEmpty());
        
    }
  
    
}
