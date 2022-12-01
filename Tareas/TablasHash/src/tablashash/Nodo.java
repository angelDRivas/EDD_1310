/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

/**
 *
 * @author angel
 */
public class Nodo<T> {
    
     private T datos;
     private Nodo<T> siguiente;
     
     
    public Nodo<T> getNext() {
        
        return siguiente;
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
    
    public void setNext(Nodo<T> next) {
        
        this.siguiente = next;
    }
    
    public void setData(T data) {
        
        this.datos = data;
    }
    
    @Override
    public String toString() {
        return "|" + datos + "| > ";
        
    }
    
}

