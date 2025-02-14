package model;
public class MensajeModelo {
   public String Remitente,Destinario,Mensaje;

    public MensajeModelo(String Remitente, String Destinario, String Mensaje) {
        this.Remitente = Remitente;
        this.Destinario = Destinario;
        this.Mensaje = Mensaje;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public String getDestinario() {
        return Destinario;
    }

    public void setDestinario(String Destinario) {
        this.Destinario = Destinario;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    public String ObtenerMensaje(){
        return "De:"+Remitente+" -> Para: "+ Destinario+ "\n"+"Mensaje: "+ Mensaje;
    }
}
