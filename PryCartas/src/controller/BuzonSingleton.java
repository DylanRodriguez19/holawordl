package controller;

import java.util.ArrayList;
import java.util.List;
import model.MensajeModelo;

public class BuzonSingleton {
    private static BuzonSingleton instancia;
    private List<MensajeModelo> mensajes;
    private BuzonSingleton() {
        mensajes = new ArrayList<>();
    }
     public static BuzonSingleton getInstancia(){
         if (instancia==null){
             instancia= new BuzonSingleton();
         }
    return instancia;
}
     
     public void AgregarMensaje(String Remitente, String Destinario, String Mensaje){
         mensajes.add(new MensajeModelo(Remitente, Destinario, Mensaje));
     }
     public List<MensajeModelo> MostarMensaje(){
         return mensajes;
     }
     
    
}
