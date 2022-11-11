public class Telefono {
    private String[] contactos;
    private String estado;

    public Telefono(){
        estado= "";
        contactos= new String[50];
    }

    public String[] getContactos() {
        return this.contactos;
    }

    public void setContactos(String[] contactos) {
        this.contactos = contactos;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
