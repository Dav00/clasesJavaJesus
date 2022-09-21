package dia3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        //¿Como funciona el control de excepciones?
        //Código que puede dar error en tiempo de ejecución
        int auxiliar;
        Scanner input = new Scanner(System.in);
        try{
            input.close();
            auxiliar = input.nextInt();
            System.out.println(auxiliar);
        }
        catch (InputMismatchException e){
            System.err.println("Error por conversion de tipo.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Holii!");
    }
}
