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
 *Descripción: El siguiente programa es el controlador.
 *Laboratorio 4.
------------------------------------------------------------------
 * 
 * 
 * 
 */
import java.util.Random;
import java.util.ArrayList;
public class Admin implements modoRadio, modoReproduccion, modoTelefono, productividad {
    private Radio radio;
    private Telefono telefono;
    private int ind;
    private ArrayList<Cancion> playlist1;
    private int numcancion;
    public Admin(){
        radio=new Radio();
        telefono= new Telefono();
        ind=0;
        playlist1= new ArrayList<Cancion>();
        numcancion=0;
    }
     
    
    /** 
     * @return String
     */
    public String pronosticoClima() {
        Random random= new Random();
       String str="";
        int tiempo= random.nextInt(5);
        if(tiempo==0){
            str="La temperatura es de 24C con un 88% de probabilidad de lluvia. Soleado, buen día para usar gafas de sol.";
        }
        else if(tiempo==1){
            str="La temperatura es de 20C con un 90% de probabilidad de lluvia. Nublado. Abrígate";
        }
        else if(tiempo==2){
            str="La temperatura es de 40C con un 20%";
        }
        else if(tiempo==3){

        }
        else if(tiempo==4){

        }
        else if(tiempo==5){

        }
        return str;
    }

     
    public void conectado() {
        // TODO Auto-generated method stub
        
    }

     
    
    /** 
     * @return String
     */
    public String mostrarConstactos() {
        String str="Lista de contactos \n";
        for (Contacto contacto: telefono.getContactos()){
            str+=contacto.toString()+"\n";
        }
        return str;
        
    }

     
    
    /** 
     * @param desicion
     * @return String
     */
    public String llamarContactos(int desicion) {
        
        telefono.setEstado("Activo");
        if ( telefono.getContactos()[desicion]!=null){
            return "Llamando a... "+telefono.getContactos()[desicion].toString();
        }
        else if(telefono.getContactos()[desicion]==null){
            return "No tiene más contactos";
        }
        return "No tiene más contactos";
        
    }

     
    
    /** 
     * @return String
     */
    public String finalizarLlamadaEspera() {
        if(telefono.getEstado().equals("Activo")){
            telefono.setEstado("Finalizado");
        }
        else{
            return "Su teléfono no está en llamada";
        }
        return telefono.getEstado();
        
    }

     
    
    /** 
     * @return String
     */
    public String cambiarLlamadaEspera() {
        telefono.setEstado("Espera");
        return telefono.getEstado();
    }

     
    
    /** 
     * @param decision
     * @return String
     */
    public String seleccionarPlaylist(int decision) {
        String str="";
        if(decision==1){
            numcancion=0;
            playlist1.clear();
            playlist1.add(new Cancion("Walk", "Pantera",(float)5.16));
            playlist1.add(new Cancion("Fear of the Dark","Iron Maiden",(float) 7.19));
            playlist1.add(new Cancion("Be Quick or Be Dead","Iron Maiden",(float) 3.25));
            playlist1.add(new Cancion("The Trooper","Iron Maiden",(float) 4.24));
            playlist1.add(new Cancion("N.I.B.","Black Sabbath",(float) 6.07));
            playlist1.add(new Cancion("Iron Man","Black Sabbath",(float) 5.54));
            str="Playlist de metal "+"\nReproduciendo:"+playlist1.get(0).getNombre()+" "+playlist1.get(0).getArtista()+" "+playlist1.get(0).getDuracion();
        }
        else if(decision==2){
            numcancion=0;
            playlist1.clear();
            playlist1.add(new Cancion("Die for you", "joji",(float) 3.22));
            playlist1.add(new Cancion("Level of concern","Twenty One Pilots",(float) 3.53));
            playlist1.add(new Cancion("Smithereens","Twenty One Pilots",(float) 2.58));
            playlist1.add(new Cancion("Gimme Love","joji",(float) 3.46));
            playlist1.add(new Cancion("Miss you","Blink-182",(float) 3.50));
            str="Playlist R&B y rock"+"\nReproduciendo:"+playlist1.get(0).getNombre()+" "+playlist1.get(0).getArtista()+" "+playlist1.get(0).getDuracion();
        }
        return str;
    }

    
    
    /** 
     * @param arriba
     * @return String
     */
    public String cambiarCancion(boolean arriba) {
        String str="";
        try {
            if(arriba==true){
                numcancion++;
                
                    if(playlist1.get(numcancion)!=null){
                        str="Reproduciendo:"+playlist1.get(numcancion).getNombre()+" Artista: "+playlist1.get(numcancion).getArtista()+" Duración:"+playlist1.get(numcancion).getDuracion();
                    }
                
                
                
            }
            else if(arriba==false){
                numcancion--;
                if(playlist1.get(numcancion)!=null){
                    
                        str="Reproduciendo:"+playlist1.get(numcancion).getNombre()+" Artista: "+playlist1.get(numcancion).getArtista()+" Duración"+playlist1.get(numcancion).getDuracion();    
                    
                    
                }
            }
            
        } catch (Exception e) {
            return "No puede hacer eso";
        }
        return str;
    }

     
    
    /** 
     * @return boolean
     */
    public boolean estadoRadio() {

        if(radio.getEncendida()==true){
            radio.setEncendida(false);
        }
        else if(radio.getEncendida()==false){
            radio.setEncendida(true);
        }
        return radio.getEncendida();
    }

    
    
    /** 
     * @param arriba
     * @return int
     */
    public int cambiarVolumen(boolean arriba) {
        if(arriba==true){
            radio.setVolumen(radio.getVolumen()+1);
        }
        else if(arriba==false){
            radio.setVolumen(radio.getVolumen()-1);
        }
        return radio.getVolumen();
    }

     
    
    /** 
     * @param frecuencia
     * @return String
     */
    public String cambiarFrecuencia(String frecuencia) {
        if (radio.isEncendida() == true){
            if(frecuencia.equals("AM")){
                radio.setCanal(true);
                return "AM";
            }
            else if(frecuencia.equals("FM")){
                radio.setCanal(false);
                return "FM";
            }
        }
        
        return "Su radio está apagada";
    }

     
    
    /** 
     * @param arriba
     * @return float
     */
    public float cambiarEmisoras(boolean arriba) {
        float tipo=0;
        if (radio.isEncendida() == true){
            if(arriba==true ){
                ind++;
                if(radio.tomaremisora()[ind]!=null){
                    tipo=radio.tomaremisora()[ind].getTipo();
                }
                
                
            }
            else if(arriba==false ){
                ind--;
                if(radio.tomaremisora()[ind]!=null){
                    tipo=radio.tomaremisora()[ind].getTipo();
                }
            }
            else if(radio.tomaremisora()[ind]==null){
                return 0;
            }  
        }
        return tipo;
    }

     
    public void guardarEmisoras() {
        if (radio.isEncendida() == true){
            radio.guardarEmisora(radio.tomaremisora()[ind]);
        }
    }

     
    
    /** 
     * @param i
     * @return String
     */
    public String cargarEmisoras(int i) {
        for(Emisora emisora: radio.getGuardados()){
            if(radio.getGuardados()[i]!=null){
                return emisora.toString();
            }
        }

        
        return "No tiene ninguna emisora guardada en esa posición";
        
        
    }

    
    /** 
     * @return String
     */
    @Override
    public String mostrarPlaylists() {
        
        return "1) Playlist de metal 2) Playlist de R&B y rock";
    }
    
}
