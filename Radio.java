public class Radio {
    private boolean encendida;
    private float Frecuencia;
    private boolean Canal;
    private Emisora[] Emisora;
    private int Volumen;
   private Emisora[] guardados;
    public Radio() {
        Frecuencia = 0;
        Canal = false;
        Emisora = new Emisora[]{new Emisora("La joya","La mejor",(float)0.5,true), new Emisora("La bendición","La mejor mejor",(float) 1,true), new Emisora("Math","Matebuena",(float) 1.5,false), new Emisora("Bar","Muy buena",(float) 2,false)};
        Volumen = 0;
        guardados= new Emisora[50];
        encendida= false;
    }

    public boolean isEncendida() {
        return this.encendida;
    }

    public boolean getEncendida() {
        return this.encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    public void setEmisora(Emisora[] Emisora) {
        this.Emisora = Emisora;
    }

    public Emisora[] getGuardados() {
        return this.guardados;
    }

    public void setGuardados(Emisora[] guardados) {
        this.guardados = guardados;
    }

    public Radio(float Frecuencia, boolean Canal, int Volumen) {
        this.Frecuencia = Frecuencia;
        this.Canal = Canal;
        this.Emisora = new Emisora[50];
        this.Volumen = Volumen;
    }

    public Emisora getEmisora(int ind){
        return Emisora[ind];
    }
    public void guardarEmisora(Emisora emisora){
       for(int i=0; i<50; i++){
        if(guardados[i]==null){
            guardados[i]=emisora;
        }
       }
    }
    public Emisora getGuardado(int num){
        return guardados[num];
    }
    public Emisora[] tomaremisora(){
        Emisora[] canemisora= new Emisora[50];
        int i=0;
        if(Canal==true){
            for(Emisora emisora: Emisora){
                if (emisora.getCanal()==true){
                    canemisora[i]=emisora;
                    i++;
                }
            }
        }
        else if(Canal==false){
            for(Emisora emisora: Emisora){
                if (emisora.getCanal()==false){
                    canemisora[i]=emisora;
                    i++;
                }
            }
        }
        return canemisora;
    }

    public int getVolumen(){
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

    public Emisora[] getContactos() {
        return this.Emisora;
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
