/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author angel
 */
public class Queue<T> {
    
    private T[] Queue;
    private int frente,longitud, tail;

    public Queue(int tamanio) {
        
        Queue = (T[]) new Object[tamanio];
        frente = tail = -1;
        longitud = 0;
    }
    public boolean isEmpty() {
        return frente == -1;
    }
    public int length() {
        return longitud;
    }
    public T dequeue() {
        
        T element = null;
        if(!isEmpty()) {
            
            element = Queue[frente];
            
            if (frente == tail) {
                
                frente = tail = -1;
                
            } else {
                
                frente = move(frente);
                
            }
        }
        return element;
    }
    public T frente() {
        
        if (isEmpty()) {
            
            return null;
        }
        return Queue[frente];
        
    }
    public void enqueue(T element) throws Exception {
        
        if (!isFull()) {
            tail = move(tail);
            if (isEmpty()) {
                frente++;
            }
            
            Queue[tail] = element;
        }
        
        longitud++;
        
    }

    public boolean isFull() {
        return  move(tail) == frente;
    }

    private int move(int number) {
        
        return (number + 1) % Queue.length;
    }
    public String toString() {
        String result = "";
        if (!isEmpty()) {
            int aux = frente;
            do {
                
                result += Queue[aux] + " ";
                aux = move(aux);
                
            } while (aux != move(tail));
            
        } else {
            
            result += "null";
            
        }
        
        return result;
        
    }
  
    
}
