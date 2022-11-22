/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package colasdeprioridadacotada;


import java.util.ArrayList;


/**
 *
 * @author angel
 */
public class ColasADT<T> {
    
    ArrayList<T> ColaADT;
    
    public ColasADT(){
        ColaADT = new ArrayList<>();
    }
    
    public boolean EstaVacia(){
        return ColaADT.isEmpty();
    }
    
    public int length(){
        return ColaADT.size();
    }
    
    public void enqueue (T element){
        ColaADT.add(element);
    }
    
    public T dequeue(){
        T eliminado = ColaADT.get(ColaADT.size());
        ColaADT.remove(ColaADT.size());
        return eliminado;
    }
    
    @Override
    public String toString(){
    String edo = "";
    for (T datos: ColaADT){
        edo+= datos;
    }
    
    return edo;
    
    
    }
   
    
}
