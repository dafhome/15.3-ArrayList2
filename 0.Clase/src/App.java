import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ***** CREATE *****
        //Método ADD(valor)
        ArrayList <String> listaCompra = new ArrayList<>();
        

        
        // Para números enteros sería <Integer>:
        // ArrayList <Integer> precios = new ArrayList<>();

        listaCompra.add("pera");
        listaCompra.add("manzana");
        listaCompra.add("melón");
        listaCompra.add("naranja");
        listaCompra.add("banana");
        listaCompra.add(2, "aguacate"); //insertar
        listaCompra.add("zanahoria");
        // ***** READ *****
        // método GET(indice)
        System.out.println(listaCompra.get(3));
        System.out.println(listaCompra); // por debajo, usa el método toString()
        //toString() se puede sobreescribir para personalizarlo

        // para imprimirlo mediante bucle for normal:
        System.out.println("imprimir mediante bucle for:");
        for(int i=0; i<listaCompra.size(); i++){
            System.out.println(listaCompra.get(i));
        }

        // y mediante el bucle for-each:
        System.out.println("imprimir mediante bucle for-each:");
        for(String fruta: listaCompra){
            System.out.println(fruta);
        }

        // ***** UPDATE *****
        // método SET(indice, nuevo valor)
        // si no existe el indice
        listaCompra.set(3, "mandarina");
        System.out.println(listaCompra);

        // ***** DELETE *****
        // método remove(indice)
        listaCompra.remove(3);
        System.out.println(listaCompra);

        /* 
        //*** hacer null ***
        listaCompra.set(3, null);
        System.out.println(listaCompra);

        // *** clear() para vaciarlo:
        listaCompra.clear();
        System.out.println(listaCompra);
        */


        /***** MAS METODOS ARRAYLIST ***** */
        //INSERTAR VALORES DIRECTAMENTE:
        ArrayList <String> listaCompra2 = new ArrayList<String>(Arrays.asList("trigo", "cebada", "avena", "espelta", "zanahoria", "centeno"));
        System.out.println("lista2 creada con Arrays.asList:");
        System.out.println(listaCompra2);

        // ordenar mediante sort()
        // necesita importar la clase Collections
        Collections.sort(listaCompra2);
        System.out.println("lista ordenada:");
        System.out.println(listaCompra2);

        // metodo addAll() permite incluir todos los valores de un arraylist en otro
        // si el primero estuviera vacio seria como hacer una copia del arraylist
        ArrayList <String> listaCompraFinal = new ArrayList<>();
        listaCompraFinal.addAll(listaCompra);
        listaCompraFinal.addAll(listaCompra2);

        
        Collections.sort(listaCompraFinal);
        System.out.println("lista total y ordenada:");
        System.out.println(listaCompraFinal);

        //equals me da true or false si coinciden o no dos arrays o elementos
        System.out.println(listaCompra.equals(listaCompraFinal)); // da false


        // buscar un valor en específico con equals:
        // existe zanahoria?
        // boolean encontrado = false;

        // // while(!encontrado){

        // // }
        // for(int i=0; i<listaCompraFinal.size(); i++){
        //     if(listaCompraFinal.get(i).equals("zanahoria")){
        //         encontrado = true;
        //         totalZanahorias++; //cantidad zanahorias encontradas
        //     } 
        // }

        // if(encontrado){
        //     System.out.println("Zanahoria encontrada!");
        // } else {
        //     System.out.println("zanahoria NO encontrada!");
        // }

        
        // existe contains(valor) que ya lo busca solo
        // si no lo encuentra, el valor es -1
        if(listaCompraFinal.contains("zanahoria")){
            System.out.println("Zanahoria encontrada!");
        } else {
            System.out.println("zanahoria NO encontrada!");
        }
        System.out.println("posición zanahoria con index of:");
        System.out.println(listaCompraFinal.indexOf("zanahoria"));
        System.out.println("con last index of:");
        System.out.println(listaCompraFinal.lastIndexOf("zanahoria"));
        System.out.println(listaCompra.isEmpty()); //true or false
        
        //indexof tambien sirve para Strings:
        String fraseAleatoria = "Erase una vez un planeta tan lejano que no se sabía ni que existe";
        System.out.println(fraseAleatoria.indexOf("e"));
    }
}
