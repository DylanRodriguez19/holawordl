package Controler;

import java.util.ArrayList;
import model.modeloVotaciones;

public class controladorVotaciones {
    int votoLui=0;
    int votoNo=0;
    int votoAndre=0;
    ArrayList<Integer> listaNo = new ArrayList<>();
    ArrayList<Integer> listaLui = new ArrayList<>();
    ArrayList<Integer> listaAndre = new ArrayList<>();
    
    public void RegistrarVotacionesNo(int votoNo){
        int resultado=0;    
            listaNo.add(votoNo);
                    resultado=votoNo+1;
            System.out.println("VOTO REGISTRADO");
        }
    public void RegistraVotoLui(int votoLui){
        int resultado=0;    
            listaLui.add(votoLui);
            resultado=votoLui+1;
            System.out.println("VOTO REGISTRADO");
        }
    public void RegistrarVotoAndre(int votoAndre){
        int resultado=0;    
        listaAndre.add(votoAndre);
                resultado=votoAndre+1;
        System.out.println("VOTO REGISTRADO");
    }
    public int MostrarNo(int voto){
        listaNo.size();
        return voto;
    }
    public int MostrarLui(int voto){
        listaLui.size();
        return voto;
    }
    public int MostrarAndre(int voto){
        listaAndre.size();
        return voto;
    }
    public void Resultado(){
        if(votoNo>votoLui||votoNo>votoAndre){
            System.out.println("MAS VOTANTES ES LUISA GONZALES CON: "+ listaNo.size());
        }else{
            System.out.println("LUISA CON:"+listaLui.size());
        }
        if(votoLui>votoAndre||votoLui>votoNo){
            System.out.println("MAS VOTANTES ES LUISA GONZALES CON: "+ listaLui.size());
        }else{
            System.out.println("ANDREA CON: "+listaAndre.size());
        }
        if(votoAndre>votoLui||votoAndre>votoNo){
            System.out.println("MAS VOTANTES ES LUISA GONZALES CON: "+ listaAndre.size());
        }else{
            System.out.println("NOBOA CON: "+ listaNo.size());
        }
    }
   public double PorNo(){
       int total=(listaAndre.size()+listaLui.size()+listaNo.size());
       double porce=(listaNo.size()/total)*100;
       System.out.println("NOBOA CON EL:"+ porce+"%");
       return porce;
   } 
   public double PorLui(){
       int total=(listaAndre.size()+listaLui.size()+listaNo.size());
       double porce=(listaLui.size()/total)*100;
              System.out.println("LUISA CON EL:"+ porce+"%");
              return porce;
   }
   public double PorAndre(){
       int total=(listaAndre.size()+listaLui.size()+listaNo.size());
       double porce=(listaAndre.size()/total)*100;
              System.out.println("ANDREA CON EL:"+ porce+"%");
              return porce;
   }
}
