/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author angel
 * @param <T>
 */
public class Nodo<T> {
    
    private T datos;
    private Nodo<T> siguiente;

    public Nodo() {
    }
    public Nodo(T valor) {
        this.datos = valor;
    }
    public Nodo(T data, Nodo<T> next) {
        this.datos = data;
        this.siguiente = next;
    }
    public T getData() {
        return datos;
    }
    public void setData(T data) {
        this.datos = data;
    }
    public Nodo<T> getNext() {
        return siguiente;
    }

    public void setNext(Nodo<T> next) {
        this.siguiente = next;
    }
    @Override
    public String toString() {
        return "|" + datos + "| ⮕ ";
    }  
}

