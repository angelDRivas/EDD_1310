package metodobiseccion;

import org.nfunk.jep.JEP;

/**
 *
 * @author angel
 */
public class fx {
    
    private String fx = "";
    
    
    public fx(String expresion){
        this.fx = expresion;
    }
    
    public double evaluar(double x){  
       JEP j = new JEP(); 
       j.addStandardFunctions();
       j.addStandardConstants();
       j.addVariable("x", x);
       j.parseExpression(this.fx);
       
        if (!j.hasError()) {
            return j.getValue();
        } else {
            return Double.NaN;
        }           
    }
    
}
