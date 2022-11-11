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
