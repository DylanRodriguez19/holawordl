package prymodularidadejemplo;

import Factura.GenerarFactura;
import Impuesto.ConfigImpuesto;

public class Prymodulo {
    public static void main(String[] args) {
        GenerarFactura factura= new GenerarFactura();
        ConfigImpuesto impuesto = new ConfigImpuesto();
        double subtotal=20.5;
        
        double total1=subtotal+factura.CalcularTotal(subtotal);
        System.out.println("EL SUBTOTAL ES: "+ subtotal);
        System.out.println("EL IMPUESTO DE "+impuesto.tasa_impuesto +" QUE SE OBTIENE DEL SUBTOTAL ES: "+ factura.CalcularTotal(subtotal));
        System.out.println("EL TOTAL A PAGAR ES: "+total1);
                
    }
    
}
