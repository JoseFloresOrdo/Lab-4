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
 *Descripción: El siguiente programa es modelo.
 *Laboratorio 4.
------------------------------------------------------------------
 * 
 * 
 * 
 */
public class Telefono {
    private Contacto[] contactos;
    private String estado;

    public Telefono(){
        estado= "";
        contactos= new Contacto[]{new Contacto("Prezi",22325569),new Contacto("Paolo",55887744),new Contacto("Allen",55992251)};
    }

    public Contacto[] getContactos() {
        return this.contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
