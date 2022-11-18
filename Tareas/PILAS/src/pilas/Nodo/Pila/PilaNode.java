/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas.Nodo.Pila;

/**
 *
 * @author angel
 */
public class PilaNode<T> {
    private Node<T> top;
    private int length;

    public PilaNode() {
        top = null;
        length = 0;
    }

    public boolean isEmpty() {
        return top == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }

        T topValue = top.getData();
        top = top.getNext();
        return topValue;
    }

    public T peek() {
        if(isEmpty()) {
            return null;
        }

        length--;
        return top.getData();
    }

    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.setNext(top);
        top = newNode;
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Node<T> iteratorNode = top;
        while(iteratorNode != null){
            stackString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return stackString;
    }
}
