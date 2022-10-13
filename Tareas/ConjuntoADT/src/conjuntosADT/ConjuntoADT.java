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

    public ConjuntoADT() {
    }
    
    public int longitud() {
        return Elementos.size();
    }
        
    
    public void agregar(T value) {
        if(!contiene(value)) {
            Elementos.add(value);
        }
    }
    public boolean contiene(T value) {
        return Elementos.indexOf(value) != -1;
    }
    public void eliminar(T value) {
        Elementos.remove(value);
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
            agregar(other.Elementos.get(i));
        }
    }


    public ConjuntoADT<T> diferencia(ConjuntoADT<T> other) {
        ConjuntoADT<T> resultado = new ConjuntoADT();
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(Elementos.get(i))) {
                resultado.agregar(Elementos.get(i));
            }
        }
        for(int i = 0; i < other.longitud(); i++) {
            if(!contiene(other.Elementos.get(i))) {
                resultado.agregar(other.Elementos.get(i));
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
            int indiceVal = 0;
            @Override
            public boolean hasNext() {
                return indiceVal < Elementos.size();
            }
            @Override
            public T next() {
                return Elementos.get(indiceVal++);
            }
            @Override
            public void remove() {               
            }
        };
    }
    
}