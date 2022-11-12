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
public interface modoRadio {

    public boolean estadoRadio();
    public int cambiarVolumen(boolean arriba);
    public String cambiarFrecuencia(String frecuencia);
    public float cambiarEmisoras(boolean arriba);
    public void guardarEmisoras();
    public String cargarEmisoras(int i);
}