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
public class Contacto {
    String nombre;
    int numero;

    public Contacto() {
        nombre="";
        numero=0;
    }

    public Contacto(String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String toString(){
        return "Contacto: "+nombre+" Número: "+numero;
    }
}
