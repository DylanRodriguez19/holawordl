package pryusuariosarray;
public class USUARIO {
    String nombre;
    double nota;
    boolean sexo;
    

    public USUARIO(String nombre, double nota, boolean sexo) {
        this.nombre = nombre;
        this.nota = nota;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public void promedioM(){
        if(sexo=true){
            double promedioM=0;
            for (int i=0; i<nota;i++){
                promedioM+=i;
                System.out.println("EL PROMEDIO MASCULINO ES: "+promedioM);
            }
        }
    }
    public void promedioF(){
        if(sexo=false){
            double promedioF=0;
            for (int i=0; i<nota;i++){
                promedioF+=i;
                System.out.println("EL PROMEDIO MASCULINO ES: "+promedioF);
            }
        }
    }
    public void consultarNotasMasculino(){
        if(sexo=true){
            promedioM();
            
        }
    }
    public void consultarNotasFemenino(){
        if(sexo=false){
            promedioF();
        }
    }
}
