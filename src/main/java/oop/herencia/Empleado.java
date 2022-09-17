package oop.herencia;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Empleado {
    //Atributos -> Datos
    String codigoEmpleado;
    String nombre;
    double sueldoAnual;

    public Empleado(String codigoEmpleado, String nombre, double sueldoAnual) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.sueldoAnual = sueldoAnual;
    }
    //Constructor por defecto.
    public Empleado(){

    }
    //Metodos -> Comportamiento
    public void fichar(){
        System.out.println("He fichado a las " + LocalDateTime.now());
    }
    public void irseACasa(){
        System.out.println("Me voy a casa, chao.");
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoAnual() {
        return sueldoAnual;
    }

    public void setSueldoAnual(double sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldoAnual=" + sueldoAnual +
                '}';
    }
}
