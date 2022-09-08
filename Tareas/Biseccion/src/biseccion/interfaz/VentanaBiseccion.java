/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biseccion.interfaz;

import org.nfunk.jep.JEP;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author angel
 */
public class VentanaBiseccion extends JFrame{
    private Funcion fun;
    double x;
    int contador;
    FlowLayout Etiqueta;
    JTextField  funcion;
    JTextField Ls;
    JTextField Li;
    JTextField λ ;
    JTextField resultado;
    JLabel funt;
    JLabel Lst;
    JLabel Lit;
    JLabel λt;
    JButton calcular;
    
    public VentanaBiseccion(String expresion){
        fun = new Funcion(expresion);
    }
    
    private void setFuncion(JTextField funcion) {
      
        fun = new Funcion(funcion);
    }
        
    

    public VentanaBiseccion() throws HeadlessException{
        
        funcion = new JTextField(30);
        Ls = new JTextField(15);
        Li = new JTextField(15);
        λ = new JTextField(15);
        resultado = new JTextField(10);
        funt = new JLabel("Función");
        Lst = new JLabel("Limite Superior");
        Lit = new JLabel("Limite inferior");
        λt = new JLabel("λ");
        calcular = new JButton("Calcular");
        setTitle("METODOS NUMERICOS");
        Etiqueta = new FlowLayout();
        this.setLayout(Etiqueta);
        this.getContentPane().add(funt);
        this.getContentPane().add(funcion);
        this.getContentPane().add(Lit);
        this.getContentPane().add(Li);
        this.getContentPane().add(Lst);
        this.getContentPane().add(Ls);
        this.getContentPane().add(λt);
        this.getContentPane().add(λ);
        this.getContentPane().add(calcular);
        this.getContentPane().add(resultado);
        
        this.addWindowListener(new WindowAdapter() {
 
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
               
            }
        });
        
        this.calcular.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                 String Funcion = funcion.getText();
            double li, ls, to;
        
            li = Double.parseDouble(Li.getText());
            ls = Double.parseDouble(Ls.getText());
            to = Double.parseDouble(λ.getText());
        
            VentanaBiseccion metodo = new VentanaBiseccion();
        
            metodo.setFuncion(funcion);
            double raiz = metodo.biseccion(li, ls, to);
            resultado.setText(raiz + "");
                
                
        }
        
        
  
        });
            
        }
    
    
    public double biseccion(double a, double b, double t){
        
        this.x = Double.NaN;
        this.contador = 0;
        
        double evaA = this.fun.evaluar(a);
        
        if (!Double.isNaN(evaA)) {
            double evaB = this.fun.evaluar(b);
            
            if(evaA * evaB < 0){
                
                do {    
                    this.x = (a+b) / 2;
                    this.contador++;
                    evaA = this.fun.evaluar(a);
                    evaB = this.fun.evaluar(b);
                    
                    if(evaA * this.fun.evaluar(x) < 0){
                        b = this.x;
                    }else{
                        a = this.x;
                    }
                    
                } while (Math.abs(this.fun.evaluar(x)) > t);
                
                
            }
            
            if(!Double.isNaN(this.x)){
                return this.x;
            }
                        
        }else{ System.out.println("No exixte Raiz en el intervalo");}
        
            return Double.NaN;
    }

    
    }
    


