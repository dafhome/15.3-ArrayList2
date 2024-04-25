import java.util.ArrayList;

public class BuscarE {
    public static void main(String[] args) throws Exception {
        // 3- En la siguiente frase:
        // String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";
        // Decir si existe la letra "e", cuántas veces aparece, y en qué posiciones.
        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente. E";
        ArrayList <Integer> posiciones = new ArrayList<>();
        String indices = "";

        for (int i = 0; i<fraseAleatoria.length();i++){
            if (fraseAleatoria.charAt(i)=='e'||fraseAleatoria.charAt(i)=='E') {
                posiciones.add(i);
            }
        }

        for (int i = 0; i<posiciones.size();i++){

            indices += posiciones.get(i);
            if (i==(posiciones.size()-2)) {
                indices+=" y ";
            }
            else if (i<(posiciones.size()-1)){
                indices+=", ";
            }
            else{
                indices+=".";
            }

        }

        imprimir("Vamos a buscar cuantas veces aparece la letra e en la frase:", 1, 1);
        System.out.println();
        imprimir(fraseAleatoria, 1, 1);
        System.out.println();
        imprimir("En esta frase tenemos "+posiciones.size()+" veces la letra e y están en las posiciones "+indices, 1, 1);
        // System.out.println("En esta frase tenemos "+posiciones.size()+" veces la letra e y están en las posiciones "+indices);

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
}
