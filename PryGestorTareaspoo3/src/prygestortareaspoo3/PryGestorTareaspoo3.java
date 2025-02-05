
package prygestortareaspoo3;
import java.util.Scanner;

public class PryGestorTareaspoo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestor gestor = new Gestor();

        while (true) {
            System.out.println("\n Menu de Gestion de Tareas:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Completar tarea");
            System.out.println("5. Salir");
            System.out.print("\nSelecciona una opcion: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("\nIngresa el nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa la prioridad (1-5): ");
                    int prioridad = Integer.parseInt(scanner.nextLine());
                    gestor.agregarTarea(nombre, prioridad);
                    
                    break;
                case "2":
                    gestor.mostrarTareas();
                    break;
                case "3":
                    System.out.print("\nIngresa el nombre de la tarea a eliminar: ");
                    gestor.eliminarTarea(scanner.nextLine());
                    break;
                case "4":
                    System.out.print("\nIngresa el nombre de la tarea completada: ");
                    gestor.completarTarea(scanner.nextLine());
                    break;
                case "5":
                    System.out.println("\n Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("\n Opción no válida. Intentalo de nuevo.");
            }
        }
    }
}


    


    
