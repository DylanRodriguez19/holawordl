
package Model;

import java.util.ArrayList;

public class Producto {

    String nombre;
    double precio;
    public double tasa_impuesto=0.15;
    public Producto() {
    }

    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double CalcularTotal(double a, double b){
        return a+b;
    }

    public double calcularImpuesto(double valor){
        return valor*tasa_impuesto;
    }
}
