package pryproductos;

import GenerarFactura.factura;
import Model.Producto;
import java.util.Scanner;

public class PryProductos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        factura fac = new factura();
        Producto produc=new Producto();
        
        double subTotal=0;
        
        int opcion =0;
        
       do{

           System.out.println("*MENU*");    
           System.out.println("1. Ingresar un producto (nombre, precio)");
           System.out.println("2. Mostrar la lista de productos");
           System.out.println("3. Terminar el programa");
           System.out.print("ENTRADA: ");
           opcion=scanner.nextInt();
           scanner.nextLine();
           switch (opcion){
            case 1 -> {
                System.out.println("INGRESE EL NOMBRE DEL PRODUCTO");
                String nombre= scanner.nextLine();
                System.out.println("INGRESE EL PRECION DEL PRODUCTO");
                double precio= scanner.nextDouble();
                Producto produc1=new Producto(nombre,precio);
                fac.agregar(produc1);
                }
            case 2 -> {
                fac.mostrar();
                System.out.println("EL SUBTOTAL ES: "+ fac.PrecioSiniiva());
                System.out.println("EL IMPUESTO DE "+produc.tasa_impuesto +" QUE SE OBTIENE DEL SUBTOTAL ES: "+ fac.precioIva());
                System.out.println("EL TOTAL A PAGAR ES: "+fac.totalPagar());
                }
            case 3 -> System.out.println("SALIENDO DEL PROGRAMA");
           }
    }while(opcion!=4);
       }
    
}
