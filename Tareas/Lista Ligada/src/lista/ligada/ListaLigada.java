/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.ligada;

/**
 *
 * @author angel
 */


    /**
     * @param args the command line arguments
     */
    public class ListaLigada<T>{
    private node <T> head;
    public int size;
    
    /*public ListaLigada<T>{
} 
  */ 
    public boolean nada(){
    return this.head == null;
    }
    
    public int getSize(){
    int size = 0;
        node<T> curr = head;

        while(curr != null) {
            curr = curr.getSiguiente();
            size++;
        }
        return size;
    }
    
    public int buscar(T valor) {
        int indiceDePosicion = 0;
        node<T> recorer = head;
        while(recorer != null){
            if(recorer.getDato() == valor) {
                return indiceDePosicion;
            }
            recorer = recorer.getSiguiente();
            indiceDePosicion++;
        }
        return -1;
    }
    
    public void insertarPrincipio(T val){
     node<T> nuevoNode = new node<>(val, head);
        head = nuevoNode;
    }
    public void insertarSiguiente(T r, T val) {
        if(buscar(r) < 0) return;

        node<T> recorrer = head;
        while(recorrer.getSiguiente()!= null && recorrer.getDato() != r){
            recorrer = recorrer.getSiguiente();
        }
        node<T> newNode = new node<>(val, recorrer.getSiguiente());
        recorrer.setSiguiente(newNode);
    }
    public void insertarFinal(T val) {
        if(nada()) {
            node<T> nuevoNode = new node<>(val);
            head = nuevoNode;
            return;
        }
         node<T> recorrer = head;
        while(recorrer.getSiguiente()!= null){
            recorrer = recorrer.getSiguiente();
        }
        node<T> nuevoNode = new node<>(val );
        recorrer.setSiguiente(nuevoNode);
}      
     
      public void EliminarPrincipio() {
        if(nada()) return;
        head = head.getSiguiente();
    }
      
     public void eliminarPosicion(int index) {
        if(this.getSize()<= index || nada()|| index < 0) return;
        if(index == 0) {
            EliminarPrincipio();
            return;
        }
        int indexPosicion = 0;
        node<T> aNode = null;
        node<T> recorrer = head;

        while(recorrer.getSiguiente()!= null && indexPosicion < index){
            aNode =recorrer;
            recorrer = recorrer.getSiguiente();
            indexPosicion++;
        }
        aNode.setSiguiente(recorrer.getSiguiente());
     }
     public void EliminarUltimo() {
        if(nada()) return;
        if(getSize()== 1) {
            EliminarPrincipio();
            return;
        }
        node<T> previo = null;
        node<T> recorrido = head;
        while(recorrido.getSiguiente()!= null){
            previo = recorrido;
            recorrido= recorrido.getSiguiente();
        }
        previo.setSiguiente(null);
    }
     
     public void Actualizar(T a_buscar, T valor){
        if(buscar(a_buscar) < 0) return;

        node<T> recorrido = head;
        while(recorrido != null && recorrido.getDato() != a_buscar){
            recorrido = recorrido.getSiguiente();
        }
        if(recorrido.getDato() != a_buscar) return;
        recorrido.setDatos(valor);
    }
     
     @Override
    public String toString() {
        String ListaLigada = "";
        node<T> r = head;
        while(r != null){
            ListaLigada += r ;
           r = r .getSiguiente();
        }
        return ListaLigada;
    }
     
     
     
}
    

