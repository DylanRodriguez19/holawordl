
package GenerarFactura;

import Model.Producto;
import java.util.ArrayList;

public class factura {
        ArrayList<Producto> lista= new ArrayList<>();
    Producto produ = new Producto();
     public double CalcularTotal(double valor){
        double total=produ.calcularImpuesto(valor);
         return total;
}
     public void agregar (Producto producto){
         lista.add(producto);
         System.out.println("PRODUCTO AGREGADO");
     }
     public void mostrar(){
         for (Producto producto1 : lista) {
             System.out.println("LA LISTA ES:"+ producto1);
         }
     }
     public void eliminar (Producto producto){
         lista.remove(producto);
     }
     public double PrecioSiniiva(){
         double total=0;
         for (Producto producto : lista) {
             total+=produ.getPrecio();
         }
         return total;
     }
     public double precioIva(){
         double total=0;
         Producto prod = new Producto();
         for (Producto producto : lista) {
             total= PrecioSiniiva()* prod.tasa_impuesto;
         }
         return total;
     }
     public double totalPagar(){
         double total=0;
         Producto prod = new Producto();
         for (Producto producto : lista) {
             total=PrecioSiniiva()+PrecioSiniiva()*prod.tasa_impuesto;
         }
         return total;
     }
}
