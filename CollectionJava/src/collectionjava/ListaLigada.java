/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionjava;

/**
 *
 * @author angel
 */
import java.util.Iterator;

public class ListaLigada<T> implements Iterable<T> {
    private class Nodo<T> {
        public T val;
        public Nodo<T> siguiente;
    }

    private Nodo<T> head;
    public ListaLigada(T startValue) {
        head = new Nodo<>();
        head.val = startValue;
    }

    public boolean Vacia() {
        return head == null;
    }

    public void ultimo(T valueToAdd) {
        if(Vacia()) {
            Primero(valueToAdd);
        } else {
            Nodo<T> current = head;
            while (current.siguiente != null) {
                current = current.siguiente;
            }
            Nodo<T> newNode = new Nodo<>();
            newNode.val = valueToAdd;
            current.siguiente = newNode;
        }
    }
    
    public void Primero(T valueToAdd) {
        Nodo<T> newNode = new Nodo<>();
        newNode.val = valueToAdd;
        newNode.siguiente = head;
        head = newNode;
    }
    
    public boolean has(T valueToSearch) {
        Nodo<T> current = head;
        while (current != null) {
            if (valueToSearch.equals(current.val)){
                return true;
            }
            current = current.siguiente;
        }
        return false;
    }

    public void refrescar(T valueToUpdate, T valeToReplace) {
        Nodo<T> current = head;
        while (current != null) {
            if (valueToUpdate.equals(current.val)){
                current.val = valeToReplace;
                return;
            }
            current = current.siguiente;
        }
    }
    public void remove(T valueToDelete) {
        if (!has(valueToDelete))
            return;
        Nodo<T> prev = null;
        Nodo<T> curr = head;
        while (curr != null && !valueToDelete.equals(curr.val)) {
            prev = curr;
            curr = curr.siguiente;
        }
        if (curr == head) {
            deleteFirst();
            return;
        }
        prev.siguiente = curr.siguiente;
    }

    public void deleteFirst() {
        if (!Vacia()) {
            head = head.siguiente;
        }
    }

    public void reverseListWhile() {
        Nodo<T> prev = null;
        Nodo<T> curr = head;
        while (curr != null) {
            Nodo<T> next = curr.siguiente;
            curr.siguiente = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public String toString(){
        String resultado = "";
        Nodo<T> current = head;
        while (current != null) {
            resultado += current.val + " -> ";
            current = current.siguiente;
        }
        resultado += "null";
        return resultado;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Nodo<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.val;
                current = current.siguiente;
                return value;
            }
        };
    }
}

