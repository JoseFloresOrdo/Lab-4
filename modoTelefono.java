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
 *Descripción: El siguiente programa es la interfaz.
 *Laboratorio 4.
------------------------------------------------------------------
 * 
 * 
 * 
 */
public interface modoTelefono {
    public void conectado();
    public String mostrarConstactos();
    public String llamarContactos(int desicion);
    public String finalizarLlamadaEspera();
    public String cambiarLlamadaEspera();

    
}
