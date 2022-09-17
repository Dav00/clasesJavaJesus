package oop.interfaces.Animales;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Capibara c1 = new Capibara("Majete");
        Rata r1 = new Rata(10, 1);
        r1.crearMadriguera();
        r1.aprenderseNombre("Jose Antonio");
        c1.crearMadriguera();
        c1.andarPorElSueldo();
        c1.aprenderseNombre("Jose Antonio");
        ArrayList<IRoedor> listaRoedores = new ArrayList<IRoedor>();
        listaRoedores.add(c1);
        listaRoedores.add(r1);
        System.out.println(listaRoedores);
    }
}
