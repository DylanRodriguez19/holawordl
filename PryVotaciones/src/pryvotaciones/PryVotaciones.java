package pryvotaciones;

import Controler.controladorVotaciones;
import java.util.Scanner;

public class PryVotaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        controladorVotaciones votos = new controladorVotaciones();
        Scanner entrada = new Scanner(System.in); 
int opcion =0;
do{
   
    System.out.println("Ingresar su nombre y apellido");
    String nombre= scanner.nextLine();
    System.out.println("Ingresar su cedula");
    int cedula= scanner.nextInt();
    System.out.println("Elija por quien va a votar");
    System.out.println("1. DANIEL NOBOA PARTIDO ADN");
    System.out.println("2. LUISA GONZALES PARTIDO R5");
    System.out.println("3. ANDREA GONZALES PARTIDO PSC");
    System.out.println("4. SALIR DE LA VOTACION");
    opcion= entrada.nextInt();   
   entrada.nextLine(); 
switch(opcion){   
    case 1:
        int votoNo= scanner.nextInt();
        votos.MostrarNo(votoNo);
        votos.RegistrarVotacionesNo(votoNo);
break;

    case 2:
      int votoLui = scanner.nextInt();
      votos.MostrarLui(votoLui);
      votos.RegistraVotoLui(votoLui);
break;

    case 3:
        int votoAndre = scanner.nextInt();
        votos.MostrarAndre(votoAndre);
        votos.RegistrarVotoAndre(votoAndre);
        break;
    case 4:
       votos.Resultado();
       votos.PorNo();
       votos.PorLui();
       votos.PorAndre();
        break;
    
}
}
while(opcion!=4);
        
    }
    }
    

