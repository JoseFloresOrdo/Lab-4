import java.util.ArrayList;
public class Admin implements modoRadio, modoReproduccion, modoTelefono, productividad {
    private Radio radio;
    private Telefono telefono;

    public Admin(){
        radio=new Radio();
        telefono= new Telefono();
    }
    @Override
    public String pronosticoClima() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void conectado() {
        // TODO Auto-generated method stub
        System.out.println("Conectado");
    }

    @Override
    public String mostrarConstactos() {
        // TODO Auto-generated method stub
        for (String i: telefono.getContactos()){
            return i;
        }
        return "No tienes contactos";
    }

    @Override
    public String llamarContactos(int desicion) {
        // TODO Auto-generated method stub
        int numero = (int)(Math.random()*10+1);
        telefono.setEstado("Activo");
        if (desicion == 1){
            return telefono.getContactos()[numero];
        }
        return telefono.getEstado();
    }

    @Override
    public String finalizarLlamadaEspera() {
        // TODO Auto-generated method stub
        telefono.setEstado("Finalizado");
        return telefono.getEstado();
    }

    @Override
    public String cambiarLlamadaEspera() {
        // TODO Auto-generated method stub
        telefono.setEstado("Espera");
        return telefono.getEstado();
    }

    @Override
    public String seleccionarPlaylist(int decision) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarCancion(boolean arriba) {
        return null;
        // TODO Auto-generated method stub
    }

    @Override
    public boolean estadoRadio() {
        
        return radio.getCanal();
    }

    @Override
    public int cambiarVolumen(boolean arriba) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String cambiarFrecuencia(String frecuencia) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public float cambiarEmisoras(boolean arriba) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void guardarEmisoras() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cargarEmisoras() {
        // TODO Auto-generated method stub
        
    }
    
}
