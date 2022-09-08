/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author angel
 */
import Arreglo.arreglo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class nomina {
    private String nombreCompania;
    private arreglo<trabajador> empleados;
    private String rutaArchivo = "junio.dat";
    public static String SPLIT_ln = "\n";
    public static String SPLIT_coma = ",";

    public nomina(String rutaArchivo, String nombreCompania) throws IOException {
        this.nombreCompania = nombreCompania;
        this.rutaArchivo = rutaArchivo;
        int Ciclo = 0;
        String line, fileContent = "";
        BufferedReader bufferLectura = new BufferedReader(new FileReader(this.rutaArchivo));

        bufferLectura.readLine();
        while((line = bufferLectura.readLine()) != null) {
            fileContent += line + "\n";
            Ciclo++;
        }
        bufferLectura.close();

        String[] separadoPorSaltosDeLinea = fileContent.split(SPLIT_ln);

        empleados = new arreglo<>(Ciclo);

        for(int i = 0; i < separadoPorSaltosDeLinea.length; i++) {
            String[] lineaSeparadaPorComas = separadoPorSaltosDeLinea[i].split(SPLIT_coma);
            Trabajador trabajadorTemp = new Trabajador();
            trabajadorTemp.setNumTrabajador(parseInt(lineaSeparadaPorComas[0]));
            trabajadorTemp.setName(lineaSeparadaPorComas[1]);
            trabajadorTemp.setPaterno(lineaSeparadaPorComas[2]);
            trabajadorTemp.setMaterno(lineaSeparadaPorComas[3]);
            trabajadorTemp.setHrsExtra(parseInt(lineaSeparadaPorComas[4]));
            trabajadorTemp.setSBase(parseInt(lineaSeparadaPorComas[5]));
            trabajadorTemp.setAnioIngreso(parseInt(lineaSeparadaPorComas[6]));
            empleados.setObjeto(i, trabajadorTemp);
        }
    }

    public void calcularSueldo() {
        for(int i = 0; i < empleados.getLength(); i++){
            System.out.println(empleados.getItem(i));
            System.out.println("Sueldo total: " + empleados.getItem(i).calcularSueldo());
        }
    }

    public void obtenerMaxMin() {
        trabajador maxTrabajador = empleados.getItem(0);
        trabajador minTrabajador = empleados.getItem(0);
        for(trabajador currTrabajador : empleados) {
            if(currTrabajador.getAnioIngreso() > maxTrabajador.getAnioIngreso()) {
                maxTrabajador = currTrabajador;
            }
            if(currTrabajador.getAnioIngreso() < minTrabajador.getAnioIngreso()) {
                minTrabajador = currTrabajador;
            }
        }

        System.out.println("Trabajadores con mayor y menor antiguedad en : " + nombreCompania);
        System.out.println("Primer trabajador encontrado con la menor(-) antiguedad: ");
        System.out.println(minTrabajador);
        System.out.println("Primer trabajador encontrado con la mayor(+) antiguedad: ");
        System.out.println(maxTrabajador);
    }

    public static class Trabajador {

               
    private int numeroTrabajador;
    private String Name;
    private String Materno;
    private String Paterno;
    private int horasExtra;
    private double sueldoBase;
    private double Antiguedad;

    public Trabajador() {
    }

    public Trabajador(int numeroTrabajador, String Nombre, String Materno, String Paterno, int horasExtra, double sueldoBase, double Antiguedad) {
        this.numeroTrabajador = numeroTrabajador;
        this.Name = Nombre;
        this.Materno = Materno;
        this.Paterno = Paterno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.Antiguedad = Antiguedad;
    }

    public double getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(double Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return Name;
    }

    public void setName(String Nombre) {
        this.Name = Nombre;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHrsExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public static final double Monto_H_Extra = 276.5;
    public static final double Prestacion_Antiguedad =0.03;
    
    
    @Override
    public String toString(){
      String  D="Nombre " + this.Name + "Paterno " +this.Paterno
            + "Materno " + this.Materno;
     
        
    return "Numero Trabajador"+ this.numeroTrabajador + D + "horas Extra "+ this.horasExtra
            + "Sueldo Base "+ this.sueldoBase+"Antiguedad "+ this.Antiguedad;
    }
    
    public double calcularSueldo(){
    double total=0.0;
    total = sueldoBase + (Monto_H_Extra*horasExtra);
    return total;
    
    }

        private void setAnioIngreso(int parseInt) {
            
        }
    
}
    }

