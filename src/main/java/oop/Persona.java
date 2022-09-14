package oop;

public class Persona {
    //Atributos
    int id;
    String nombre;
    int edad;
    double altura;

    //Metodos
    public Persona(String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    /*public Persona(){
        this.nombre = "Jose";
        this.edad = 20;
        this.altura = 1.50;
    }*/
    public Persona(int edad){
        this.nombre = "Jose";
        this.edad = edad;
        this.altura = 1.50;
    }
    public Persona(){

    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setEdad(int edadNueva) {
        this.edad = edadNueva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void saludar(){
        System.out.println("Hola me llamo "+ this.nombre);
    }
}
