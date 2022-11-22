/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author angel
 */
public class QueueNodo<T> {
    
    private Nodo<T> frente;
    private Nodo<T> volver;
    private int longitud;

    public QueueNodo() {
        frente = volver = null;
        longitud = 0;
    }

    public boolean isEmpty() {
        return frente == null && longitud == 0;
    }

    public int length() {
        return longitud;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }
        if(frente == volver) {
            volver = null;
        }
        T topValue = frente.getData();
        frente = frente.getNext();
        longitud--;
        return topValue;
    }

    public T front() {
        if(isEmpty()) {
            return null;
        }
        return frente.getData();
    }

    public void enqueue(T value) {
        Nodo<T> nuevoNodo = new Nodo<T>(value);
        if(isEmpty()) {
            frente = volver = nuevoNodo;
        } else {
            volver.setNext(nuevoNodo);
            volver = nuevoNodo;
        }
        longitud++;
    }
    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> iNodo = frente;
        while(iNodo!= null){
            stackString += iNodo;
            iNodo = iNodo.getNext();
        }
        return stackString;
    }  
}
