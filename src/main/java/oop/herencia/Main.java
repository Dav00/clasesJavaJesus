package oop.herencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("001E",
                "David", 24000);
        Programador p1 = new Programador("001P", "Jose",
                32000, true);
        p1.agregarLenguaje("Java");
        p1.agregarLenguaje("JavaScript");
        System.out.println(p1);
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(e1);
        listaEmpleados.add(p1);
        System.out.println("Lista Empleados: \n"+listaEmpleados.toString());
        ArrayList<Empleado> listaEmpleadosFactory = new ArrayList<Empleado>();
        EmpleadoFactory ef = new EmpleadoFactory();
        listaEmpleadosFactory.add(ef
                .generateEmployee("001P","Jose",45000));
        listaEmpleadosFactory.add(ef
                .generateEmployee("001E","Pepito",41000));
        System.out.println(listaEmpleadosFactory);
    }
}
