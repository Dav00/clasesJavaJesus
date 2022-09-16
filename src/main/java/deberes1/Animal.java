package deberes1;

public class Animal {

    //Atributos:
    String nombre;
    String clase;
    int numeroDePatas;

    //Métodos:

    //Constructores (puede haber varios)
    public Animal(String nombre, String clase, int numeroDePatas){
        this.nombre = nombre;
        this.clase = clase;
        this.numeroDePatas = numeroDePatas;
    }
    public Animal(){
        this.nombre = "Perro";
        this.clase = "Mamífero";
        this.numeroDePatas= 4;
    }


    public void comunicarse(){
        System.out.println("'Hey! I can talk!'");
    }
    public void comer(){System.out.println("'Ñam, ñam...'");
    }
    public void dormir(){System.out.println("'Zzzzz...'");
    }

    //Setters (siempre void)
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setClase(String nuevaClase){
        this.clase = nuevaClase;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    //Getters (siempre return)
    public String getNombre(){
        return nombre;
    }
    public String getClase() {
        return clase;
    }
    public int getNumeroDePatas() {
        return numeroDePatas;
    }
}
