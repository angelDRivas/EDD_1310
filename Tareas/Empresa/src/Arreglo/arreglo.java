/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglo;


import empresa.nomina;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author angel
 */
@SuppressWarnings("unchecked")
public class arreglo<T> implements Iterable<T> {
    private T[] data;
    private int size;

    public arreglo(int size) {
        this.size = size;
        data = (T[]) new Object[size];
    }

    public T getItem(int index) throws ArrayIndexOutOfBoundsException {
        if(index >= this.size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index, out of bounds");
        }
        return data[index];
    }

    public void setItem(int index, T value) throws ArrayIndexOutOfBoundsException {
        if(index >= this.size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid index, out of bounds");
        }
        data[index] = value;
    }

    public int getLength() {
        return this.size;
    }

    public void clear(T value) {
        for(int i = 0; i < size; i++) {
            data[i] = value;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return data[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public void setObjeto(int i, nomina.Trabajador trabajadorTemp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}