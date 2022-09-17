package oop.interfaces;

/**
 * Esta clase va a heredar camarero.
 * @author David
 */
public class CamareroLujo extends Camarero{
    public CamareroLujo(String nombre, int edad) {
        super(nombre, edad);
    }

    /**
     * Este metodo va a saludar al cliente
     */
    @Override
    public void saludarAlCliente() {
        System.out.println("Buenas tardes señor.");
    }

    /**
     * Saludaremos al cliente por su nombre
     * @param nombre
     */
    public void saludarPorNombre(String nombre){
        System.out.println("Buenas " + nombre);
    }
}
