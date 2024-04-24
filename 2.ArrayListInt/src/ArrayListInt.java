import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInt {
    public static void main(String[] args) throws Exception {

        // 2- ArrayList de números enteros:
        // • Pedir cuantos números quiere el usuario entrar
        // • Hacer entrada de datos (números) en el bucle
        // • Cuando tengas el ArrayList completo, hacer la media de todos los números y
        // dar ese resultado en
        // pantalla
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        imprimir("Vamos a imprimir tomar la lista de números que me indiques y calcularemos la media", 1, 1);
        imprimir("Cuantos números quieres en tu lista? ", 0, 1);
        
        int cantidadNumeros = scan.nextInt();
        scan.nextLine();
        System.out.println("----------------------------------------------------------------------------");
        imprimir("Ahora necesito que me vayas diciendo uno a uno los números de tu lista. Recuerda que has elegido que sean "+cantidadNumeros, 1 , 1);
        enter(1);
        for (int i = 0; i<cantidadNumeros; i++){
            imprimir("Indicame el número "+(i+1)+": ", 0, 1);
            numeros.add(scan.nextInt());
        }
        int sumaNumeros = 0;
        for (Integer numero : numeros) {
            sumaNumeros += numero;
        }
        enter(1);
        float media = (float) sumaNumeros/numeros.size();
        imprimir("La media es: "+media, 1, 1);
    }

    static void imprimir(String frase, int enter, int sleep) {
        try {
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
                if (sleep == 1) {
                    Thread.sleep(20);
                }

            }
            if (enter == 1) {
                System.out.println(" ");
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    static void enter(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println();
        }
    }
}
