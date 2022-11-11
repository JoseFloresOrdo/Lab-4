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

     
    public String mostrarConstactos() {
        for (String i: telefono.getContactos()){
            return i;
        }
        return "No tienes contactos";
        
    }

     
    public String llamarContactos(int desicion) {
        int numero = (int)(Math.random()*10+1);
        telefono.setEstado("Activo");
        if (desicion == 1){
            return telefono.getContactos()[numero];
        }
        return telefono.getEstado();
        
    }

     
    public String finalizarLlamadaEspera() {
        telefono.setEstado("Finalizado");
        return telefono.getEstado();
        
    }

     
    public String cambiarLlamadaEspera() {
        telefono.setEstado("Espera");
        return telefono.getEstado();
    }

     
    public String seleccionarPlaylist(int decision) {
        String str="";
        if(decision==1){
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

     
    public boolean estadoRadio() {

        if(radio.getEncendida()==true){
            radio.setEncendida(false);
        }
        else if(radio.getEncendida()==false){
            radio.setEncendida(true);
        }
        return radio.getEncendida();
    }

    
    public int cambiarVolumen(boolean arriba) {
        if(arriba==true){
            radio.setVolumen(radio.getVolumen()+1);
        }
        else if(arriba==false){
            radio.setVolumen(radio.getVolumen()-1);
        }
        return radio.getVolumen();
    }

     
    public String cambiarFrecuencia(String frecuencia) {
        
        if(frecuencia.equals("AM")){
            radio.setCanal(true);
            return "AM";
        }
        else if(frecuencia.equals("FM")){
            radio.setCanal(false);
            return "FM";
        }
        return "Ingrese una opción válida";
    }

     
    public float cambiarEmisoras(boolean arriba) {
        float tipo=0;
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

        return tipo;
    }

     
    public void guardarEmisoras() {
        radio.guardarEmisora(radio.tomaremisora()[ind]);
        
    }

     
    public void cargarEmisoras() {
        
        
        
        
    }
    
}
