/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntosADT;



import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class ConjuntoADT<T> implements Iterable<T> {
    
    ArrayList<T> Elementos = new ArrayList<>();
    
    public int longitud() {
        return Elementos.size();
    }
        
    public boolean contiene(T value) {
        return Elementos.indexOf(value) != -1;
    }
    
    public void add(T value) {
        if(!contiene(value)) {
            Elementos.add(value);
        }
    }
    
    public void eliminar(T value) {
        Elementos.remove(value);
    }

    public boolean equals(ConjuntoADT<T> other) {
        if(longitud() != other.longitud()) {
            return false;
        }
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(Elementos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubconjunto(ConjuntoADT<T> other) {
        if(longitud() > other.longitud()){
            return false;
        }
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(Elementos.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void union(ConjuntoADT<T> other) {
        for(int i = 0; i < other.longitud(); i++) {
            add(other.Elementos.get(i));
        }
    }

    public ConjuntoADT<T> intersection(ConjuntoADT<T> other) {
        ConjuntoADT<T> result = new ConjuntoADT();
        for(int i = 0; i < longitud(); i++) {
            if(other.contiene(Elementos.get(i))) {
                result.add(Elementos.get(i));
            }
        }
        return result;
    }

    public ConjuntoADT<T> diferencia(ConjuntoADT<T> other) {
        ConjuntoADT<T> resultado = new ConjuntoADT();
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(Elementos.get(i))) {
                resultado.add(Elementos.get(i));
            }
        }
        for(int i = 0; i < other.longitud(); i++) {
            if(!contiene(other.Elementos.get(i))) {
                resultado.add(other.Elementos.get(i));
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return Elementos.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int indice = 0;

            @Override
            public boolean hasNext() {
                return indice < Elementos.size();
            }

            @Override
            public T next() {
                return Elementos.get(indice++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
}