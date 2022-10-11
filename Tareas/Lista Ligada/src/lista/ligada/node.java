/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.ligada;

/**
 *
 * @author angel
 */
     public class node <T> {
       public T datos;
       public node<T> siguiente;
     
     public node(T val ) {
         this.datos= val;
    }
     
     public node(T dato, node<T> siguiente){
     this.datos = dato;
     this.siguiente = siguiente;

     }    
    public node<T> getSiguiente() {
        return siguiente;
    }
     
       public T getDato() {
        return datos;
    }

     public void setDatos(T dato) {
        this.datos = dato;
    }
     
    public void setSiguiente(node<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "[" + datos + "| ]⮕ ";
    }
     
    
    
}
