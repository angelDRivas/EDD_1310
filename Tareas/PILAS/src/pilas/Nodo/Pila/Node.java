/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas.Nodo.Pila;

/**
 *
 * @author angel
 */

    
    public class Node<T> {
    private Node<T> next;
    private T datos;
    

    public Node() {
    }
    public Node(T valor) {
        this.datos = valor;
    }
    public Node(T data, Node<T> next) {
        this.datos = data;
        this.next = next;
    }
    public void setData(T data) {
        this.datos = data;
    }
    public T getData() {
        return datos;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
       return "[" + datos + "| ]⮕ ";
    }
}
    

