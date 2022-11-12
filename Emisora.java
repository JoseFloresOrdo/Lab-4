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

    
    /** 
     * @return boolean
     */
    public boolean isCanal() {
        return this.canal;
    }

    
    /** 
     * @return boolean
     */
    public boolean getCanal() {
        return this.canal;
    }

    
    /** 
     * @param canal
     */
    public void setCanal(boolean canal) {
        this.canal = canal;
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
    public String getFrase() {
        return this.Frase;
    }

    
    /** 
     * @param Frase
     */
    public void setFrase(String Frase) {
        this.Frase = Frase;
    }

    
    /** 
     * @return float
     */
    public float getTipo() {
        return this.Tipo;
    }

    
    /** 
     * @param Tipo
     */
    public void setTipo(float Tipo) {
        this.Tipo = Tipo;
    }

 
    
    /** 
     * @return String
     */
    public String toString() {
        return Nombre+" "+Frase+" "+Tipo+" "+canal;
    }
    
}
