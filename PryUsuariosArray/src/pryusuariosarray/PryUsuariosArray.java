
package pryusuariosarray;

import java.util.Scanner;
public class PryUsuariosArray {

    /*
    INGRESE CANTIDAD QUE QUIERE INGRESAR
    ingresar el nombre del estudiante 1: "";
    ingresar la nota del estudiante 1: ;
    
    opcion 1: consultar notas de sexo Masculino
    opccion 2: consultar notas de sexo Femenino
    
            */
    public static void main(String[] args) {
        USUARIOREPORTES reporte = new USUARIOREPORTES();
    int caso=0;
   
    do{
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("GESTOR DE NOTAS USUARIOS");
        System.out.println("1. AGREGAR USUARIOS");
        System.out.println("2. PROMEDIO MASCULINO");
        System.out.println("3. PROMEDIO FEMENINO");
        System.out.println("4. SALIR DEL PROGRAMA");
        scanner.nextInt();
        switch (caso){
            case 1:
                System.out.println("ESCRIBA EL NOMBRE DEL USUARIO");
                String nombre=scanner.nextLine();
                    reporte.agregarUsuario(nombre);
                System.out.println("ESCRIBA LA NOTA DEL USUARIO");
                int nota=scanner.nextInt();
                reporte.agregarNota(nota);
                System.out.println("ESCRIBA EL SEXO DEL USUARIO");
                boolean sexo= scanner.nextBoolean();
                reporte.agregarSexo(sexo);
                    System.out.println("USUARIO AGREGADO CORRECTAMENTE");
                    break;
            case 2:
                consultarNotasMasculino();
                break;
            case 3:
                consultarNotasFemenino();
                break;
            case 4:
                System.out.println("Saliendo del programa");
               scanner.close();
               break;
        }
        break;
    }
    
    while(caso!=4);
    } 
            
    
    
        
    }
    


