package oop.interfaces.Animales;

public class Capibara implements IRoedor, IAlimanna{
    String nombre;

    public Capibara(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void crearMadriguera() {
        System.out.println("Creada: 🛖");
    }

    @Override
    public void aprenderseNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void andarPorElSueldo() {
        System.out.println("Ando por el suelo... 🦍");
    }

    @Override
    public String toString() {
        return "Capibara{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
