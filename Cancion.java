/*
 * ------------------------------------------------------------------
 *Universidad del Valle de Guatemala
 *Facultad de Ingeniería
 *Programación orientada a objetos
 *Catedrática: Lynette
 *Auxiliar: Ayleen
 *Ciclo II - 2022
 *Sección: 40
 *Autor: Allen Estuardo Ramírez De Paz, 22326
 José Javier Flores Ordoñez, 22730
 *Fecha: Noviembre 2022
 *Descripción: El siguiente programa es un modelo.
 *Laboratorio 4.
------------------------------------------------------------------
 * 
 * 
 * 
 */
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

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.Nombre;
    }

    
    /** 
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    /** 
     * @return String
     */
    public String getArtista() {
        return this.Artista;
    }

    
    /** 
     * @param Artista
     */
    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    
    /** 
     * @return float
     */
    public float getDuracion() {
        return this.Duracion;
    }

    
    /** 
     * @param Duracion
     */
    public void setDuracion(float Duracion) {
        this.Duracion = Duracion;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Artista='" + getArtista() + "'" +
            ", Duracion='" + getDuracion() + "'" +
            "}";
    }
    
}
