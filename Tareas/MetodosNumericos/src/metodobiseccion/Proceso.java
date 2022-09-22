
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
        
        double evaX1 = this.FX.evaluar(x1);
        
        if (!Double.isNaN(evaX1)) {
            double evaX2 = this.FX.evaluar(x2);
            
            if(evaX1 * evaX2 < 0){
                
                do {    
                    this.x = (x1+x2) / 2;
                    this.Iterador++;
                    evaX1 = this.FX.evaluar(x1);
                    evaX2 = this.FX.evaluar(x2);
                    
                    if(evaX1 * this.FX.evaluar(x) < 0){
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
