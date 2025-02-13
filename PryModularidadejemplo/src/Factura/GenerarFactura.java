
package Factura;

import Impuesto.ConfigImpuesto;

public class GenerarFactura {
    ConfigImpuesto impuesto=new ConfigImpuesto();
    public double CalcularTotal(double valor){
        double total=impuesto.calcularImpuesto(valor);
         return total;
    }
   
}
