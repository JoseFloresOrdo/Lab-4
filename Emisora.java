
public class Emisora {

    private String Nombre;
    private String Frase;
    private float Tipo;
    private boolean canal;
    
    public Emisora() {
        Nombre = "";
        Frase = "";
        Tipo = 0;
        canal= true;
        
    }

    public Emisora(String Nombre, String Frase, float Tipo, boolean canal) {
        this.Nombre = Nombre;
        this.Frase = Frase;
        this.Tipo = Tipo;
        this.canal= canal;
        
    }

    public boolean isCanal() {
        return this.canal;
    }

    public boolean getCanal() {
        return this.canal;
    }

    public void setCanal(boolean canal) {
        this.canal = canal;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFrase() {
        return this.Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    public float getTipo() {
        return this.Tipo;
    }

    public void setTipo(float Tipo) {
        this.Tipo = Tipo;
    }

 
    public String toString() {
        return Nombre+" "+Frase+" "+Tipo+" "+canal;
    }
    
}
