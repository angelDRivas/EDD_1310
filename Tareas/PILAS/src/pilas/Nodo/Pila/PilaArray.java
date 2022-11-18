/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas.Nodo.Pila;

/**
 *
 * @author angel
 */
public class PilaArray<T> {
    private T[] Pila;
    private int top;

    public PilaArray(int size) {
        Pila = (T[]) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int longitud() {
        return top + 1;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T element = Pila[top];
        top--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return Pila[top];
    }

    public void push(T element) throws Exception {
        if (isFull()) {
            throw new Exception("Error");
        }
        top++;
        Pila[top] = element;
    }

    public boolean isFull() {
        return top == Pila.length - 1;
    }

    public String toString() {
        String stackString = "";
        for (int i = 0; i <= top; i++) {
            stackString += Pila[i] + " ⮕ ";
        }
        return stackString;
    }
}
;