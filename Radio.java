public class Radio {

    private float Frecuencia;
    private boolean Canal;
    private String[] Emisora;
    private int Volumen;

    public Radio() {
        Frecuencia = 0;
        Canal = false;
        Emisora = new String[50];
        Volumen = 0;
    }

    public Radio(float Frecuencia, boolean Canal, String[] Emisora, int Volumen) {
        this.Frecuencia = Frecuencia;
        this.Canal = Canal;
        this.Emisora = Emisora;
        this.Volumen = Volumen;
    }

    public float getVolumen(){
        return this.Volumen;
    }

    public void setVolumen(int Volumen){
        this.Volumen = Volumen;
    }
    
    public float getFrecuencia() {
        return this.Frecuencia;
    }

    public void setFrecuencia(float Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public boolean isCanal() {
        return this.Canal;
    }

    public boolean getCanal() {
        return this.Canal;
    }

    public void setCanal(boolean Canal) {
        this.Canal = Canal;
    }

    public String[] getContactos() {
        return this.Emisora;
    }

    public void setContactos(String[] Emisora) {
        this.Emisora = Emisora;
    }

    @Override
    public String toString() {
        return "{" +
            " Frecuencia='" + getFrecuencia() + "'" +
            ", Canal='" + isCanal() + "'" +
            ", Contactos='" + getContactos() + "'" +
            "}";
    }
    
}
