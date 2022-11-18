/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas.Nodo.Pila;

/**
 *
 * @author angel
 */
public class pilas {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws Exception {
     
        PilaNode<Integer> nodeStack = new PilaNode<>();
        System.out.println("Con nodos");
        System.out.println("¿Esta Vacia?: " + nodeStack.isEmpty());
        System.out.println("Numero de elementos en la pila: " + nodeStack.length());
        System.out.println("pop(): Saca el elemento del tope y lo regresa: " + nodeStack.pop());
        System.out.print(nodeStack);
        System.out.println(nodeStack);
        System.out.println("peek(): Consulta el elemento en el tope, sin sacarlo: " + nodeStack.peek());
        
        System.out.println("_____________________________");
        System.out.println("Agrega un elemento al tope de la estructura.");
        System.out.println("push(1)");
        nodeStack.push(1);
        System.out.println("push(2)");
        nodeStack.push(2);
        System.out.println("push(3)");
        nodeStack.push(3);
        System.out.println("_____________________________");
        
        
        PilaArray<Integer> arrayStack = new PilaArray<>(5);
        
        
        System.out.println("Arreglo con pilas");
        System.out.println("¿Esta vacia?: " + arrayStack.isEmpty());
        System.out.println("length(): " + arrayStack.longitud());
        System.out.println("push(1)");
        arrayStack.push(1);
        System.out.println("push(2)");
        arrayStack.push(2);
        System.out.println("push(3)");
        arrayStack.push(3);
        System.out.println("push(4)");
        arrayStack.push(4);
        System.out.println("push(5)");
        arrayStack.push(5);
        System.out.println("isFull(): " + arrayStack.isFull());
        System.out.println(arrayStack);
        System.out.println("peek(): " + arrayStack.peek());
        System.out.println("pop(): " + arrayStack.pop());
        System.out.println(arrayStack);
    }
    }
    
