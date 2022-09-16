package deberes1;

public class Coche{

    //Atributos:
    String marca;
    String modelo;
    int potencia;

    //Métodos:

    //Constructor
    public Coche (String marca, String modelo, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    //Setters (siempre void)
    public void setMarca(String nuevaMarca){
        this.marca = nuevaMarca;
    }

    public void setModelo(String nuevoModelo){
        this.modelo = nuevoModelo;
    }

    public void setPotencia(int nuevaPotencia){
        this.potencia = nuevaPotencia;
    }


    //Getters (siempre return)

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getPotencia(){
        return potencia;
    }
}