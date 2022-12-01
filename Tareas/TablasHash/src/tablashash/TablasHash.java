/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author angel
 */
public class TablasHash<K,T,V> {
private class valor {
    
        public K llave;
        public V val;
        public int hash;
       
        public valor(K key, V value) {
            this.llave = key;
            this.val = value;
            this.hash = key.hashCode();
        }

        @Override
        public boolean equals(Object otherEntry) {
            valor other = (valor) otherEntry;
            if(this.hash != other.hash) return false;
            return this.llave.equals(other.llave);
        }
    }
    private double maxLoadFactor;
    private int tamano = 0;
    private int espacio;
    private ListaLigada <valor> [] tabla;
    private static final int DEFAULT_CAPACITY = 3;
    private static final double DEFAULT_LOAD_FACTOR = 0.667;
    private int t;
   

    public HashtableSC(double maxLoadFactor, int capacity) {
        if(maxLoadFactor >= 1 && maxLoadFactor > 0) {
            this.maxLoadFactor = DEFAULT_LOAD_FACTOR;
        } else {
            this.maxLoadFactor = Double.max(DEFAULT_LOAD_FACTOR, maxLoadFactor);
        }
        this.espacio = Integer.max(DEFAULT_CAPACITY, capacity);
        t = (int) (maxLoadFactor * capacity);
        tabla = new ListaLigada[capacity];
    }
    public int table_size() {
        return tamano;
    }

    public void clear() {
        for(ListaLigada<valor> bucket: tabla) {
            bucket = null;
        }
        tamano = 0;
    }
    public boolean Vacia() {
        return tamano == 0;
    }
    private int normalizeIndex(int hashKey) {
        return (hashKey & 0x7FFFFFFF) % espacio;
    }

    public void add(K key, V value) {
        if(tamano >= t) {
            tamanoN();
        }
        valor dato = new valor(key, value);
        int indice = normalizeIndex(dato.hash);
        if (tabla[indice] == null) {
            tabla[indice] = new ListaLigada<>();
            tabla[indice].Primero(dato);
            tamano++;
        } else {
           if (tabla[indice].has(dato)) {
                tabla[indice].refrescar(dato, dato);
                }else {
                tabla[indice].Primero(dato);
                tamano++;
            }
        }
    }
    public boolean hasKey(K keyToSearch) {
        int bucketIndex = normalizeIndex(keyToSearch.hashCode());
        for (valor element: tabla[bucketIndex]) {
            if ((element.hash == keyToSearch.hashCode())
                    && keyToSearch.equals(element.llave)) return true;
        }
        return false;
    }
    private void tamanoN() {
        espacio = espacio*2;
        t = (int)(espacio * maxLoadFactor);
        ListaLigada<valor>[] oldTable = tabla;
        tabla = new ListaLigada[espacio];
        tamano = 0;
        for (ListaLigada<valor> bucket: oldTable) {
            if (bucket != null){
                for (valor element: bucket) {
                    add(element.llave, element.val);
                }
            }
        }
    }
    public V get(K keyToSearch) {
        int bucketIndex = normalizeIndex(keyToSearch.hashCode());
        for (valor element: tabla[bucketIndex]) {
            if ((element.hash == keyToSearch.hashCode())
                    && keyToSearch.equals(element.llave)) return element.val;
        }
        return null;
    }
    public ListaLigada<K> keys() {
        ListaLigada<K> listOfKeys = new ListaLigada<>();
        for (ListaLigada<valor> bucket: tabla)
            if (bucket != null)
                for (valor element: bucket)
                    listOfKeys.Primero(element.llave);
        return listOfKeys;
    }
    public ListaLigada<V> valueOf() {
        ListaLigada<V> listOfValues = new ListaLigada<>();
        for (ListaLigada<valor> bucket: tabla)
            if (bucket != null)
                for (valor element: bucket)
                    listOfValues.Primero(element.val);
        return listOfValues;
    }
    public void remove(K keyToRemove) {
        valor aux = new valor(keyToRemove, null);
        if(hasKey(keyToRemove)) {
            int bucketIndex = normalizeIndex(aux.hash);
            tabla[bucketIndex].remove(aux);
            tamano--;
        }
    }
}
