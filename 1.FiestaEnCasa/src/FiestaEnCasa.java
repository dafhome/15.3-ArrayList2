import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class FiestaEnCasa {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    String separador = "--------------------------------------------------------------------------------------";
    String frase1 = "Hola a todos! Como sabeis tenemos una fiesta en mi casa el próximo Sábado!";
    imprimir(frase1,0,1);
    
    String frase2 = ("Ya tenemos la lista de invitados preparada!");
    imprimir(frase2,0,1);

    ArrayList <String> fiesta = new ArrayList <String> (Arrays.asList("Michael", "Pepi", "Juan", "Ana", "Luis", "Maria", "Carlos", "Sofia", "Pedro", "Laura"));
    ArrayList <String> fiesta2 = new ArrayList <String> (Arrays.asList("David", "Elena", "Diego", "Lucia", "Alejandro", "Marta", "Javier", "Paula", "Adrian", "Sara"));
    enter(1);
    String frase3 = "La lista de la fiesta es:";
    imprimir(frase3, 0,1);
    imprimir(separador, 0,0);
    for (String persona : fiesta) {
        imprimir(persona,1,1);
        System.out.print(" ");
    }
    enter(3);
    imprimir("Finalmente Michael está de viaje y no podrá venir", 0, 1);
    imprimir(separador, 0, 0);
    fiesta.remove(0);
    for (String persona : fiesta) {
        imprimir(persona,1,1);
        System.out.print(" ");
    }

    enter(3);
    imprimir("Me ha llamado Pepi y me dice que vendrá su novio Silvester", 0, 1);
    imprimir(separador, 0, 0);
    fiesta.add("Silvester");
    for (String persona : fiesta) {
        imprimir(persona,1,1);
        System.out.print(" ");
    }

    enter(3);
    imprimir("Te encuentras a Eva, que dice que le cueles la tercera", 0, 1);
    imprimir(separador, 0, 0);
    fiesta.add(1,"Eva");
    for (String persona : fiesta) {
        imprimir(persona,1,1);
        System.out.print(" ");
    }
    enter(3);

    imprimir("Resulta que hay otra fiesta al lado la misma noche, con 10 personas más,  y toda esa gente dicen que les gusta vuestra música que se apuntan a tu fiesta!", 0, 1);
    imprimir(separador, 0, 0);
    fiesta.addAll(fiesta2);
    for (String persona : fiesta) {
        imprimir(persona,1,1);
        System.out.print(" ");
    }

    enter(3);

    imprimir("Lo siento mucho! Vamos a cambiaros el orden de entrada, ahora entrareis alfabeticamente porque somos muchos :)", 0, 1);
    imprimir(separador, 0, 0);

    Collections.sort(fiesta);
    for (String persona : fiesta) {
        imprimir(persona,1,1);
        System.out.print(" ");
    }
    enter(3);

    imprimir("¿Alguien recuerda si está Pedro en la lista?", 0, 1);
    boolean pedroLista = false;
    for (int i =0 ; i<fiesta.size();i++){
        if ("ped".equalsIgnoreCase(fiesta.get(i))) {
            pedroLista = true;
            i = fiesta.size();
        }
        
    }

    imprimir(separador, 0, 0);
    if (pedroLista) {
        imprimir("Pedro está en la lista! Gracias por revisarlo", 0, 1);
    }
    else{
        imprimir("Te has olvidado de Pedro! Dejaremos igualmente que entre a la fiesta", 0, 1);
    }




    

    }

    static void imprimir(String frase, int valor, int sleep){
        try{
            for (int i = 0; i<frase.length();i++){
                System.out.print(frase.charAt(i));
                if (sleep==1) {
                    Thread.sleep(30);    
                }
                
            }
            if (valor==0) {
                System.out.println(" ");
            }

        }catch (InterruptedException e){
            System.out.println(e);
        }   
    }
    static void enter(int cantidad){
        for(int i = 0;i<cantidad;i++){
            System.out.println();
        }
    }
    
}
