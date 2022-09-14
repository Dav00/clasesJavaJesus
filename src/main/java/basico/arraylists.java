package basico;

import java.util.ArrayList;
import java.util.HashMap;

public class arraylists {
    public static void main(String[] args) {
        //Array clasico
        int[] numeros = new int[10];
        numeros[0] = 10;
        numeros[1] = 3;

        //ArrayList
        ArrayList<Object> listaNombres = new ArrayList<>();
        listaNombres.add("Jose");
        listaNombres.add("Pepe");
        listaNombres.add(20);

        for (int i = 0; i < listaNombres.size(); i++){
            System.out.println(listaNombres.get(i));
        }
        System.out.println("--------");
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("-------");

        //HashMap
        HashMap<String, String> ingredientes = new HashMap<String, String>();
        ingredientes.put("Pizza", "Masa de pizza, tomate, jamón y queso.");
        ingredientes.put("Macarrones", "Macarrones tomate y queso.");
        ingredientes.put("Tortilla", "Huevos y aceite.");
        System.out.println(ingredientes.get("Pizza"));
        System.out.println(ingredientes.keySet());
        for (String clave : ingredientes.keySet()){
            System.out.println(ingredientes.get(clave));
        }
    }
}
