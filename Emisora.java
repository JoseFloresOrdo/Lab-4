import java.util.ArrayList;
public class Emisora {

    private String Nombre;
    private String Frase;
    private float Tipo;
    private ArrayList<Cancion> Canciones;

    public Emisora() {
        Nombre = "";
        Frase = "";
        Tipo = 0;
        Canciones = new ArrayList<Cancion>();
    }

    public Emisora(String Nombre, String Frase, float Tipo, ArrayList<Cancion> Canciones) {
        this.Nombre = Nombre;
        this.Frase = Frase;
        this.Tipo = Tipo;
        this.Canciones = Canciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return this.Canciones;
    }

    public void setCanciones(ArrayList<Cancion> Canciones) {
        this.Canciones = Canciones;
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

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Frase='" + getFrase() + "'" +
            ", Tipo='" + getTipo() + "'" +
            "}";
    }
    
}
