package oop.interfaces;
/*
Las clases abstractas son una mezlca entre interfaces y Clases al uso.
Nos permiten
 */

/**
 * @author David
 *
 */
public abstract class Camarero {
    String nombre;
    int edad;

    public Camarero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void saludarAlCliente();

    public void recitarCarta(){
        System.out.println("La carta es ....");
    }
}
