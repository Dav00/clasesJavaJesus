package deberes1;

import java.util.ArrayList;
import java.util.HashMap;

public class MisArrays {
    public static void main(String[] args) {
    //Array:
    int[] miArray = new int[5];
    miArray[3] = 66;
    miArray[4] = 77;
    for (int i = 0; i < 5; i++) {
        System.out.println(miArray[i]);
    }
    System.out.println("---------");

    //ArrayList:

    //Creación
    ArrayList<Object> miArrayList = new ArrayList<>();

    //Métodos (add, get, size, remove)
    miArrayList.add("Roma");
    miArrayList.add("Tokio");
    miArrayList.add(85);

    System.out.println(miArrayList); // muestra el arraylist
    System.out.println(miArrayList.get(0)); // dime el primero

    miArrayList.remove("Roma");
    System.out.println(miArrayList); // muestra

    for (int i = 0; i < miArrayList.size(); i++) {
        System.out.println(miArrayList.get(i));
    }
    System.out.println("-------");

    //HashMap:

    //Creación
    HashMap<String, Integer> miHashMap = new HashMap<String, Integer>();

    //Métodos (put, get, size, keySet, values)
        miHashMap.put("Número", 123);
        miHashMap.put("Piso", 4);
        miHashMap.put("Puerta", 8);

        System.out.println(miHashMap.size());
        System.out.println(miHashMap.get("Número")); // pones key y muestra su value
        System.out.println(miHashMap.keySet()); //muestra keys
        //^ ¿POR QUÉ HAN SALIDO DESORDENADAS?
        System.out.println(miHashMap.values()); //muestra values

        //Iterar las keys:
        for(String i: miHashMap.keySet()){
            System.out.println(i);
        }
        //Iterar los values:
        for(int k: miHashMap.values()){
            System.out.println(k);
        }
        //Iterar para obtener keys y values:
        for(String key: miHashMap.keySet()){
            System.out.println(key + ": " + miHashMap.get(key));
        }

    }
}
