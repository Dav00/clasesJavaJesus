package oop.interfaces.Animales;

public class Rata implements IRoedor{
    int numeroDeEnfermedades;
    double longitudCola;

    public int getNumeroDeEnfermedades() {
        return numeroDeEnfermedades;
    }

    @Override
    public String toString() {
        return "Rata{" +
                "numeroDeEnfermedades=" + numeroDeEnfermedades +
                ", longitudCola=" + longitudCola +
                '}';
    }

    public void setNumeroDeEnfermedades(int numeroDeEnfermedades) {
        this.numeroDeEnfermedades = numeroDeEnfermedades;
    }

    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public Rata(int numeroDeEnfermedades, double longitudCola) {
        this.numeroDeEnfermedades = numeroDeEnfermedades;
        this.longitudCola = longitudCola;
    }

    @Override
    public void crearMadriguera() {
        System.out.println("Estoy creando una madriguera arañando la pared 🐀🐀");
    }

    @Override
    public void aprenderseNombre(String nombre) {
        System.out.println("No me voy a aprender mi nombre, sorry.");
    }
}
