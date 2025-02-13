
package Impuesto;

public class ConfigImpuesto {
    public double tasa_impuesto=0.15;
    public double calcularImpuesto(double valor){
        return valor*tasa_impuesto;
    }
            
}
