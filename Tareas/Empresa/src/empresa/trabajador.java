/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author angel
 */
import java.util.Arrays;

public class trabajador {
    public static final double MONTO_H_EXTRA = 276.5;
    public static final double PRESTACION_ANUAL = 0.03;
    private int numeroTrabajador;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtra;
    private double sueldoBase;
    private int añoIngreso;


    public trabajador() {}

    public trabajador(
            int numeroTrabajador,
            String nombre,
            String paterno,
            String materno,
            int horasExtra,
            double sueldoBase,
            int anioIngreso
    ){
        this.numeroTrabajador = numeroTrabajador;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.añoIngreso = anioIngreso;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return añoIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.añoIngreso = anioIngreso;
    }

    public double calcularSueldo(){
        double total = 0.0;
        total = sueldoBase;
        total += sueldoBase * ((2022 - añoIngreso) * PRESTACION_ANUAL);
        total += MONTO_H_EXTRA * horasExtra;
        return total;
    }

    @Override
    public String toString() {
        String data =  numeroTrabajador +
            ", Nombre " + nombre +
            " " + paterno +
            " " + materno +
            ", Horas extra " + horasExtra +
            ", Sueldo base " + sueldoBase +
            ", Año de ingreso " + añoIngreso;
        return data;
    }
}