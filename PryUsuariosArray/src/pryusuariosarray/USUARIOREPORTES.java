package pryusuariosarray;
import java.util.ArrayList;

public class USUARIOREPORTES {
    ArrayList<USUARIO> lista= new ArrayList();

    public USUARIOREPORTES() {
    }
  
    
    public void agregarUsuario( USUARIO a ){
        lista.add(a);
        System.out.println("USUARIO AGREGADO");
    }
    

    
}
