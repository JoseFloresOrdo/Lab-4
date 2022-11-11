import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        boolean menu= true;
        int opc=0;
        Scanner teclado= new Scanner(System.in);
        String amarillo= "\u001B[33m";
        String morado= "\u001B[35m";
        String reset= "\u001B[0m";
        String red="\u001B[31m";
        String verde="\u001B[32m";
        System.out.println("Bienvenido al coche Clase C\n ");
        while(menu==true){
            System.out.println("¿Qué hará hoy?\n1) Encender/Apagar radio   2)Subir/bajar volumen   3)Cambiar AM/FM  4)Subir/Bajar Emisora\n5)Guardar emisora actual  6)Cargar emisora   7)Elegir Playlist   8)Cambiar canción\n9)");
            opc= teclado.nextInt();
            teclado.nextLine();
            if(opc==1){
                
                if(admin.estadoRadio()==true){
                    System.out.println(amarillo+"La radio ha sido encendida"+reset);
                }
                else {
                    System.out.println(amarillo+"La radio ha sido apagada"+reset);
                }
            }
            else if(opc==2){
                System.out.println("¿Desea subir(true) o bajar(false) volumen?"+reset);
                boolean arriba= teclado.nextBoolean();
                teclado.nextLine();
                System.out.println(amarillo+"Nuevo volumen: "+admin.cambiarVolumen(arriba)+reset);
            }
            else if(opc==3){
                System.out.println("¿Desea AM o FM (escríbalo tal cual)?"+reset);
                String frecuencia= teclado.nextLine();
                System.out.println(amarillo+"Se ha cambiado a: "+admin.cambiarFrecuencia(frecuencia)+reset);
            }
            else if(opc==4){
                System.out.println("¿Desea subir(true) o bajar(false) emisora?"+reset);
                boolean arriba= teclado.nextBoolean();
                teclado.nextLine();
                System.out.println(amarillo+"Frecuencia: "+admin.cambiarEmisoras(arriba)+reset);
            }
            else if(opc==5){
                System.out.println(verde+"Se ha guardado correctamente la emisora"+reset);
                admin.guardarEmisoras();
            }
            else if(opc==6){

            }
            else if(opc==7){
                System.out.println("1) Playlist de metal\n2) Playlist de R&B y rock");
                int playlist= teclado.nextInt();
                teclado.nextLine();
                System.out.println(amarillo+admin.seleccionarPlaylist(playlist)+reset);
            }
            else if(opc==8){
                System.out.println("¿Desea subir(true) o bajar(false)?");
                boolean arriba= teclado.nextBoolean();
                teclado.nextLine();
                System.out.println(amarillo+admin.cambiarCancion(arriba)+reset);
            }
        }
    }
}