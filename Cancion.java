public class Cancion {

    private String Nombre;
    private String Artista;
    private float Duracion;

    public Cancion() {
        Nombre = "";
        Artista = "";
        Duracion = 0;
    }

    public Cancion(String Nombre, String Artista, float Duracion) {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.Duracion = Duracion;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtista() {
        return this.Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public float getDuracion() {
        return this.Duracion;
    }

    public void setDuracion(float Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Artista='" + getArtista() + "'" +
            ", Duracion='" + getDuracion() + "'" +
            "}";
    }
    
}
