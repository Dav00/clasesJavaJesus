package oop.herencia;

import javax.swing.*;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class Programador extends Empleado{
    /*
    HEREDADO:
        String codigoEmpleado;
        String nombre;
        double sueldoAnual;
     */
    ArrayList<String> lenguajesProgramacion;
    boolean programaEnRemoto;

    public Programador(String codigoEmpleado, String nombre, double sueldoAnual,
                       boolean programaEnRemoto){
        //Llamamos al constructor del padre
        super(codigoEmpleado, nombre, sueldoAnual);
        lenguajesProgramacion = new ArrayList<String>();
        this.programaEnRemoto = programaEnRemoto;
    }
    public Programador(String codigoEmpleado, String nombre, double sueldoAnual){
        super(codigoEmpleado, nombre, sueldoAnual);
        lenguajesProgramacion = new ArrayList<String>();
    }
    public void agregarLenguaje(String nuevoLenguaje){
        lenguajesProgramacion.add(nuevoLenguaje);
    }

    public ArrayList<String> getLenguajesProgramacion() {
        return lenguajesProgramacion;
    }

    public void setLenguajesProgramacion(ArrayList<String> lenguajesProgramacion) {
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

    public boolean isProgramaEnRemoto() {
        return programaEnRemoto;
    }

    public void setProgramaEnRemoto(boolean programaEnRemoto) {
        this.programaEnRemoto = programaEnRemoto;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldoAnual=" + sueldoAnual +
                ", lenguajesProgramacion=" + lenguajesProgramacion +
                ", programaEnRemoto=" + programaEnRemoto +
                '}';
    }
}
