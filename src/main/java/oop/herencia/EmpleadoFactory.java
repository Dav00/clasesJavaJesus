package oop.herencia;

public class EmpleadoFactory {
    //Constructor
    public EmpleadoFactory(){

    }
    //Metodo
    public Empleado generateEmployee(String codigoEmpleado, String nombre,
                     double sueldoAnual){
        if(nombre.contentEquals("Pepito")){
            System.out.println("Hola pepito");
        }
        if(codigoEmpleado.charAt(codigoEmpleado.length() - 1) == 'E'){
            return new Empleado(codigoEmpleado, nombre, sueldoAnual);
        }
        else if(codigoEmpleado.charAt(codigoEmpleado.length() - 1) == 'P'){
            return new Programador(codigoEmpleado, nombre, sueldoAnual, false);
        }
        else{
            return null;
        }
    }
}
