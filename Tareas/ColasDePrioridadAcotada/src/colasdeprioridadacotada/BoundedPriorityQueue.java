/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasdeprioridadacotada;

import java.util.ArrayList;

/**
 *
 * @author angel
 * @param <T>
 */
public class BoundedPriorityQueue <T> extends ColasADT<T>{
    
    ArrayList<T> ColaDePrioridadAcotada;
    ColasADT<T> ColaI;
    T extraer;
    
    public BoundedPriorityQueue(){
        
        super.dequeue();
        super.EstaVacia();
        super.length();
        ColaI = new ColasADT<>();
        ColaDePrioridadAcotada = new ArrayList<>();
        
        for (int i = 0; i<6; i++){
            
            ColaDePrioridadAcotada.add((T) ColaI);
        }
    }

    BoundedPriorityQueue(int i) {
        int val;
    }
    
    public void enqueue(int prioridad, T elemento){
        ColaDePrioridadAcotada.add(prioridad, elemento);
    }

    /**
     *
     */
    @Override
    public void dequeue(){
        ColaDePrioridadAcotada.remove(extraer);
        T sacadointerno= ColaDePrioridadAcotada.get(0);
        sacadointerno.dequeue();
    }
}
