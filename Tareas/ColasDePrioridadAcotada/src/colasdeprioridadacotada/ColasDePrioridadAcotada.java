/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasdeprioridadacotada;

/**
 *
 * @author angel
 */
public class ColasDePrioridadAcotada {

    public static void main(String[] args) {
        BoundedPriorityQueue <String> Titanic = new BoundedPriorityQueue<String>(6);
        Titanic.EstaVacia();
        Titanic.length();
        Titanic.enqueue(1, "Niñas");
        Titanic.enqueue(2, "Niños");
        Titanic.enqueue(2, "3era edad");
        Titanic.enqueue(3, "Mujeres");
        Titanic.enqueue(4, "Hombres");
        Titanic.enqueue(5, "Empleados");
        Titanic.enqueue(5, "Mecanicos");
        Titanic.enqueue(5, "Capitan");
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.dequeue();
        Titanic.toString();
    }
}
