
package metodobiseccion;

/**
 *
 * @author angel
 */
public class Proceso {
    
    private fx FX;
    double x;
    int Iterador;
    
    public Proceso(){}
    
    public Proceso(String expresion){
        FX = new fx(expresion);
    }
    
    public void setFuncion(String expresion){
        FX = new fx(expresion);
    }
    
    public double biseccion(double x1, double x2, double xr){
        this.x = Double.NaN;
        this.Iterador = 0;
        
        double evaA = this.FX.evaluar(x1);
        
        if (!Double.isNaN(evaA)) {
            double evaB = this.FX.evaluar(x2);
            
            if(evaA * evaB < 0){
                
                do {    
                    this.x = (x1+x2) / 2;
                    this.Iterador++;
                    evaA = this.FX.evaluar(x1);
                    evaB = this.FX.evaluar(x2);
                    
                    if(evaA * this.FX.evaluar(x) < 0){
                        x2 = this.x;
                    }else{
                        x1 = this.x;
                    }
                    
                } while (Math.abs(this.FX.evaluar(x)) > xr);
                                
            }
            
            if(!Double.isNaN(this.x)){
                return this.x;
            }
                        
        }
        
            return Double.NaN;
    }
    
}
